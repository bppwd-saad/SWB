
package superwariobrothers;

import javafx.scene.canvas.GraphicsContext;


public abstract class Drawable {
   
    protected int x;
    protected int y;
    protected int w;
    protected int h;
    
    protected abstract void draw(GraphicsContext gc);
    protected abstract void update();
    
}
