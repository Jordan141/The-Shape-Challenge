import java.math.BigDecimal;

/**
 * Created by Jordan Moss on 15/04/2017.
 */
public class Main {

    private static final double unitOne = 1;//Testing polymorphic constructors
    private static final int unitTwo = 5;//Testing polymorphic constructors

    private static final Shape[] shapes = {
            //Creating and instantiating array of objects
            new Sphere(unitOne),
            new Sphere(unitTwo),
            new Cube(unitOne),
            new Cube(unitTwo),
            new Tetrahedron(unitOne),
            new Tetrahedron(unitTwo),
    };


    //Main method, for testing amd output
    public static void main(String[] args){

        for(Shape shape : shapes){//For every shape object in the array of shapes
            System.out.println(shape.toString());
        }
    }
}
