import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void testRotateAbout() {
        Point center = new Point(0, 0);
        Point p = new Point(1, 0);
        double angle = 0;  

        p.rotateAbout(center, angle);
        assertEquals(1.0, p.getX(),1e-9);
        assertEquals(0.0, p.getY(), 1e-9);

        angle = Math.PI/2;

        p.rotateAbout(center, angle);
        assertEquals(0.0, p.getX(),1e-9);
        assertEquals(1.0, p.getY(), 1e-9);
        
        p.setX(1);
        p.setY(0);
        angle = 0.785398;

        p.rotateAbout(center, angle);
        assertEquals(0.7071068967259818, p.getX(),1e-9);
        assertEquals(0.7071066656470943, p.getY(), 1e-9);

        p.setX(1);
        p.setY(0);

        angle = Math.PI;

        p.rotateAbout(center, angle);
        assertEquals(-1.0, p.getX(),1e-9);
        assertEquals(0.0, p.getY(), 1e-9);

        p.setX(1);
        p.setY(0);

        angle = (Math.PI*3)/2;

        p.rotateAbout(center, angle);
        assertEquals(0.0, p.getX(),1e-9);
        assertEquals(-1.0, p.getY(), 1e-9);


    }
}
