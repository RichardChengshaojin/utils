package pattern.command.completed_ver;


/**
 * 车库开门命令
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class GarageDoorDownCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
