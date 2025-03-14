/**
 * Class representing a triangle, a specific type of polygon.
 */
public class Triangle extends Polygon implements isTriangle{
    Point point1;
    Point point2;
    Point point3;

    /**
     * Constructor to create a Triangle with the given three points.
     * 
     * @param p1 First point of the triangle.
     * @param p2 Second point of the triangle.
     * @param p3 Third point of the triangle.
     */
    public Triangle(Point p1, Point p2, Point p3) {
        super(new Point[]{p1, p2, p3});
        point1 = p1;
        point2 = p2;
        point3 = p3;
    }

    /**
     * Calculates and returns the center of the triangle.
     * The center is calculated as the intersection of the medians.
     * 
     * @return The center point of the triangle.
     */
    @Override
    public Point getCenter() {
        double x1 = getPoint1().getX();
        double y1 = getPoint1().getY();
        double x2 = (getPoint2().getX() + getPoint3().getX()) / 2;
        double y2 = (getPoint2().getY() + getPoint3().getY()) / 2;
        double x3 = getPoint2().getX();
        double y3 = getPoint2().getY();
        double x4 = (getPoint1().getX() + getPoint3().getX()) / 2;
        double y4 = (getPoint1().getY() + getPoint3().getY()) / 2;
        
        double xNumerator = (x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4);
        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        double x = xNumerator / denominator;
        double yNumerator = (x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4);
        double y = yNumerator / denominator;
        
        return new Point(x, y);
    }

    /**
     * Returns the first point of the triangle.
     * 
     * @return First point of the triangle.
     */
    public Point getPoint1() {
        return point1;
    }

    /**
     * Returns the second point of the triangle.
     * 
     * @return Second point of the triangle.
     */
    public Point getPoint2() {
        return point2;
    }

    /**
     * Returns the third point of the triangle.
     * 
     * @return Third point of the triangle.
     */
    public Point getPoint3() {
        return point3;
    }

    /**
     * Sets the first point of the triangle.
     * 
     * @param point1 First point to be set.
     */
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    /**
     * Sets the second point of the triangle.
     * 
     * @param point2 Second point to be set.
     */
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    /**
     * Sets the third point of the triangle.
     * 
     * @param point3 Third point to be set.
     */
    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

}
