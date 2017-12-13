package pattern.command.completed_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/3
 */
public class Stereo {

    private String place;

    public Stereo(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println(place + " Stereo is on");
    }

    public void off() {
        System.out.println(place + " Stereo is off");
    }

    public void setCd() {
        System.out.println(place + " is set for CD input");
    }

    public void setDvd() {
        System.out.println(place + " is set for DVD input");
    }

    public void setRadio() {
        System.out.println(place + " is set for Radio input");
    }

    public void setVolume(int volume) {
        System.out.println(place + " volume set to " + volume);
    }
}
