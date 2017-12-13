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

        wd.registerObserver(new CurrentConditionDisplay());
        wd.registerObserver(new HeatIndexDisplay());
        wd.measurementsChanged(10.0f, 35.6f, 500f);

        System.out.println("\nRemove 当前气温布告板");
        wd.removeObserver(new CurrentConditionDisplay());
        wd.measurementsChanged(70.0f, 20.6f, 500f);
    }
}
