

public class Line {

    private Point StartPoint;

    private Point EndPoint;


    //Conctructor 1 for two points
    public Line(Point StarPoint, Point EndPoint){
        this.StartPoint = StarPoint;
        this.EndPoint = EndPoint;
    }

    //Constructor 2 for 4 points
    public Line(double StartX, double  StartY, double EndX , double EndY){
        Point Startpoint = new Point(StartX,StartY);
        Point EndPoint = new Point(EndX, EndY);

        this.StartPoint = Startpoint;
        this.EndPoint = EndPoint;
    }

    public Point getFirstPoint(){
        return StartPoint;
    }

    public Point getSecondPoint(){
        return EndPoint;
    }

    public void setFirstPoint(Point p){
        this.StartPoint = p;
    }

    public void setSecondPoint(Point p){
        EndPoint = p;
    }

    public Line[] getLines(){
        Line[] Lines = new Line[]{this};
        return Lines;
    }
}
