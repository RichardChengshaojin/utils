package basic.security.msgdigest;



import basic.utils.StringUtils;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * 信息摘要算法-MAC
 *
 * @auther chengshaojin
 * @since 2016/12/30
 */
public class HmacMD5Test {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
        // 获取密钥
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacMD5");
//        System.out.println(keyGenerator.getProvider().getInfo());
        SecretKey secretKey = keyGenerator.generateKey();
        System.out.println(secretKey.getFormat());
        System.out.println(StringUtils.bytesToHex(secretKey.getEncoded()));
        // 构建mac对象
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        mac.init(secretKey);
        byte[] output = mac.doFinal("MAC message".getBytes());
        System.out.println(output.length);
    }
}
