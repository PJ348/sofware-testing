import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class mainTest {
    @Test
    public void test01() {
        main obj = new main();
        assertEquals(6, obj.formulaTwo(2, 3));
    }
}