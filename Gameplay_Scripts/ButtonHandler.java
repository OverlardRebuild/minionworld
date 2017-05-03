/*
 * For license info, see the accompanied licence document.
 */
package minionworld;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Surowa
 */
public class ButtonHandler extends KeyAdapter {
 //input manager (concept)   
    public ButtonHandler(){
        System.out.println("Button handler initialised");
    
    }
    public void keyTyped (KeyEvent arg0){
        //handler which is unused because of instability
    }
    //handler that tells us what key has just been released
    public void keyReleased(KeyEvent key) {
        
        switch (key.getKeyCode()) {
           case KeyEvent.VK_UP:
              Instances.player.setUp(false);
              System.out.println(" Released UP!");
                break;
           case KeyEvent.VK_DOWN:
              System.out.println(" Released DOWN!");
              Instances.player.setDown(false);
               break;
           case KeyEvent.VK_LEFT:
              System.out.println(" Released LEFT!");
              Instances.player.setLeft(false);
               break;
           case KeyEvent.VK_RIGHT:
              System.out.println(" Released RIGHT!");
              Instances.player.setRight(false);
               break;
        
        
    
    
    
    }
    //handler that tells to use a function as soon as key is pressed
    public void keyPressed (KeyEvent key) {
        
        switch (key.getKeyCode()){
                        case KeyEvent.VK_UP:
                           Instances.player.setUp(true);
                             break;
                        case KeyEvent.VK_DOWN:
                           Instances.player.setDown(true);
                            break;
                        case KeyEvent.VK_LEFT:
                           Instances.player.setLeft(true);
                            break;
                        case KeyEvent.VK_RIGHT:
                           Instances.player.setRight(true);
                            break;
        }
        
        
        
        
        
        
    }
    
    
    
    
}
