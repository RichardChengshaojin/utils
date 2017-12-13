package pattern.state.new_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/17
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
