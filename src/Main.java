import java.math.BigDecimal;

/**
 * Created by Jordan Moss on 15/04/2017.
 */
public class Main {

    private static Sphere sphere = new Sphere(BigDecimal.valueOf(1));
    private static Cube cube = new Cube(BigDecimal.valueOf(1));
    private static Tetrahedron tetrahedron = new Tetrahedron(BigDecimal.valueOf(1));

    public static void main(String[] args){//TODO clean up repeating code

        final int firstMeasurement = 1, secondMeasurement = 5;

        output(sphere, firstMeasurement);
        sphere = new Sphere(BigDecimal.valueOf(secondMeasurement));
        output(sphere, secondMeasurement);

        output(cube, firstMeasurement);
        cube = new Cube(BigDecimal.valueOf(secondMeasurement));
        output(cube, secondMeasurement);

        output(tetrahedron, firstMeasurement);
        tetrahedron = new Tetrahedron(BigDecimal.valueOf(secondMeasurement));
        output(tetrahedron, secondMeasurement);
    }
    private static void output(Shape shape, int measurement){

        System.out.format("%s's volume of radius %d: %.2f\n", shape.getClass().getSimpleName(),measurement, shape.calculateVolume());
    }
}
