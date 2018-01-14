

package snakeandladdergame;

public class Dice {
    public static int Roll(){
    	
        return ((int)(Math.random()*109987))%6 + 1;
    }
}
