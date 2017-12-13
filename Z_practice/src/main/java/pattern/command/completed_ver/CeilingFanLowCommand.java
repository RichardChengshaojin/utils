package pattern.command.completed_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class CeilingFanLowCommand implements Command {

    private CeilingFan ceilingFan;
    private int previousSpeed;

    public CeilingFanLowCommand(CeilingFan fan) {
        this.ceilingFan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.on(CeilingFan.LOW);
    }

    @Override
    public void undo() {
        switch (previousSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.mediem();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
        }
    }
}
