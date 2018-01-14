
package snakeandladdergame;

import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Player implements java.io.Serializable{
    private String Name;
    private int position;
    private int score;
    private Color c;
    private int BestScore;
    
    public Player(String Name,Color c){
        this.Name=Name;
        this.position=1;
        this.score=0;
        this.c=c;
    }
    
    @SuppressWarnings("static-access")
    public int play(int Customboardlength,int Customboardheight,Snake[] Snakes,Ladder[] Ladders){
    	ArrayList<Integer> diceval = new ArrayList<Integer>();
    	
    	
    	int d=Dice.Roll();
    	diceval.add(d);
    	JOptionPane.showMessageDialog(null,"Value on the dice rolled is: "+ d);
        
        int a=this.position + d;       
        if(a<=Customboardlength*Customboardheight){
            if(Snakes[a-1]!=null){
                this.position=Snakes[a-1].tail;
                JOptionPane.showMessageDialog(null,"Snake at board position "+ Integer.toString(Snakes[a-1].mouth)+" got you!");
            }
            else if(Ladders[a-1]!=null){
                this.position=Ladders[a-1].mouth;
                JOptionPane.showMessageDialog(null,"You are up through ladder at position "+Integer.toString(Ladders[a-1].tail)+"!");
            }
            else this.position=a;
       } 
        this.score++;
        return d;
    }
    
    public void setPosition(int i){
        this.position=i;
    }
    public int getPosition(){
        return this.position;
    }
    public Color getColor(){
        return this.c;
    }
    public String getName(){
        return this.Name;
    }
        public int getScore(){
        return this.score;
    }
    public int getBestScore(){
        return this.BestScore;
    }
    public void setBestScore(int b){
        this.BestScore = b;
    }
}
