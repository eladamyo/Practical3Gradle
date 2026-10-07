package practical1;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberToolsTest {
    @Test public void parsesCommaSeparatedNumbers() {
        assertArrayEquals(new double[] {1, 2.5, -3}, NumberTools.parseString("1,2.5,-3"), 0.0);
    }
    @Test public void computesMean() {
        assertEquals(2.0, NumberTools.computeStatistic("mean", new double[] {1, 2, 3}), 0.000001);
    }
    @Test public void computesSum() {
        assertEquals(6.0, NumberTools.computeStatistic("sum", new double[] {1, 2, 3}), 0.000001);
    }
    @Test public void computesSampleStandardDeviation() {
        assertEquals(1.0, NumberTools.computeStatistic("sd", new double[] {1, 2, 3}), 0.000001);
    }
}
