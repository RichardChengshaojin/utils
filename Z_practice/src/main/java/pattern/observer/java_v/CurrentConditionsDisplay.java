package pattern.observer.java_v;

import java.util.Observable;
import java.util.Observer;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/22
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;

    private float temperature;

    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData w = (WeatherData) o;
            this.temperature = w.getTemperature();
            this.humidity = w.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("当前气候：温度：%.2f, 湿度：%.2f", this.temperature, this.humidity));
    }
}
