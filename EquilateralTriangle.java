/**
 * Class representing an equilateral triangle, a specific type of nGon.
 */
public class EquilateralTriangle extends nGon implements isTriangle{
    
    /**
     * Constructor to create an EquilateralTriangle with the given center point and side length.
     * 
     * @param center The center point of the equilateral triangle.
     * @param sidelength The length of each side of the equilateral triangle.
     */
    public EquilateralTriangle(Point center, double sidelength) {
        super(center, sidelength,3);
    }

    /**
     * Sets the side length of the equilateral triangle and updates the vertices accordingly.
     * 
     * @param d The new length of each side.
     */
    @Override
    public void setSideLength(double d) {
        super.setSideLength(d);
        getPoints()[0] = new Point(getCenter().getX(), getCenter().getY() + (getSideLength() / (2 * Math.tan(Math.PI / 3))));
        getPoints()[1] = new Point(getCenter().getX() - (getSideLength() / 2), getCenter().getY() - (getSideLength() / (2 * Math.tan(Math.PI / 3))));
        getPoints()[2] = new Point(getCenter().getX() + (getSideLength() / 2), getCenter().getY() - (getSideLength() / (2 * Math.tan(Math.PI / 3))));
    }

    //heart breaking code I had to remove cause i got a better way to do it
    //new Point(center.getX(), center.getY() + (sidelength / (2 * Math.tan(Math.PI / 3)))),
    //new Point(center.getX() - (sidelength / 2), center.getY() - (sidelength / (2 * Math.tan(Math.PI / 3)))),
    //new Point(center.getX() + (sidelength / 2), center.getY() - (sidelength / (2 * Math.tan(Math.PI / 3))))
    


}
