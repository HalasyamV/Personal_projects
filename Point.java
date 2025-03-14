public class Point {
    private double X;

    private double Y;

    //Constructor
    public Point(double x, double y){
        X = x;
        Y = y;
    }

    public double getX(){
        return X;
    }

    public double getY(){
        return Y;
    }

    public void setX(double d){
        X = d;
    }

    public void setY(double d){
        Y = d;
    }

    public void rotateAbout(Point p, double angle){
        double cosA = Math.cos(angle);
        double sinA = Math.sin(angle);
    
        double deltaX = getX() - p.getX();
        double deltaY = getY() - p.getY();
        
        double xNew = p.getX() + (deltaX * cosA - deltaY * sinA);
        double yNew = p.getY() + (deltaX * sinA + deltaY * cosA);
    
        setX(xNew);
        setY(yNew);
    }
}
