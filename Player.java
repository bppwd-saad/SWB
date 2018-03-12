
package superwariobrothers;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.LEFT;
import static javafx.scene.input.KeyCode.RIGHT;
import javafx.scene.paint.Color;


public class Player extends Mortals{
    Color fill;
    //power
    
    public Player(Color c, int xCoordinate, int yCoordinate, int width, int height){
        fill = c;
        x = xCoordinate;
        y = yCoordinate;
        w = width;
        h = height;
    }
    
    
    
//    public boolean isHit(){
//        
//    }

    @Override
    public void jump() {
        y -= 25;
    }
    
    @Override
    public void move(KeyCode key){
        if(key == RIGHT){
            x += 25;
        }else if(key == LEFT){
            x -= 25;
        }else if(key == DOWN){
            y += 25;
        }
    }

    public boolean isTouching(Hittables block){
        
        if(block.x <= x && block.x >= x + w && block.y >= y + h && block.y + h <= y ){
            return true;
        }
        return false;
    }



    @Override
    protected void update() {

    }
    
    @Override
    protected void draw(GraphicsContext gc){
        gc.setFill(fill);
        gc.fillRect(x, y, w, h);
    }

    @Override
    public void move() {
        
    }
   
}
