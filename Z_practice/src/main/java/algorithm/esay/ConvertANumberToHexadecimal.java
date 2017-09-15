package algorithm.esay;

/**
 * Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
 * <p>
 * Note:
 * <p>
 * All letters in hexadecimal (a-f) must be in lowercase.
 * The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
 * The given number is guaranteed to fit within the range of a 32-bit signed integer.
 * You must not use any method provided by the library which converts/formats the number to hex directly.
 * <p>
 * 解析：十六进制和二进制的对应关系是4位对应一个十六进制数，这个问题需要站在二进制的角度去思考！！！
 * 利用0x0000000F与操作的特性得到低4位对应的十六进制数，再不断逻辑右移，得到其他4位的十六进制数，再拼接起来即可。
 * </P>
 *
 * @author chengshaojin
 * @since 2016/9/26.
 */
public class ConvertANumberToHexadecimal {

    public static void main(String[] args) {
//        String[] matches = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
//        int i = 0;
//        int j = 0x0000000F;
//        System.out.println(matches[i & j]);
        ConvertANumberToHexadecimal c = new ConvertANumberToHexadecimal();
        System.out.println(c.toHex(-1));
        System.out.println(c.toHex(26));
        System.out.println(c.toHex(0));
    }

    public String toHex(int num) {
        String[] matches = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        String hex = "";
        int i = 0x0000000F;
        do {
            hex = matches[num & i] + hex;
            num >>>= 4;
        } while (num != 0);
        return hex;
    }
}
