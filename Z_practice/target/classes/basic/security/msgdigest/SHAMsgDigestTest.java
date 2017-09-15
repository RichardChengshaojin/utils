package basic.security.msgdigest;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * SHA信息摘要测试
 *
 * @auther chengshaojin
 * @since 2016/11/30
 */
public class SHAMsgDigestTest {

    /**
     * 信息摘要输入流测试
     */
    private static void msgDigestInputStreamTest() throws IOException, NoSuchAlgorithmException {
        String msgPath = "C:\\Users\\chengshaojin.XGD\\Desktop\\journal_list.jsp";
        InputStream fis = new FileInputStream(msgPath);
        MessageDigest msgDigest = MessageDigest.getInstance("MD5");

        DigestInputStream dis = new DigestInputStream(fis, msgDigest);
        byte[] input = new byte[1024];
        int read = dis.read(input, 0, 1024);
        if(-1 != read) {
            byte[] digest = dis.getMessageDigest().digest();
            System.out.println(digest.length);
            System.out.println(new String(input));
        }
    }

    /**
     * 信息摘要输出流测试
     */
    private static void msgDigestOutputStreamTest() throws NoSuchAlgorithmException, IOException {
        ByteArrayOutputStream bais = new ByteArrayOutputStream();
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        DigestOutputStream dos = new DigestOutputStream(bais, md);

        byte[] output = "青春的纪念册".getBytes();
        dos.write(output, 0, output.length);

        byte[] digest = dos.getMessageDigest().digest();
        System.out.println(digest.length);
        System.out.println(new String(bais.toByteArray()));
    }

    /**
     * 信息摘要测试
     */
    private static void msgDigestTest() throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA");
        System.out.println(md.getAlgorithm());
        System.out.println(md.getProvider());

        String msg = "夜空中最亮的星";
        byte[] digest = md.digest(msg.getBytes());
        System.out.println(digest.length);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        msgDigestTest();
        msgDigestOutputStreamTest();
        msgDigestInputStreamTest();
    }
}
