package pattern.command.completed_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class RemoteControl {

    private Command[] onCommands;

    private Command[] offCommands;

    private Command undoCommand;

    private NoCommand initialNoCommand;

    public RemoteControl() {
        initialNoCommand = new NoCommand();
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i = 0; i < 7; i++) {
            onCommands[i] = initialNoCommand;
            offCommands[i] = initialNoCommand;
        }
        undoCommand = initialNoCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        slotBoundaryCheck(slot);
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        slotBoundaryCheck(slot);
        if (initialNoCommand == onCommands[slot]) {
            throw new IllegalArgumentException("空插槽");
        }
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        slotBoundaryCheck(slot);
        if (initialNoCommand == offCommands[slot]) {
            throw new IllegalArgumentException("空插槽");
        }
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            if (null != onCommands[i] && null != offCommands[i]) {
                sb.append(String.format("[slot %d] %s\t%s\n", i, onCommands[i].getClass().getName(), offCommands[i].getClass().getName()));
            }
        }
        return sb.toString();
    }

    private void slotBoundaryCheck(int slot) {
        if (slot > 6 || slot < 0) {
            throw new IllegalArgumentException("没有这个插槽");
        }
    }
}
