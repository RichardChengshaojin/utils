package pattern.observer;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private String tag = this.getClass().getName();

    @Override
    public void update(float humidity, float temperature, float pressure) {
        display(humidity, temperature, pressure);
    }

    @Override
    public void display(float humidity, float temperature, float pressure) {
        System.out.println(String.format("当前气候：温度：%.2f湿度：%.2f气压：%.2f", temperature, humidity, pressure));
    }

    @Override
    public boolean equals(Object obj) {
        return !(null == obj || !(obj instanceof CurrentConditionDisplay)) && this.tag.equals(((CurrentConditionDisplay) obj).tag);
    }
}