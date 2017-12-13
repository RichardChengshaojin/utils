package pattern.command.simple_ver;

/**
 * 车库开门命令
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
