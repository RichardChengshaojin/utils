import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/5/9
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOrder {

    @Test
    public void testA() {
        System.out.println("A");
    }

    @Test
    public void testAA() {
        System.out.println("AA");
    }
}
