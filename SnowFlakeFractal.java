public class SnowFlakeFractal extends Fractal{
    
    public SnowFlakeFractal(nGon shape, int level) {
        super(shape, level);
        fractalHelperMethod();
    }

    public SnowFlakeFractal(Square s, int level){
        super(s, level);
        fractalHelperMethod();
    }

    public final void fractalHelperMethod() {
        if (getNumLevels() <= 0) {
            return;
        }
        //(getLines().length * 4 * getNumLevels()) +1
        //fix this method with mathematical formula
        Point[] points = new Point[getLines().length * 4 * (int)Math.pow(5, getNumLevels())];
        int displacement = 0;
        
        for (int k = 0; k < getNumLevels(); k++) {
            Line[] lines = getLines();
            for (Line line : lines) {
                Point firstPoint = line.getFirstPoint();
                Point secondPoint = line.getSecondPoint();
                if(secondPoint == null || firstPoint == null){
                    //System.out.println(displacement);
                    break;
                }
                double deltaX = (secondPoint.getX() - firstPoint.getX()) / 3; // Divide by 3 to split into 3 segments
                double deltaY = (secondPoint.getY() - firstPoint.getY()) / 3;
    
                //Create the intermediate points
                Point p1 = firstPoint;
                Point p2 = new Point(firstPoint.getX() + deltaX, firstPoint.getY() + deltaY);
                Point p3 = new Point(firstPoint.getX() + 2 * deltaX, firstPoint.getY() + 2 * deltaY);
                Point p4 = secondPoint;
                
                // Calculate the middle point for the "spike"
                Point midPoint = new Point(p3.getX(), p3.getY());
                midPoint.rotateAbout(p2, -(Math.PI / 3)); // 60 degrees rotation

                points[displacement] = p1;
                points[displacement + 1] = p2;
                points[displacement + 2] = midPoint;
                points[displacement + 3] = p3;
                points[displacement + 4] = p4;

                displacement += 4;
            }
            // Update points for the next iteration
            setPoints(points);
        }
    }
    
}
