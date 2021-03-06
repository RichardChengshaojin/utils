package pattern.command.completed_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/3
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command... commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
    }

    @Override
    public void undo() {
        for (Command c : commands) {
            c.undo();
        }
    }
}
