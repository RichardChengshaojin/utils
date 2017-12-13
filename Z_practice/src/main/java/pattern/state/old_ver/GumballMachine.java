package pattern.state.old_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/16
 */
public class GumballMachine {

    private final static int SOLD_OUT = 0;
    private final static int NO_QUARTER = 1;
    private final static int HAS_QUARTER = 2;
    private final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("You can't insert another quarter");
                break;
            case NO_QUARTER:
                state = HAS_QUARTER;
                System.out.println("You inserted a quarter");
                break;
            case SOLD_OUT:
                System.out.println("You can't insert a quarter, the machine is sold out");
                break;
            case SOLD:
                System.out.println("Please wait, we're already giving you a gumball");
                break;
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("Quarter returned");
                state = NO_QUARTER;
                break;
            case NO_QUARTER:
                System.out.println("You haven't inserted a quarter");
                break;
            case SOLD_OUT:
                System.out.println("You can't eject, you haven't inserted a quarter yet");
                break;
            case SOLD:
                System.out.println("Sorry, you already turned the crank");
                break;
        }
    }

    public void turnCrank() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("You turned...");
                state = SOLD;
                dispense();
                break;
            case NO_QUARTER:
                System.out.println("You turned but there's no quarter");
                break;
            case SOLD_OUT:
                System.out.println("You turned, but there are no gumballs");
                break;
            case SOLD:
                System.out.println("Turning twice doesn't get you another gumball!");
                break;
        }
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("No gumball dispensed");
                break;
            case NO_QUARTER:
                System.out.println("You need to pay first");
                break;
            case SOLD_OUT:
                System.out.println("No gumball dispensed");
                break;
            case SOLD:
                System.out.println("A gumball comes rolling out the slot");
                count -= 1;
                if (count == 0) {
                    System.out.println("Oops, out of gumballs!");
                    state = SOLD_OUT;
                } else {
                    state = NO_QUARTER;
                }
                break;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GumballMachine{");
        sb.append("state=").append(state);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
