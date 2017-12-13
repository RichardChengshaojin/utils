package pattern.template_method.pattern_ver;

/**
 * 这就是我们的抽象类。他被声明为抽象，用作基类，其子类必须
 * 实现其操作
 */
public abstract class AbstractClass {
    /**
     * 这就是模板方法。被声明为final，以免子类改变这个算法的顺序；
     * 模板方法定义了一连串的步骤，每个步骤由一个方法表示
     */
    final void templateMethod() {
        concreteOp1();
        concreteOp2();
        primitiveOp1();
        primitiveOp2();
        hook();
    }
    // 这个抽象类有一个具体的操作
    private void concreteOp1() {}
    // 这个具体方法被声明为final，这样子类无法覆盖他。也可以声明为private
    final void concreteOp2() {}
    // 这个范例中有两个原语操作，具体子类必须实现她们
    abstract void primitiveOp1();
    abstract void primitiveOp2();
    // 具体方法，什么也不做；
    // 子类决定要不要覆盖他，可以作为条件控制抽象类中的算法流程
    private void hook() {}
}
