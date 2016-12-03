package basic.security.msgdigest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * SHA信息摘要测试
 *
 * @auther chengshaojin
 * @since 2016/11/30
 */
public class SHAMsgDigestTest {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // 获取SHA信息摘要
        MessageDigest msgDigest = MessageDigest.getInstance("SHA");
        System.out.println(msgDigest.getAlgorithm());
    }
}
