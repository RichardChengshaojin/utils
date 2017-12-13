package jmm;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/19
 */
public class StaticDemoMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // for name 系列
//        forNameSeries();
        // class loader 系列
//        classloaderSeries();
        // static方法调用
        StaticDemo.staticFun();
    }

    private static void forNameSeries() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // clinit不执行
//        Class<StaticDemo> clazz1 = StaticDemo.class;
//        System.out.println("new instance...");
//        StaticDemo s = clazz1.newInstance();
//        System.out.println("function invoke...");
//        s.fun();

        //clinit执行
//        System.out.println("load class...");
//        Class<?> clazz2 = Class.forName("jmm.StaticDemo");
//        System.out.println("initialize class...");
//        StaticDemo s1 = (StaticDemo) clazz2.newInstance();
//        System.out.println("function invoke...");
//        s1.fun();

        // clinit不执行,因为false指定了不初始化
        System.out.println("load class...");
        Class<?> clazz3 = Class.forName("jmm.StaticDemo", false, Thread.currentThread().getContextClassLoader());
        System.out.println("initialize class...");
        StaticDemo s2 = (StaticDemo) clazz3.newInstance(); // 初始化， clinit执行
        System.out.println("function invoke...");
        s2.fun();
    }

    private static void classloaderSeries() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader classLoader = StaticDemo.class.getClassLoader();
        System.out.println("load class...");
        Class<?> aClass = classLoader.loadClass("jmm.StaticDemo");
        System.out.println("initialize class...");
        StaticDemo o = (StaticDemo) aClass.newInstance();
        System.out.println("function invoke...");
        o.fun();
    }
}
