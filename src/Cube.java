import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Jordan on 15/04/2017.
 */
public class Cube implements Shape {

    //BigDecimal value for precision
    final BigDecimal edge;

    //Constructor of class to initialise the variable and instantiate the object.
    public Cube(BigDecimal edge){
        this.edge = edge;
    }

    //Override super method
    @Override
    public BigDecimal calculateVolume() {

        return BigDecimal.valueOf(//Convert to BigDecimal variables
                Math.pow(edge.doubleValue(),3)//Formula for a cube is the length to the power of 3
        ).setScale(2, RoundingMode.HALF_UP);//Round to two decimal places.
    }

    //Getter for variable
    public BigDecimal getEdge() {
        return edge;
    }
}
