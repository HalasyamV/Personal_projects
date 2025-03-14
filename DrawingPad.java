import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawingPad {
    private JFrame frame;
    private Canvas canvas;
    private JPanel panel;
    private Graphics graphicsContext = null;

    public DrawingPad(int width , int height){
        JFrame frame = new JFrame();
        Canvas canvas = new Canvas();
        JPanel panel = new JPanel();
        canvas.setSize(width,height);
        canvas.setBackground(Color.white);
        panel.add(canvas);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        this.canvas = canvas;
        this.panel = panel;
         this.frame = frame;
     }
    public Graphics getGraphicsContent(){
        if(graphicsContext == null){
            graphicsContext = canvas.getGraphics();
        }else{
        return graphicsContext;
        }
        return graphicsContext;
    }

    public Canvas getCanvas(){
        return canvas;
    }

    public void Draw(Polygon shape){
        getGraphicsContent().setColor(Color.BLACK);
        for (int i = 0; i < shape.getLines().length; i++) {
            getGraphicsContent().drawLine((int)shape.getLines()
                [i].getFirstPoint().getX(), (int)shape.getLines()[i].getFirstPoint().getY(),(int)shape.getLines()[i].getSecondPoint().getX(), (int)shape.getLines()[i].getSecondPoint().getY());
        }
    }


    public void erase(){
        getGraphicsContent().setColor(Color.white);
        getGraphicsContent().fillRect(0, 0,getCanvas().getWidth(),
    getCanvas().getHeight());
    }
}