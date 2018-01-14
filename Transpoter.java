
package snakeandladdergame;

public class Transpoter {
    protected int mouth;
    protected int tail;
    
    public Transpoter(int mouth,int tail){
        if(mouth>tail){
            this.mouth=mouth;
            this.tail=tail;
        }
        else if(mouth<tail){
            this.mouth=tail;
            this.tail=mouth;
        }
    }
    
}
