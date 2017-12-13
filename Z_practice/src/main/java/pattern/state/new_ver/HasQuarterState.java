package pattern.state.new_ver;

import java.util.Random;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/17
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    private Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't inset another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        boolean winner = random.nextInt(10) == 9;
        if (winner && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
            return;
        }
        if (winner) {
            System.out.println("Sorry you won but there're not enough gumballs");
        }
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
