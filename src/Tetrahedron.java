import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Jordan on 15/04/2017.
 */
public class Tetrahedron implements Shape {

    //BigDecimal value for precision
    final BigDecimal edge;

    //Constructor of class to initialise the variable and instantiate the object.
    public BigDecimal getUnit() {
        return edge;
    }

    //Getter for variable
    public  Tetrahedron(BigDecimal edge){
        this.edge = edge;
    }
    public Tetrahedron(double edge){
        this.edge = BigDecimal.valueOf(edge);
    }
    public Tetrahedron(int edge){
        this.edge = BigDecimal.valueOf(edge);
    }
    @Override
    public BigDecimal calculateVolume() {

        //Formula for the volume of a regular tetrahedron is
        // the length to the power of 3 divided by 6 multiplied by the square root of 2.

        BigDecimal volume = BigDecimal.valueOf(//Convert to BigDecimal variables
                (Math.pow(edge.doubleValue(), 3)) / (6 * Math.sqrt(2)))
                .setScale(2, RoundingMode.HALF_UP);

        return volume;
    }
    @Override
    public String toString() {
        return "This regular tetrahedron has an edge of " + edge + "cm and a volume of " + calculateVolume() + "cm^3";
    }
}
