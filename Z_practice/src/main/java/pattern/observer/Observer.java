package pattern.observer;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public interface Observer {
    void update(float humidity, float temperature, float pressure);
}
