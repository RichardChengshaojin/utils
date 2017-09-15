package basic.security.signature;

import java.security.*;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/30
 */
public class SignatureTest {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        // 非对称密钥
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.genKeyPair();
        // 签名
        Signature signature = Signature.getInstance(keyPairGenerator.getAlgorithm());
        signature.initSign(keyPair.getPrivate());

        String msg = "这是需要签名的数据";
        signature.update(msg.getBytes());
        byte[] sign = signature.sign();

        // 验证
        signature.initVerify(keyPair.getPublic());
        signature.update(msg.getBytes());

        System.out.println(signature.verify(sign));
    }
}
