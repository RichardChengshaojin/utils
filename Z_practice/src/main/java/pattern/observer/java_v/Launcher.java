package pattern.observer.java_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class Launcher {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay c = new CurrentConditionsDisplay(wd);

        wd.setMeasurements(50, 30, 20);
    }
}
