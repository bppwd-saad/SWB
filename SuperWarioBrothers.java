
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
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SuperWarioBrothers{
    
    GameFramework gfw;
    Player player1 = new Player(Color.BLACK, 450, 450, 50, 50);
    Platform platform1 = new Platform(0, 850, 900, 50);
    Enemy enemy1 = new Enemy(850, 800, 50, 50);
    Hittables block = new Hittables(500, 700, 50, 50);
    
    public void start(Stage primaryStage) {
        
    }
    
    public SuperWarioBrothers(GameFramework gf){
        gfw = gf;
    }
    
    
    public void initialize(){
        gfw.setWindow("Super Wario Bros", 900, 900, Color.SKYBLUE);
    }
    
    public void keyPressed(KeyEvent event){
        if(event.getCode() == KeyCode.RIGHT && player1.isTouching(block)== false){
             player1.move(KeyCode.RIGHT);
        }else if(event.getCode() == KeyCode.LEFT && player1.isTouching(block)== false){
            player1.move(KeyCode.LEFT);
        }else if(event.getCode() == KeyCode.UP && player1.isTouching(block)== false){
            player1.jump();
        }else if(event.getCode() == KeyCode.DOWN && player1.isTouching(block)== false){
            player1.move(KeyCode.DOWN);
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
        platform1.update();
        if(enemy1.isTouchingPlatform(platform1) == false){
            enemy1.gravity();
        }
        enemy1.update();
        block.update();
    }
    
    public void draw(GraphicsContext gc){
        player1.draw(gc);
        platform1.draw(gc);
        enemy1.draw(gc);
        block.draw(gc);
    }
    
}
