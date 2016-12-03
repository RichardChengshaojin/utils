package utils.job.storydown;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Properties;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class Down {
    public static void main(String[] args) throws IOException {
        String txt = "C:\\Users\\chengshaojin.XGD\\Desktop\\content.txt";
        Properties p = new Properties();
        p.load(new InputStreamReader(new FileInputStream(txt), "utf-8"));

        for(Map.Entry<Object, Object> entry : p.entrySet()) {
            System.out.println(String.format("%s=%s", entry.getKey(), entry.getValue()));
        }
    }
}
