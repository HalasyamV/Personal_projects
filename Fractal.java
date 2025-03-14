public abstract class Fractal extends Polygon{
    private Polygon baseShape; 
    private int numLevels;
        
    public Fractal(Polygon shape , int level) {
        super(shape.getPoints());
        baseShape = shape;
        numLevels = level;
    }

    public Polygon getBaseShape() {
        return baseShape;
    }
        
    public int getNumLevels(){
        return numLevels;
    }

    public void setNumLevels(int numLevels) {
        this.numLevels = numLevels;
    }

        
}
