
package superwariobrothers;

import javafx.scene.input.KeyCode;


public abstract class Mortals extends Drawable{
    
    public abstract void jump();
    
    public abstract void move(KeyCode key); // Player
    
    public abstract void move(); // Enemies and everything else
    
//    public boolean dead(){
//        
//    }
}
