package utils.common;//package utils.common;
//
///**
// * DEC
// *
// * @auther chengshaojin
// * @since 2016/11/17
// */
//public class NumberUtils {
//
//    /**
//     * 将byte数组转换成十六进制字符串(小写十六进制字母），小于16的前面填充0<br />
//     * 如 {1, -1}的表示是01ff
//     *
//     * @param bs 字节数组
//     * @return 十六进制字符串
//     */
//    public static String bytesToHex(byte[] bs) {
//        return bytesToHexVer1(bs, false);
//    }
//
//    /**
//     * 将byte数组转换成十六进制字符串，小于16的前面填充0<br />
//     * 如 {1, -1}的表示是01FF
//     *
//     * @param bs      字节数组
//     * @param capital 十六进制字母是否大写 true-大写 false-小写
//     * @return 十六进制字符串
//     */
//    public static String bytesToHexVer1(byte[] bs, boolean capital) {
//        char[] hex;
//        if (capital) {
//            hex = "0123456789ABCDEF".toCharArray();
//        } else {
//            hex = "0123456789abcdef".toCharArray();
//        }
//        StringBuilder sb = new StringBuilder(bs.length * 2);
//        for (byte b : bs) {
//            // 高四位
//            sb.append(hex[(b >> 4) & 0x0F]);
//            // 低四位
//            sb.append(hex[b & 0x0F]);
//        }
//        return sb.toString();
//    }
//
//    /**
//     * 将byte数组转换成十六进制字符串(小写十六进制字母），小于16的前面填充0<br />
//     * 如 {1, -1}的表示是01ff
//     *
//     * @param bs 字节数组
//     * @return 十六进制字符串
//     */
//    public static String bytesToHexVer2(byte[] bs) {
//        StringBuilder sb = new StringBuilder(bs.length * 2);
//        for (byte b : bs) {
//            // 屏蔽负数影响
//            String bit = Integer.toHexString(b & 0xFF);
//            if (1 == bit.length()) {
//                bit = "0" + bit;
//            }
//            sb.append(bit);
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        byte[] bs = {1, -1};
//        System.out.println(bytesToHexVer1(bs, true));
//        System.out.println(bytesToHexVer2(bs));
//        System.out.println(bytesToHex(bs));
//    }
//}
