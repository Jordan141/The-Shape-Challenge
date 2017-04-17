import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Jordan on 17/04/2017.
 */
public class TetrahedronTest {

    private Tetrahedron tetrahedron;

    @Before
    public void setUp(){
        tetrahedron = new Tetrahedron(BigDecimal.valueOf(5));
        System.out.println("Running a test...");
    }

    @Test
    public void getUnit() throws Exception {
        assertEquals("Expecting BigDecimal value of 1", BigDecimal.valueOf(5), tetrahedron.getUnit());
    }

    @Test
    public void calculateVolume() throws Exception {
        assertEquals("Expecting the volume of a regular Tetrahedron",14.73, tetrahedron.calculateVolume().doubleValue(), 0);
    }

}