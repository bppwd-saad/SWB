
package superwariobrothers;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Hittables extends Interactables{
        
    
    
    public Hittables(int xCoordinate,int yCoordinate,int width,int height){
        x= xCoordinate;
        y= yCoordinate;
        w= width;
        h= height;
    }
    
    
    
    
    
    
    @Override
    public void update(){
        
    }
    
    
    @Override
    public void draw(GraphicsContext gc){
        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(x, y, w, h);
    }
}
