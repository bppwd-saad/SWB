
package superwariobrothers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SuperWarioBrothers{
    
    GameFramework gfw;
    Player player1 = new Player(Color.BLACK, 0, 850, 50, 50);
    
    
    public void start(Stage primaryStage) {
        
    }
    
    public SuperWarioBrothers(GameFramework gf){
        gfw = gf;
    }
    
    
    public void initialize(){
        gfw.setWindow("Super Wario Bros", 900, 900, Color.SKYBLUE);
    }
    
    public void keyPressed(KeyEvent event){
        if(null != event.getCode())
            switch (event.getCode()) {
            case RIGHT:
                player1.move(KeyCode.RIGHT);
                break;
            case LEFT:
                player1.move(KeyCode.LEFT);
                break;
            case UP:
                player1.jump();
                break;
            case DOWN:
                player1.move(KeyCode.DOWN);
                break;
            default:
                break;
        }
    }
    
    public void keyReleased(KeyEvent event){
        
    }
    
    public void mousePressed(MouseEvent event){
        
    }
    
    public void mouseReleased(MouseEvent event){
        
    }
    
    public void update(float dt){
        player1.update();
    }
    
    public void draw(GraphicsContext gc){
        player1.draw(gc);
    }
    
}
