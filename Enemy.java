
package superwariobrothers;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;


public class Enemy extends Mortals{
    private int jumpCounter = 0;
    public Enemy(int xCoordinate,int yCoordinate,int width,int height){
        x = xCoordinate;
        y = yCoordinate;
        w = width;
        h = height;
    }
    
    @Override
    public void jump() {
        y -= 50;
    }

    @Override
    public void move() {
        x -= 1;
    }
    
    public boolean isTouchingPlatform(Platform platform1){
        if(platform1.y != y + h){
            return false;
        }
        return true;
    }
    //type()- enum
    public void gravity(){
        y += 1;
    }
    
    @Override
    protected void update() {
        move();
        
        if(jumpCounter == 240){
            jump();
            jumpCounter = 0;
        }
        jumpCounter++;
                   
    }
    
    @Override
    protected void draw(GraphicsContext gc) {
        gc.setFill(Color.DARKMAGENTA);
        gc.fillRect(x, y, w, h);
    }

    @Override
    public void move(KeyCode key) {
        
    }

    
}
