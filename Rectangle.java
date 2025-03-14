/**
 * Class representing a rectangle, a specific type of polygon.
 */
public class Rectangle extends Polygon {
    private double width;
    private double height;

    /**
     * Constructor to create a Rectangle with the given center point, width, and height.
     * 
     * @param center The center point of the rectangle.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(Point center, double width, double height) {
        super(new Point[]{
            new Point(center.getX() - width / 2, center.getY() - height / 2),
            new Point(center.getX() + width / 2, center.getY() - height / 2),
            new Point(center.getX() + width / 2, center.getY() + height / 2),
            new Point(center.getX() - width / 2, center.getY() + height / 2)
        });
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the width of the rectangle.
     * 
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the height of the rectangle.
     * 
     * @return The height of the rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the rectangle and updates the vertices accordingly.
     * 
     * @param height The new height of the rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
        getPoints()[0] = new Point(getCenter().getX() - getWidth() / 2, getCenter().getY() - getHeight() / 2);
        getPoints()[1] = new Point(getCenter().getX() + getWidth() / 2, getCenter().getY() - getHeight() / 2);
        getPoints()[2] = new Point(getCenter().getX() + getWidth() / 2, getCenter().getY() + getHeight() / 2);
        getPoints()[3] = new Point(getCenter().getX() - getWidth() / 2, getCenter().getY() + getHeight() / 2);
    }

    /**
     * Sets the width of the rectangle and updates the vertices accordingly.
     * 
     * @param width The new width of the rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
        getPoints()[0] = new Point(getCenter().getX() - getWidth() / 2, getCenter().getY() - getHeight() / 2);
        getPoints()[1] = new Point(getCenter().getX() + getWidth() / 2, getCenter().getY() - getHeight() / 2);
        getPoints()[2] = new Point(getCenter().getX() + getWidth() / 2, getCenter().getY() + getHeight() / 2);
        getPoints()[3] = new Point(getCenter().getX() - getWidth() / 2, getCenter().getY() + getHeight() / 2);
    }
}
