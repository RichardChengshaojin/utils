package pattern.observer.java_v;

import java.util.Observable;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/22
 */
public class WeatherData extends Observable {

    private float humidity;

    private float temperature;

    private float pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
}
