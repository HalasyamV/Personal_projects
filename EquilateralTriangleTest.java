import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EquilateralTriangleTest {
    @Test
    public void testSetSideLength() {
        Point center = new Point(0, 0);
        double sideLength = 2;
        EquilateralTriangle triangle = new EquilateralTriangle(center, sideLength);

        triangle.setSideLength(4);

        Point[] points = triangle.getPoints();
        double height = 4 / (2 * Math.tan(Math.PI / 3));

        assertEquals(0, points[0].getX(),1e-9);
        assertEquals(center.getY()+height, points[0].getY(),1e-9);
        assertEquals(-2, points[1].getX(),1e-9);
        assertEquals(center.getY()-height, points[1].getY(),1e-9);
        assertEquals(2, points[2].getX(),1e-9);
        assertEquals(center.getY()-height, points[2].getY(),1e-9);

    }
}
