package pattern.observer;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private String tag = this.getClass().getName();

    private float humidity;

    private float temperature;

    private float pressure;


    @Override
    public void update(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("当前气候：温度：%.2f湿度：%.2f气压：%.2f", temperature, humidity, pressure));
    }

    @Override
    public boolean equals(Object obj) {
        return !(null == obj || !(obj instanceof CurrentConditionDisplay)) && this.tag.equals(((CurrentConditionDisplay) obj).tag);
    }
}