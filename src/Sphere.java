import java.math.BigDecimal;

/**
 * Created by Jordan on 14/04/2017.
 */
public class Sphere implements Shape {

    final double radius;

    public Sphere(double radius) throws ArithmeticException{
        this.radius = radius;
    }

    public BigDecimal calculateVolume() throws NullPointerException {



        BigDecimal sphereVolume = BigDecimal.valueOf((4/3) * Math.PI *(radius * radius * radius));
        //volume of a sphere -> V = 4/3 * Pi * r cubed
        return sphereVolume;
    }
}
