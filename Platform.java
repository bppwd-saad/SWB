
package superwariobrothers;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Platform extends Interactables{
    
    public Platform(int xCoordinate, int yCoordinate, int width, int height){
        x = xCoordinate;
        y = yCoordinate;
        w = width;
        h = height;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getW(){
        return w;
    }
    
    public int getH(){
        return h;
    }
    
    @Override
    public void update(){
        
    }
    
    @Override
    public void draw(GraphicsContext gc){
        gc.setFill(Color.GREEN);
        gc.fillRect(x, y, w, h);
    }
}
