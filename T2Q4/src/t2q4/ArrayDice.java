
package t2q4;

import java.util.Random;


public class ArrayDice<T> implements Dice<T>{
    private int time;
    private int[] dice;
    private int total;

    public ArrayDice(int time) {
        this.time = time;
        dice = new int[time];
    }
    
    @Override
    public void roll(){
        Random rand = new Random();
        for(int i=0;i<time;i++){
            dice[i]=rand.nextInt(6)+1;   
        }
    }
    
    
    @Override
    public String toString(){
        System.out.println("Array Implementation: Roll " + time + " time(s)");
        roll();
        for(int a:dice){
            total += a;
            System.out.print(a+" ");
        }
        return "\nTotal is " + total;
    }
}
