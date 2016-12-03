package utils.job;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * desc
 *
 * @author chengshaojin
 * @since 2016/9/12.
 */
public class MachineIdSearch {

    public static void main(String[] args) throws IOException {
//        String text = "[2016-09-12 10:00:04.653][INFO ] - [117.136.42.77:17618#5950][4012][ProDownHandler -> ProDownReq:[ vendor=XGD,clientType=G2,clientMacID=G20013B3430,version=02,transCode=4012 ]]";
//        String regex = "[\\s|\\S]+ -> ProDownReq:\\[ vendor=\\w+,clientType=\\w+,clientMacID=(\\w+),version=\\w+,transCode=\\w+ \\]\\]";
//        String text1 = "ProDownReq:[ vendor=XGD,clientType=G2,clientMacID=G20013B3430,version=02,transCode=4012 ]]";
//        String regex1 = "ProDownReq:\\[ vendor=\\w+,clientType=\\w+,clientMacID=(\\w+),version=\\w+,transCode=\\w+ \\]\\]";
//        System.out.println(text.matches(regex));
//        System.out.println(text1.matches(regex1));
//        Matcher m = Pattern.compile(regex).matcher(text);
//        if (m.find()) {
//            System.out.println(m.group(1));
//        }

        String filePath = "C:\\Users\\chengshaojin\\Desktop\\22.6\\logic.logconfig";
        String storePath = "C:\\Users\\chengshaojin\\Desktop\\22.6\\machineIds.txt";
        String key = "终端数据不存在！";
        MachineIdSearch s = new MachineIdSearch();
        s.analyze(filePath, storePath, key);

        String prefixRegex = "\\[\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}.\\d{3}\\]\\[[A-Z]*[ ]*\\] - \\[(\\S+)\\]\\[\\d{4}\\]\\[终端数据不存在！\\]";
        String regex = "\\[\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}.\\d{3}\\]";
        String text5 = "[2016-09-12 10:00:03.769]";
        String text3 = "[2016-09-12 10:00:04.656][INFO ] - [117.136.42.77:17618#5950][4012][终端数据不存在！]";
        String text4 = "[2016-09-12 10:00:03.769][ERROR] - [117.136.42.77:17618#5950][4005][终端数据不存在！]";
        System.out.println(text3.matches(prefixRegex));
        System.out.println(text4.matches(prefixRegex));
        System.out.println(text5.matches(regex));
    }

    public void analyze(String filepPath, String storePath, String key) throws IOException {
        Scanner sc = new Scanner(new FileInputStream(filepPath));
        sc.useDelimiter("\r\n");

        List<String> machineIds = new ArrayList<>();
        String prefix = "";
        String prefixRegex = "\\[\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}.\\d{3}\\]\\[[A-Z]*[ ]*\\] - \\[(\\S+)\\]\\[\\d{4}\\]\\[终端数据不存在！\\]";
        String machineIdRegex = "[\\s|\\S]+ -> ProDownReq:\\[ vendor=\\w+,clientType=\\w+,clientMacID=(\\w+),version=\\w+,transCode=\\w+ \\]\\]";
        while (sc.hasNext()) {
            String line = sc.nextLine();
            if (line.contains(key)) {
                prefix = getSub(line, prefixRegex);
                if (null == prefix) {
                    System.err.println(String.format("解析前缀错误, line: %s", line));
                    prefix = "";
                }
                continue;
            }
            if (!"".equals(prefix) && line.contains(prefix) && line.contains("ProDownHandler")) {
                String machineId = getSub(line, machineIdRegex);
                if (null == machineId) {
                    System.err.println(String.format("解析机身号错误错误, line: %s", line));
                } else {
                    machineIds.add(machineId);
                }
                prefix = "";
            }
            if (100 <= machineIds.size()) {
                writeToLocal(storePath, machineIds);
                machineIds.clear();
            }
        }
        writeToLocal(storePath, machineIds);
    }

    private void writeToLocal(String filePath, List<String> machineIds) throws IOException {
        RandomAccessFile rm = new RandomAccessFile(filePath, "rw");
        FileChannel channel = rm.getChannel();
        FileLock lock = channel.lock();
        try {
            long len = rm.length();
            rm.seek(len);
            for (String m : machineIds) {
                rm.write((m + ", ").getBytes());
            }
        } finally {
            lock.release();
        }
    }

    private String getSub(String text, String regex) {
        String result = null;
        Matcher m = Pattern.compile(regex).matcher(text);
        if (m.find()) {
            result = m.group(1);
        }
        return result;
    }
}
