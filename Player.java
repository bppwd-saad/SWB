
package superwariobrothers;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.LEFT;
import static javafx.scene.input.KeyCode.RIGHT;
import static javafx.scene.input.KeyCode.UP;
import javafx.scene.paint.Color;


public class Player extends Mortals{
    Color fill;
    //power
    int xVel = 0;
    KeyCode key;
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
        System.out.println("Jumping");
        for(int i = 0; i < 25; i++){
            y--;
        }
    }
    @Override
    public void move(KeyCode key){
        if(key == RIGHT){
            xVel = 2;
        }else if(key == LEFT){
            xVel = -2;
        }else if(key == DOWN && (x+w) < 925 && (y+h) < 925 && y >= 850){
            y += 25;
        }
        
    }
    @Override
    public void move() {}

    @Override
    protected void draw(GraphicsContext gc) {
        gc.setFill(fill);
        gc.fillRect(x, y, w, h);
    }

    @Override
    protected void update() {
        if((x+w) < 900 && (y+h) < 900)
           y++;
        x+=xVel;
    }
   
}
