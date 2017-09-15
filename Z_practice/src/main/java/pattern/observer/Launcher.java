package pattern.observer;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class Launcher {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        wd.measurementsChanged(10.0f, 35.6f, 500f);

        wd.registerObserver(new CurrentConditionDisplay());
        wd.measurementsChanged(10.0f, 35.6f, 500f);

        wd.removeObserver(new CurrentConditionDisplay());
        wd.measurementsChanged(10.0f, 35.6f, 500f);
    }
}
