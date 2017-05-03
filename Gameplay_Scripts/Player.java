/*
 * For license info, see the accompanied licence document.
 */
package minionworld;

/**
 *
 * @author Surowa
 */
public class Player {
 //usable variables:
 private int x, y;
 private boolean left, right, up, down;
 
 
 public void update() {
   //function that manually checks for updates
   
    
 }
//functions that determine the direction the overlord moves to:
public void setLeft (boolean newleft) {
    left = newLeft;
}public void setUp (boolean newUp){
    up = newUp;
}public void setDown (boolean newDown){
    down = newDown;
}public void setRight (boolean newRight){
    right= newRight;
}
//determines and returns current x-axis
public int getX(){
    return x;

}
//determines and returns current Y-axis
public int getY(){
 return y;
 
 
}

//moves the Overlord according to the current direction
public void move(){
    if (left){
        x--;
    }if (right){
        x++;
    }if (up){
        y--;
    }if (down){
        y++;
        
    }
}



}