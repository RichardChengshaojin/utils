package pattern.template_method.pattern_ver;

import java.util.Scanner;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/15
 */
public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    boolean customerWantsCondiments() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like lemon with your tea(y/n)?\t");
        String next = sc.next();
        return null != next && next.toLowerCase().startsWith("y");
    }
}
