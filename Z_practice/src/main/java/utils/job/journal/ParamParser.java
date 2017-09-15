package utils.job.journal;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.*;

/**
 * 此类使用递归，神奇，维护勿动！
 *
 * @auther chengshaojin
 * @since 2016/12/30
 */
public class ParamParser {

    private static boolean isLogic(String text) {
        if ("OPR".equalsIgnoreCase(text)) {
            return true;
        }
        return false;
    }

    private static boolean isJsonObject(String text) {
        try {
            JSON.parseObject(text);
        }catch(Exception e) {
            return false;
        }
        return true;
    }

    private static boolean isSingleJsonObject(String text, JournalQueryVo vo) {
        JSONObject jsonObj;
        try {
            jsonObj = JSON.parseObject(text);
        } catch (Exception e) {
            return false;
        }
        if (null != jsonObj) {
            System.out.println(jsonObj.size());
//            for (Map.Entry<String, Object> entry : jsonObj.entrySet()) {
//                String value = String.valueOf(entry.getValue());
//                if(isArrayType(getValueType(value, vo)) || isCollectionType(getValueType(value, vo))) {
//                    return false;
//                }
//            }
        }
        return true;
    }

    private static boolean isJsonArray(String text) {
        try {
            JSON.parseArray(text);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static boolean hasReqParam(Map<String, Object> params) {
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (!entry.getKey().equalsIgnoreCase("OPR")) {
                return true;
            }
        }
        return false;
    }

    private static String getFile() throws IOException {
        InputStream is = ParamParser.class.getClassLoader().getResourceAsStream("job/journal.json");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String content = "";
        String line;
        while ((line = reader.readLine()) != null) {
            content += line + System.getProperty("line.separator");
        }
        return content;
    }

    private static boolean isCollectionType(Class<?> clazz) {
        if (null == clazz) {
            return false;
        }
        if (Collection.class.isAssignableFrom(clazz)) {
            return true;
        }
        return false;
    }

    private static boolean isArrayType(Class<?> clazz) {
        if (null == clazz) {
            return false;
        }
        if (Object[].class.isAssignableFrom(clazz)) {
            return true;
        }
        return false;
    }

    private static Class<?> getValueType(String value, JournalQueryVo vo) {
        Class<?> clazz = vo.getClass();
        try {
            Field field = clazz.getDeclaredField(value);
            return field.getType();
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    public static Map<String, Object> parse(String content, JournalQueryVo vo) {
        // 返回值
        Map<String, Object> result = new HashMap<>();
        // 转化成jsonObject
        JSONObject rootObj = JSON.parseObject(content);
        // 遍历jsonObject的每个子元素
        for (Map.Entry<String, Object> entry : rootObj.entrySet()) {
            String nodeKey = entry.getKey();
            String nodeValue = String.valueOf(entry.getValue());
            // 如果子元素是一个单个的jsonObject，递归
            if (isJsonObject(nodeValue)) {
                result.put(nodeKey, parse(nodeValue, vo));
            } else if (isJsonArray(nodeValue)) {
                // 如果子元素是json数组，遍历数组元素
                result.putAll(handleJsonArray(nodeKey, nodeValue, vo));
            } else if (isArrayType(getValueType(nodeValue, vo))) {
                System.out.println(String.format("数组类型:%s", nodeKey));
                handleValueArray(nodeKey, nodeValue, vo);
            } else if (isCollectionType(getValueType(nodeValue, vo))) {
                System.out.println(String.format("集合类型:%s", nodeKey));
            } else { // 普通请求参数，递归出口
                result.putAll(handleCommonKey(nodeKey, nodeValue, vo));
            }
        }
        if (!hasReqParam(result)) {
            result.clear();
        }
        return result;
    }

    private static List<Map<String, Object>> handleValueArray(String key, String value, JournalQueryVo vo) {
        List<Map<String, Object>> list = new ArrayList<>();
        Class<?> clazz = vo.getClass();
        Field field;
        try {
            field = clazz.getDeclaredField(value);
            field.setAccessible(true);
            Object[] values = (Object[]) field.get(vo);
            System.out.println(Arrays.toString(values));
            for (Object o : values) {

            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Map<String, Object> handleJsonArray(String key, String value, JournalQueryVo vo) {
        Map<String, Object> result = new HashMap<>();
        List<Map<String, Object>> list = new ArrayList<>();
        JSONArray array = JSON.parseArray(value);
        for (Object anArray : array) {
            String text = anArray.toString();
            if (isSingleJsonObject(text, vo)) {
                Map<String, Object> param = parse(text, vo);
                if (param.size() > 0) {
                    list.add(param);
                }
            }
        }
        if (list.size() > 0) {
            result.put(key, list);
        }
        return result;
    }

    private static boolean isMultiValue(String text, JournalQueryVo vo) {
        JSONObject jsonObject = JSON.parseObject(text);
        return false;
    }

    /**
     * 处理普通key，这是真正的请求参数
     *
     * @param key   key
     * @param value 值
     * @param vo    包含具体值的实体
     * @return 键值对请求参数
     */
    private static Map<String, Object> handleCommonKey(String key, String value, JournalQueryVo vo) {
        // 返回值
        Map<String, Object> result = new HashMap<>();
        // 如果key是OPR，则直接添加
        if (isLogic(key)) {
            result.put(key, value);
        } else { // 请求参数
            try {
                Class<?> clazz = vo.getClass();
                Field field = clazz.getDeclaredField(value);
                field.setAccessible(true);
                Object fieldValue = field.get(vo);
                if (null != fieldValue) {
                    result.put(key, fieldValue);
                }
            } catch (NoSuchFieldException e) {
                System.out.println(String.format("配置文件指定字段:[%s]，在实体类中不存在，请检查配置文件", value));
            } catch (IllegalAccessException e) {
                System.out.println(String.format("没有访问字段[%s]的权限，请检查", value));
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException, IllegalAccessException {

        JournalQueryVo vo = new JournalQueryVo();
        vo.setTableName("XDATA.T_ALL_FIELD_TRADE_BILL_2");
        vo.setUseCache(false);
        vo.setStart(0);
        vo.setRows(20);
        vo.setServiceId("crm");

        vo.setAgent("代理商");
        vo.setCardNo("卡号");

        String[] tradeTypes = {"01", "02", "03"};
        vo.setTradeType(tradeTypes);

        System.out.println(JSON.toJSONString(parse(getFile(), vo)));
    }
}
