
package t2q4;

import java.util.LinkedList;
import java.util.Random;


public class LinkedListDice<T> implements Dice<T> {
    
    private T time;
    private LinkedList dice;
    private int total;

    public LinkedListDice(T time) {
        this.time = time;
        dice = new LinkedList<>();
    }
    
    @Override
    public void roll(){
        Random rand = new Random();
        for(int i=0;i<(Integer.parseInt(time.toString()));i++){
            dice.add(rand.nextInt(6)+1);
        }
        
    }
    
    
    @Override
    public String toString(){
        System.out.println("Linked List Implementation: Roll " + time + " time(s)");
        roll();
        for(int i=0;i<dice.size();i++){
            total += Integer.parseInt(dice.get(i).toString());
            System.out.print(dice.get(i)+" ");
        }
        return "\nTotal is " + total;
    }


}
