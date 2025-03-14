public class Square extends Rectangle{


    public Square(Point center, double sidelength){
        super(center, sidelength, sidelength);
    }

    @Override
    public void setHeight(double height){
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setHeight(width);
    }
    
}
