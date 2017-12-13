package pattern.command.completed_ver;

/**
 * 车库门
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class GarageDoor {

    private String place;

    public GarageDoor(String place) {
        this.place = place;
    }

    public void up() {
        System.out.println(place + " Garage door is up");
    }

    public void down() {
        System.out.println(place + " Garage door is down");
    }

    public void lightOn() {
        System.out.println(place + " Garage light is on");
    }

    public void lightOff() {
        System.out.println(place + " Garage light is off");
    }
}
