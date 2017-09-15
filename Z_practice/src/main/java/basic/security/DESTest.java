package basic.security;

import javax.crypto.*;
import java.security.*;
import java.util.Map;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/25
 */
public class DESTest {

    public byte[] encrypt(SecretKey secretKey, byte[] msgBytes, String transformation) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance(transformation);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(msgBytes);
    }

    public byte[] decrypt(SecretKey secretKey, byte[] secretMsgBytes, String transformation) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance(transformation);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return cipher.doFinal(secretMsgBytes);
    }

    public Key getDESKey() throws NoSuchAlgorithmException {
        KeyGenerator generator = KeyGenerator.getInstance("DES");
        generator.init(56);
        return generator.generateKey();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchPaddingException {

//        DESTest d = new DESTest();
//        String msg = "Hello World!";
//        byte[] msgBytes = msg.getBytes();
//        SecretKey secretKey = (SecretKey) d.getDESKey();
//
//        System.out.println(String.format("Original:\n\tplan text: %s\n\tbytes: %s", msg, NumberUtils.bytesToHex(msgBytes)));
//        // encrypt
//        byte[] bs = d.encrypt((SecretKey) secretKey, msg.getBytes(), "DES/ECB/PKCS5Padding");
//        System.out.println(String.format("After encrypting: %s", NumberUtils.bytesToHex(bs)));
//        // decrypt
//        byte[] bs1 = d.decrypt((SecretKey) secretKey, bs, "DES/ECB/PKCS5Padding");
//        System.out.println(String.format("After decrypting: %s", NumberUtils.bytesToHex(bs1)));
//        System.out.println(new String(bs1));

        Provider[] providers = Security.getProviders();
        int i = 0;
        for (Provider p : providers) {
            System.out.println(++i + " " + p);
            for (Map.Entry<Object, Object> entry : p.entrySet()) {
                System.out.println("\t" + entry.getKey());
            }
        }
    }
}
