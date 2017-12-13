package pattern.observer;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/20
 */
public class HeatIndexDisplay implements Observer, DisplayElement {

    private String tag = this.getClass().getName();

    private float temperature;

    private float humidity;

    private double heatIndex;

    @Override
    public void update(float humidity, float temperature, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        calcHeatIndex();
        display();
    }

    private void calcHeatIndex() {
        this.heatIndex = 16.923 + 1.85212 * 0.1 * this.temperature + 5.37941 * this.humidity - 1.00254 * 0.1 * this.temperature
                * this.humidity + 9.41695 * 0.1 * 0.1 * 0.1 * this.temperature * this.temperature;
    }

    @Override
    public void display() {
        System.out.println("酷热指数：" + this.heatIndex);
    }

    @Override
    public boolean equals(Object obj) {
        return !(null == obj || !(obj instanceof HeatIndexDisplay)) && this.tag.equals(((HeatIndexDisplay) obj).tag);
    }
}
