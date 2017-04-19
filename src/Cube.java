import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Jordan on 15/04/2017.
 */
public class Cube implements Shape {

    //BigDecimal value for precision
    final BigDecimal edge;
    private boolean hasBeenRun = false;
    private BigDecimal volume;

    //Constructor of class to initialise the variable and instantiate the object.
    public Cube(BigDecimal edge){
        this.edge = edge;
    }
    public Cube(double edge){
        this.edge = BigDecimal.valueOf(edge);
    }
    public Cube(int edge){
        this.edge = BigDecimal.valueOf(edge);
    }

    //Override super method
    @Override
    public BigDecimal calculateVolume() {

        //Avoid unnecessary calculations
        if(hasBeenRun){
            return volume;
        }

        volume =  BigDecimal.valueOf(//Convert to BigDecimal variables
                Math.pow(edge.doubleValue(),3)//Formula for a cube is the length to the power of 3
        ).setScale(2, RoundingMode.HALF_UP);//Round to two decimal places.

        hasBeenRun = true;
        return volume;
    }

    //Getter for variable
    @Override
    public BigDecimal getUnit() {
        return edge;
    }

    @Override
    public String toString() {
        return "This cube has an edge of " + edge + "cm and a volume of " + calculateVolume() + "cm^3";
    }
}
