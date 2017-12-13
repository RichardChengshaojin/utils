package pattern.command.completed_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class CeilingFan {

    public static final int HIGH = 3;

    public static final int MEDIUM = 2;

    public static final int LOW = 1;

    public static final int OFF = 0;

    private String location;

    private int speed;

    public CeilingFan(String room) {
        this.location = room;
        this.speed = OFF;
    }

    public void on(int speed) {
        this.speed = speed;
        System.out.println(location + " ceiling fan is on " + speed);
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public void high() {
        speed = HIGH;
    }

    public void mediem() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public int getSpeed() {
        return speed;
    }
}
