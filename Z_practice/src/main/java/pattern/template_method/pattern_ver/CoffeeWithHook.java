package pattern.template_method.pattern_ver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/15
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return null != answer && answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee(y/n)?\t");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                System.err.println("IO error trying to read your answer");
            }
        }
        if (null == answer) {
            return "no";
        }
        return answer;
    }
}
