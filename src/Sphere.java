import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Jordan on 14/04/2017.
 */
public class Sphere implements Shape {


    //BigDecimal value for precision
    final BigDecimal radius;


    //Constructor of class to initialise the variable and instantiate the object.
    public Sphere(BigDecimal radius) throws ArithmeticException{
        this.radius = radius;
    }

    //Getter for variable
    @Override
    public BigDecimal getUnit() {
        return radius;
    }

    public BigDecimal calculateVolume() throws NullPointerException {

        //BigDecimal variable for precision.
        BigDecimal sphereVolume =
                BigDecimal.valueOf( //Convert to BigDecimal variables
                        (4.0 / 3.0) * Math.PI * Math.pow(radius.doubleValue(),3))//Volume of a sphere is 4/3*Pi*radius^3
                        .setScale(2, RoundingMode.HALF_UP);//Round to two decimal places.

        return sphereVolume;
    }
}
