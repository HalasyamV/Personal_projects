import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {
    @Test
    public void testGetCenter() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(2, 3);
        Triangle triangle = new Triangle(p1, p2, p3);
        

        assertEquals(2, triangle.getCenter().getX(),1e-9);
        assertEquals(1, triangle.getCenter().getY(),1e-9);
    }
}
