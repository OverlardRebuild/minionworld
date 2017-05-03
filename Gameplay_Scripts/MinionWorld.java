/*
 * For license info, see the accompanied licence document.
 */
package minionworld;

/**
 *
 * @author Surowa
 */
public class MinionWorld {

      public static void main(String[] args) {
        System.out.println("Minion World has started!");
        Game ex = new Game (); //Creates new game object
        new Thread (ex).start(); //starts new game object
    }
  
}
