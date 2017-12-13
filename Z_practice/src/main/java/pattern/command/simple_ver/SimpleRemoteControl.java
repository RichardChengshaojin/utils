package pattern.command.simple_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
