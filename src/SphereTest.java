import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Jordan on 17/04/2017.
 */
public class SphereTest {

    public Sphere sphere;

    @Before
    public void setUp(){
        sphere = new Sphere(BigDecimal.valueOf(5));
        System.out.println("Running a test...");
    }

    @Test
    public void getUnit() throws Exception {
        assertEquals("Expecting BigDecimal value of 1", BigDecimal.valueOf(5), sphere.getUnit());
    }

    @Test
    public void calculateVolume() throws Exception {
        assertEquals("Expecting the volume of a Sphere",523.6, sphere.calculateVolume().doubleValue(), 0);
    }

}