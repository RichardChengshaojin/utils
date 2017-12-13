package pattern.singleton;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public enum SingletonEnum {

    INSTANCE;

    private SingletonEnum() {
        System.out.println("initialize enum singleton");
    }

    public String getSth() {
        return "something";
    }
}
