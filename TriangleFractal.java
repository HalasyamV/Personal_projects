
import java.util.ArrayList;
import java.util.Arrays;

public class TriangleFractal extends Fractal {

    ArrayList<Point> arrayP = new ArrayList<>();

    public TriangleFractal(Triangle shape, int level) {
        super(shape, level);
        TriHelperMethod(shape, level);
        setPoints(arrayConverter());
    }

    @SuppressWarnings("unchecked")
    private void TriHelperMethod(Triangle shape, int level) {
        if (level <= 0) {
            System.out.println(level + " is the level");
            return;
        }

        Point center = shape.getCenter();

        Point[] points = shape.getPoints();
        arrayP.addAll(Arrays.asList(points));

        Point p1 = points[0];
        Point p2 = points[1];
        Point p3 = points[2];

        arrayP.add(p1);


        // Debugging print statements for points coordinates
        System.out.println("Level: " + level);
        System.out.println("Center: (" + center.getX() + ", " + center.getY() + ")");
        //System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");
        //System.out.println("p2: (" + p2.getX() + ", " + p2.getY() + ")");
        //System.out.println("p3: (" + p3.getX() + ", " + p3.getY() + ")");

        // Create three new smaller triangles
        Triangle t1 = new Triangle(center, p2, p1);
        Triangle t2 = new Triangle(center, p3, p2);
        Triangle t3 = new Triangle(center, p1, p3);


        // Debugging print statements for new triangles
        System.out.println("New Triangles at Level: " + level);
        System.out.println("t1: Center (" + center.getX() + ", " + center.getY() + "), p1 (" + p1.getX() + ", " + p1.getY() + "), p2 (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("t2: Center (" + center.getX() + ", " + center.getY() + "), p2 (" + p2.getX() + ", " + p2.getY() + "), p3 (" + p3.getX() + ", " + p3.getY() + ")");
        System.out.println("t3: Center (" + center.getX() + ", " + center.getY() + "), p3 (" + p3.getX() + ", " + p3.getY() + "), p1 (" + p1.getX() + ", " + p1.getY() + ")");

        // Recursively generate the fractal for each smaller triangle
        TriHelperMethod(t1, level - 1);
        TriHelperMethod(t2, level - 1);
        TriHelperMethod(t3, level - 1);
    }

    private Point[] arrayConverter() {
        Point[] p = new Point[arrayP.size()];
        System.out.println(p.length);
        for (int i = 0; i < arrayP.size(); i++) {
            p[i] = arrayP.get(i);
        }

        return p;
    }
}
