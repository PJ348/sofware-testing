import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class gradeCalculatorTest {
    private gradeCalculator calc;

    @Before
    public void setUp() {
        calc = new gradeCalculator();
    }

    @Test
    public void lowerBoundOfEachGrade() {
        assertEquals("A",  calc.gradeOf(80));
        assertEquals("B+", calc.gradeOf(75));
        assertEquals("B",  calc.gradeOf(70));
        assertEquals("C+", calc.gradeOf(65));
        assertEquals("C",  calc.gradeOf(60));
        assertEquals("D+", calc.gradeOf(55));
        assertEquals("D",  calc.gradeOf(50));
    }

    @Test
    public void upperBoundOfEachGrade() {
        assertEquals("A",  calc.gradeOf(100));
        assertEquals("B+", calc.gradeOf(79));
        assertEquals("B",  calc.gradeOf(74));
        assertEquals("C+", calc.gradeOf(69));
        assertEquals("C",  calc.gradeOf(64));
        assertEquals("D+", calc.gradeOf(59));
        assertEquals("D",  calc.gradeOf(54));
    }

}