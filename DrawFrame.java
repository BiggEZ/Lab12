
import java.awt.Color;
import java.awt.Point;
import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 350, Color.BLACK, true);
        Circle circleOutline = new Circle(new Point(400, 300), 567, Color.BLACK, false);
        
        // Ears:
        RightTriangle leftEar = new RightTriangle(new Point(500, 175), -30, -120, Color.BLACK, true);
        RightTriangle leftEarPink = new RightTriangle(new Point(495, 175), -15, -100, Color.PINK, true);
        RightTriangle rightEar = new RightTriangle(new Point(295, 175), 30, -120, Color.BLACK, true);
        RightTriangle rightEarPink = new RightTriangle(new Point(300, 175), 15, -100, Color.PINK, true);
        
        // Eyes:
        Oval leftEye = new Oval(new Point(475, 210), 60, 60, Color.YELLOW, true);
        Oval leftIris = new Oval(new Point(475, 210), 30, 60, Color.BLACK, true);
        Oval rightEye = new Oval(new Point(325, 210), 60, 60, Color.YELLOW, true);
        Oval rightIris = new Oval(new Point(325, 210), 30, 60, Color.BLACK, true);
        
        PolyLine rightEyeLid = new PolyLine(new Point(290, 170), new Point(370, 190), 20, Color.BLACK, true);
        PolyLine leftEyeLid = new PolyLine(new Point(430, 190), new Point(510, 170), 20, Color.BLACK, true);
        
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(400, 300), 30, Color.RED, true);
        PolyLine rightMouth = new PolyLine(new Point(300, 320), new Point(400, 350), 45, Color.PINK, true);
        PolyLine leftMouth = new PolyLine(new Point(400, 350), new Point(500, 320), 45, Color.PINK, true);
        Oval tongue = new Oval(new Point(425, 400), 50, 70, Color.RED, true);
        
        // Collar:
        Oval collar = new Oval(new Point(400, 470), 325, 45, Color.BLUE, true);
        Circle collarRed = new Circle(new Point(400, 470), 60, Color.RED, true);
        Circle collarRing = new Circle(new Point(400, 470), 50, Color.GREEN, false);
        
        // Square around the dog:
        Square outline = new Square(new Point(400, 300), 400, Color.MAGENTA, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(outline);
        drawPanel.addShape(base);
        drawPanel.addShape(circleOutline);
        drawPanel.addShape(leftEar);
        drawPanel.addShape(rightEar);
        drawPanel.addShape(rightEarPink);
        drawPanel.addShape(leftEarPink);
        drawPanel.addShape(leftEye);
        drawPanel.addShape(rightEye);
        drawPanel.addShape(leftIris);
        drawPanel.addShape(rightIris);
        drawPanel.addShape(nose);
        drawPanel.addShape(leftMouth);
        drawPanel.addShape(rightMouth);
        drawPanel.addShape(tongue);
        drawPanel.addShape(collar);
        drawPanel.addShape(collarRed);
        drawPanel.addShape(collarRing);
        drawPanel.addShape(rightEyeLid);
        drawPanel.addShape(leftEyeLid);
        
        // set background color
        drawPanel.setBackground(Color.WHITE);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
