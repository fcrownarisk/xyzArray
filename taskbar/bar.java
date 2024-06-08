import java.awt.GraphicsEnvironment;
import java.awt.GraphicsConfiguration;
abstract class Graphics{
    public static void main(String args[]){
            GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().
                    getDefaultScreenDevice().getDefaultConfiguration();
    }
}
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.GradientPaint;
//import java.awt.GraphicsDevice;
//import java.awt.GraphicsConfigTemplate;