package pattern.command.completed_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.ceilingFan = fan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on(CeilingFan.LOW);
    }
}
