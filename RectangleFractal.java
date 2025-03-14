import java.util.ArrayList;
import java.util.Arrays;

public class RectangleFractal extends Fractal{

    ArrayList<Point> ArrayPoints = new ArrayList<>();

    
    public RectangleFractal(Rectangle shape, int level) {
        super(shape, level);

        rectangleHelper(shape, level);
        setPoints(arrayConverter());
    }

    private void rectangleHelper(Rectangle shape, int level){
        Point[] points = shape.getPoints();
        ArrayPoints.addAll(Arrays.asList(points));
        ArrayPoints.add(points[0]);

        if(level <= 0 ){
            return;
        }

        Point starterPoint = points[0];
        double starterX = starterPoint.getX();
        double starterY = starterPoint.getY();

        double DeltaWidth = shape.getWidth()/3;

        double DeltaHeight = shape.getHeight()/3;

        for (int i = 0; i < 3; i++){ 
            for (int j = 0; j < 3; j++){ 
                if (i == 1 && j == 1){ 
                    continue; // Skip the center rectangle 
                } 
                Point newTopLeft = new Point(starterX + i * DeltaWidth, starterY + j * DeltaHeight); 
                Point newTopRight = new Point(newTopLeft.getX() + DeltaWidth, newTopLeft.getY()); 
                Point newBottomRight = new Point(newTopLeft.getX() + DeltaWidth, newTopLeft.getY() + DeltaHeight); 
                Point newBottomLeft = new Point(newTopLeft.getX(), newTopLeft.getY() + DeltaHeight); 
                
                
                Point[] newPoints = {newTopLeft, newTopRight, newBottomRight, newBottomLeft}; 

                //create a polygon with the points to call its getCenter method to get the center of the rectangle 
                Polygon centerMaker = new Polygon(newPoints); 

                Point center = centerMaker.getCenter();

                System.out.println("X is " + center.getX() + "  " +  " Y is  " + center.getY());

                rectangleHelper(new Rectangle(center, DeltaWidth, DeltaHeight), level - 1); 
            } 
            ArrayPoints.add(null);
        } 
    }

    private Point[] arrayConverter() {
        Point[] p = new Point[ArrayPoints.size()];
        System.out.println(p.length);
        for (int i = 0; i < ArrayPoints.size(); i++) {
            p[i] = ArrayPoints.get(i);
        }
        return p;
    }

    
}
