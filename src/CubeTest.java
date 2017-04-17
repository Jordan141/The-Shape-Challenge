import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Jordan on 17/04/2017.
 */
public class CubeTest {
    public Cube cube;

    @Before
    public void setUp(){
        cube = new Cube(BigDecimal.valueOf(5));
        System.out.println("Running a test...");
    }

    @Test
    public void getUnit() throws Exception {
        assertEquals("Expecting BigDecimal value of 1", BigDecimal.valueOf(5), cube.getUnit());
    }

    @Test
    public void calculateVolume() throws Exception {
        assertEquals("Expecting the volume of a Sphere",125, cube.calculateVolume().doubleValue(), 0);
    }

}