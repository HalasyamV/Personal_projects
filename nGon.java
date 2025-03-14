/**
 *  class representing an n-sided polygon (nGon).
 */
public class nGon extends Polygon {
    private Point center;
    private double sidelength;

    /**
     * Constructor to create an nGon with the given center point, side length, and array of points.
     * 
     * @param center The center point of the nGon.
     * @param sidelength The length of each side of the nGon.
     * @param arrPoints Array of Point objects representing the vertices of the nGon.
     */
    public nGon(Point center, double sidelength, int numberSides) {
        super(helperMethod(center, sidelength, numberSides));
        this.sidelength = sidelength;
        this.center = center;
    }

    public static Point[] helperMethod(Point center, double sidelength, int nSides) {
        double rotationAngle = (2 * Math.PI) / nSides;
        Point[] arrP = new Point[nSides];
        double radius = sidelength / (2 * Math.sin(Math.PI / nSides));
    
        for (int i = 0; i < nSides; i++) {
            double angle = i * rotationAngle;
            double x = center.getX() + radius * Math.cos(angle);
            double y = center.getY() + radius * Math.sin(angle);
            arrP[i] = new Point(x, y);
    
        }
    
        return arrP;
    }
    
 
    /**
     * Returns the length of each side of the nGon.
     * 
     * @return The length of each side.
     */
    public double getSideLength() {
        return sidelength;
    }

    /**
     * Sets the length of each side of the nGon.
     * 
     * @param d The new length of each side.
     */
    public void setSideLength(double d) {
        sidelength = d;
    }

    /**
     * Returns the number of sides of the nGon.
     * 
     * @return The number of sides.
     */
    public int getNumSides() {
        return getPoints().length;
    }

    /**
     * Returns the center point of the nGon.
     * 
     * @return The center point.
     */
    @Override
    public Point getCenter() {
        return center;
    }
}
