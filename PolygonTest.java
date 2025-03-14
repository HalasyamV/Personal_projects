import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PolygonTest {
    @Test
    public void testGetCenter() {
        Point center = new Point(2, 2);
        double width = 2;
        double height = 2;
        Rectangle rectangle = new Rectangle(center, width, height);

        assertEquals(2.0, rectangle.getCenter().getX(),1e-9);
        assertEquals(2.0, rectangle.getCenter().getY(),1e-9);
    }   

    @Test
    public void testGetLines() {
        Point center = new Point(2, 2);
        double width = 2;
        double height = 2;
        Rectangle rectangle = new Rectangle(center, width, height);
        Line[] lines = rectangle.getLines();

        Point[] points = rectangle.getPoints();
        assertEquals(points[0], lines[0].getFirstPoint());
        assertEquals(points[1], lines[0].getSecondPoint());

        assertEquals(points[1], lines[1].getFirstPoint());
        assertEquals(points[2], lines[1].getSecondPoint());

        assertEquals(points[2], lines[2].getFirstPoint());
        assertEquals(points[3], lines[2].getSecondPoint());

        assertEquals(points[3], lines[3].getFirstPoint());
        assertEquals(points[0], lines[3].getSecondPoint());
    }


    @Test
    public void testSetCenter() {
        Point center = new Point(2, 2);
        double width = 2;
        double height = 2;
        Rectangle rectangle = new Rectangle(center, width, height);

        Point newCenter = new Point(3, 3);
        rectangle.setCenter(newCenter);

        assertEquals(3,rectangle.getCenter().getX() ,1e-9);
        assertEquals(3,rectangle.getCenter().getY() ,1e-9);

        newCenter.setX(1);
        newCenter.setY(2);
        rectangle.setCenter(newCenter);

        assertEquals(1,rectangle.getCenter().getX() ,1e-9);
        assertEquals(2,rectangle.getCenter().getY() ,1e-9);

    }

    @Test
    public void testRotate(){
        Point center = new Point(0, 0);
        double width = 2;
        double height = 4;
        Rectangle rectangle = new Rectangle(center, width, height);
        
        double angle = Math.PI / 2;

        rectangle.rotate(angle);

        Point[] points = rectangle.getPoints();

        assertEquals(2, points[0].getX(), 1e-9);
        assertEquals(-1, points[0].getY(), 1e-9);

        assertEquals(2, points[1].getX(), 1e-9);
        assertEquals(1, points[1].getY(), 1e-9);

        assertEquals(-2, points[2].getX(), 1e-9);
        assertEquals(1, points[2].getY(), 1e-9);

        assertEquals(-2, points[3].getX(), 1e-9);
        assertEquals(-1, points[3].getY(), 1e-9);

    }

}
