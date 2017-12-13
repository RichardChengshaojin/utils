package pattern.command.simple_ver;

/**
 * 车库门
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class GarageDoor {

    public void up() {
        System.out.println("Garage door is up");
    }

    public void down() {
        System.out.println("Garage door is down");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}
