package basic.security;


import utils.StringUtils;

import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * java对于RSA的支持
 *
 * @auther chengshaojin
 * @since 2016/11/17
 */
public class RSAJava {

    public KeyPair generateRSAKeyPair(int len) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(len);
        return keyPairGenerator.genKeyPair();
    }

    /**
     * 测试java RSA的各种值，包括模值，公钥，私钥指数
     *
     * @throws NoSuchAlgorithmException
     */
    public void testRSA() throws NoSuchAlgorithmException {

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.genKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        RSAPublicKey rsaPublicKey = (RSAPublicKey) publicKey;
        RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) privateKey;

        // 模值
        BigInteger rsaPublicKeyModulus = rsaPublicKey.getModulus();
        // 公钥指数
        BigInteger rsaPublicKeyPublicExponent = rsaPublicKey.getPublicExponent();
        // 算法名
        String rsaPublicKeyAlgorithm = rsaPublicKey.getAlgorithm();
        // byte数组
        byte[] rsaPublicKeyEncoded = rsaPublicKey.getEncoded();
        // key编码
        String rsaPublicKeyFormat = rsaPublicKey.getFormat();

        // 模值
        BigInteger rsaPrivateKeyModulus = rsaPrivateKey.getModulus();
        // 私钥指数
        BigInteger rsaPrivateKeyPrivateExponent = rsaPrivateKey.getPrivateExponent();
        // 算法名
        String rsaPirvateKeyAlgorithm = rsaPrivateKey.getAlgorithm();
        // byte数组
        byte[] rsaPirvateKeyEncoded = rsaPrivateKey.getEncoded();
        // key编码
        String rsaPirvateKeyFormat = rsaPrivateKey.getFormat();

        System.out.println(String.format("公钥模值%s，\n私钥模值%s", rsaPublicKeyModulus, rsaPrivateKeyModulus));
        System.out.println(String.format("公钥指数%s，私钥指数%s", rsaPublicKeyPublicExponent, rsaPrivateKeyPrivateExponent));
        System.out.println(String.format("公钥算法%s，私钥算法%s", rsaPublicKeyAlgorithm, rsaPirvateKeyAlgorithm));
        System.out.println(StringUtils.bytesToHex(rsaPublicKeyEncoded));
        System.out.println(StringUtils.bytesToHex(rsaPirvateKeyEncoded));
        System.out.println(rsaPublicKeyFormat);
        System.out.println(rsaPirvateKeyFormat);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        RSAJava r = new RSAJava();
        r.testRSA();
    }
}
