package static_init;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/19
 */
public class StaticDemoMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Class<StaticDemo> clazz1 = StaticDemo.class; // clinit不执行
//        Class<?> clazz2 = Class.forName("jvm.static_init.StaticDemo"); //clinit执行
        Class<?> clazz3 = Class.forName("jvm.static_init.StaticDemo", false, Thread.currentThread().getContextClassLoader()); // clinit不执行,因为false指定了不初始化
        StaticDemo s = (StaticDemo) clazz3.newInstance(); // 初始化， clinit执行
        s.fun();
    }
}
