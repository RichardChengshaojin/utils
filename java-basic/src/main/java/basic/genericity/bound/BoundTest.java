package basic.genericity.bound;

import java.util.ArrayList;
import java.util.List;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/2
 */
public class BoundTest {

    public static void main(String[] args) {
        List<Class<? extends A>> list1 = new ArrayList<>();
        list1.add(D.class);

        List<? super A> list2 = new ArrayList<>();
        list2.add(new D());
    }
}

class A {}

class B extends A{}

class C extends B{}

class D extends C{}
