package pattern.command.completed_ver;


/**
 * 电灯打开命令
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
