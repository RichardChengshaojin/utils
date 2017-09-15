package basic.callback;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/5/18
 */
public class CallbackTest {

    public static String str = "123";

    public static void main(String[] args) throws IOException {
//        calcTime(() -> consumeTimeFunc(1));
//        B b = new B();
//        b.methodA();
//        int i = 0; // 先声明，后使用
//        System.out.println(i);
//        if (true) {
//            int j = 1;
//        }
//        System.out.println(i);
        Class<? super IM> superclass = IM.class.getSuperclass();
        System.out.println(Arrays.toString(IM.class.getGenericInterfaces()));
    }

    public static void consumeTimeFunc(int i) {
        System.out.println("consumeTimeFunc begins");
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("consumeTimeFunc ends");
    }

    public static void calcTime(Callback callback) {
        long begin = System.currentTimeMillis();
        callback.doOp();
        System.out.println(String.format("total time : %d", System.currentTimeMillis() - begin));
    }

    interface Callback {
        void doOp();
    }
}

class A {
    public void methodA() {
        this.methodA1();
        System.out.println("A");
    }

    public void methodA1() {
        System.out.println("A1");
    }
}

class B extends A {

    @Override
    public void methodA() {
        super.methodA();
        System.out.println("B");
    }

    @Override
    public void methodA1() {
        System.out.println("B1");
    }
}

interface I1 {
    void foo();
}

interface I2 {
    void foo();
}

class IM implements I1, I2 {

    @Override
    public void foo() {
        System.out.println("foo");
    }
}

