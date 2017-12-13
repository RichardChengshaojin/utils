package pattern.command.completed_ver;

/**
 * 电灯
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class Light {

    private String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " Light is on.");
    }

    public void off() {
        System.out.println(room + " Light is off.");
    }
}
