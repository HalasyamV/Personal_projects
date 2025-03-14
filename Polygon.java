/**
 * class representing a polygon.
 */
public class Polygon {
    private Point[] arrPoints;
    private Point center;

    /**
     * Constructor to create a Polygon with the given points.
     * 
     * @param arrPoints Array of Point objects representing the vertices of the polygon.
     */
    public Polygon(Point[] arrPoints) {
        this.arrPoints = arrPoints;
    }

    /**
     * Calculates and returns the center of the polygon.
     * The center is the midpoint of the bounding rectangle of the polygon.
     * 
     * @return The center point of the polygon.
     */
    public Point getCenter() { 
        double smallX = getPoints()[0].getX(); 
        double bigX = getPoints()[0].getX(); 
        double smallY = getPoints()[0].getY(); 
        double bigY = getPoints()[0].getY(); 

        for (int idx = 1; idx < getPoints().length; idx++){ // Start from index 1 
            double x = getPoints()[idx].getX(); 
            double y = getPoints()[idx].getY(); 
            if (x > bigX) { 
                bigX = x; 
            } else if (x < smallX) { 
                smallX = x; 
            } 
            if (y > bigY) { 
                bigY = y; 
            } else if (y < smallY) { 
                smallY = y; 
            } 
        } 
        return new Point((bigX + smallX) / 2, (bigY + smallY) / 2); 
    }


    /**
     * Sets the center of the polygon to a new point and adjusts the vertices accordingly.
     * 
     * @param p The new center point of the polygon.
     */
    public void setCenter(Point p) {
        double Xchange = p.getX() - getCenter().getX();
        double Ychange = p.getY() - getCenter().getY();
        this.center = p;

        for (int i = 0; i < getPoints().length; i++) {
            getPoints()[i] = new Point(getPoints()[i].getX() + Xchange, getPoints()[i].getY() + Ychange);
        }

        getLines(); // Ensures lines are updated
    }

    /**
     * Rotates the polygon around its center by a specified angle.
     * 
     * @param angle The angle in radians by which to rotate the polygon.
     */
    public void rotate(double angle) {
        Point pseudoCenter = getCenter();
        for (int i = 0; i < getPoints().length; i++) {
            arrPoints[i].rotateAbout(pseudoCenter, angle);
        }

        getLines(); // Ensures lines are updated
    }

    /**
     * Returns the array of points representing the vertices of the polygon.
     * 
     * @return Array of Point objects.
     */
    public Point[] getPoints() {
        return arrPoints;
    }

    public void setPoints(Point[] arrPoints) {
        this.arrPoints = arrPoints;
    }


    /**
     * Generates and returns an array of lines representing the edges of the polygon.
     * 
     * @return Array of Line objects representing the edges of the polygon.
     */
    public Line[] getLines() {
        Line[] arrLines = new Line[getPoints().length];
        
        for (int i = 0; i < getPoints().length - 1; i++) {
            arrLines[i] = new Line(getPoints()[i], getPoints()[i + 1]);
        }
        
        // Close the polygon by connecting the last point to the first
        arrLines[getPoints().length - 1] = new Line(getPoints()[getPoints().length - 1], getPoints()[0]);
        
        return arrLines;
    }
}
