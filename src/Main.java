import java.math.BigDecimal;

/**
 * Created by Jordan Moss on 15/04/2017.
 */
public class Main {

    private static final int unitOne = 1, unitTwo = 5;
    private static final Shape[] shapes = {
            //Creating and instantiating array of objects
            new Sphere(BigDecimal.valueOf(unitOne)),
            new Sphere(BigDecimal.valueOf(unitTwo)),
            new Cube(BigDecimal.valueOf(unitOne)),
            new Cube(BigDecimal.valueOf(unitTwo)),
            new Tetrahedron(BigDecimal.valueOf(unitOne)),
            new Tetrahedron(BigDecimal.valueOf(unitTwo)),
    };


    //Main method, for testing amd output
    public static void main(String[] args){//TODO clean up repeating code

        for(Shape shape : shapes){//For every shape object in the array of shapes
         output(shape, shape.getUnit().intValueExact());//Output to screen
        }
    }
    
    //Output method, to clear up repeating code
    private static void output(final Shape shape, final int measurement){
        System.out.format("%s's volume of radius %d: %.2f\n",
                    shape.getClass().getSimpleName(),
                    measurement, shape.calculateVolume());
    }
}
