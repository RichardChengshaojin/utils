package basic.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * desc
 *
 * @author chengshaojin
 * @since 2016/8/10.
 */
public class RegexMatch {

    /**
     * How to use java regular expression
     */
    private static void howToUseRegex() {
        String regex = "\\w+ \\w+";
        String string = "Hello Regex";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.matches());
    }

    /**
     * Test group
     */
    private static void groupTest() {
        String regex = "((T\\w+) (G\\w+))";
        String string = "It's A Example of Testing Group";
        Matcher matcher = Pattern.compile(regex).matcher(string);
        if (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println(String.format("Group %d : %s", i, matcher.group(i)));
            }
        }
    }

    /**
     * Test boundary ^ and $
     */
    private static void boundaryTest() {
        Pattern p = Pattern.compile("java");
        Matcher m = p.matcher("java is a programming language, java.");
        while (m.find()) {
            System.out.println(String.format("group(): %s, start: %d, end: %d", m.group(), m.start(), m.end()));
        }
    }

    /**
     * Test regular expression \b
     */
    private static void characterBoundaryTest() {
        Pattern p = Pattern.compile("\\b\\w+\\b");
        String string = "Hello, This is Richard speaking.";
        Matcher matcher = p.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    /**
     * Test regular expression .
     */
    public static void testPeriod() {
        Pattern pattern = Pattern.compile(".+");
        String string = "This is my \r\n girlfriend";
        Matcher matcher = pattern.matcher(string);
        if(matcher.find()) {
            System.out.println(String.format("Group: %s", matcher.group()));
            // for ".+" output: Group: This is my
            // for "(?s).+" output: Group: This is my \n girlfriend
        }
    }

    /**
     * Test Pattern model MULTILINE
     */
    private static void multiLineTest() {
        String content = "It's my life\n wings you are the hero";
        Pattern p = Pattern.compile("(?m)(\\S+)\\s+ (\\S+\\s+\\S+)$");
        // 上面的(?m)是模式标记，相当于Pattern.MULTILINE，表示多行模式也可以这样写：
//         Pattern p = Pattern.compile("(\\S+)\\s+(\\S+\\s+\\S+)$", Pattern.MULTILINE | Pattern.DOTALL);
        Matcher m = p.matcher(content);
        if (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) { // 注意这里的groupCount不包含匹配到的整个字符串
                System.out.println(String.format("Group %d : %s", i, m.group(i)));
            }
        }
    }

    /**
     * Test Pattern model LITERAL
     */
    private static void literalTest() {
        String string = "\\w+ \\w+$";
        Pattern p = Pattern.compile("\\w+ \\w+$", Pattern.LITERAL);
        Matcher m = p.matcher(string);
        while(m.find()) {
            System.out.println(String.format("Group: %s", m.group()));
        }
    }

    public static void main(String[] args) {
//        howToUseRegex();
//        groupTest();
//        multiLineTest();
//        boundaryTest();
//        characterBoundaryTest();
//        testPeriod();
        literalTest();
    }
}
