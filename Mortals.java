
package superwariobrothers;

import javafx.scene.input.KeyCode;


public abstract class Mortals extends Drawable{
    
    public abstract void jump();
    
    public abstract void move();
    
    public abstract void move(KeyCode key); // player
    
//  public boolean dead(){
//        
//    }
}
