package pattern.command.completed_ver;


/**
 * 电灯打开命令
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
