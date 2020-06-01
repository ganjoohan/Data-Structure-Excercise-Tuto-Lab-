/*
6. Write a program to reverse the words in a sentence. (Only Queue is allowed for this question)
 */
package t6q6;

import java.util.Scanner;

/**
 *
 * @author Mesut
 */
public class T6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s ="A queue is a First In First Out (FIFO) data structure.";
        System.out.print("Enter a sentence : "+s);
//        String [] str = sc.nextLine().split(" ");
        String [] str = s.split(" ");
        Queue<String> original = new Queue<>();
        for(String str1 : str){
            original.enqueue(str1);
        }
        System.out.print("\nThe original queue : ");
        original.showQueue();
        
        //Reverse
        Queue<String> reverse = new Queue<>();
        while(!original.isEmpty()){
            Queue<String> temp = new Queue<>();
            int size = original.getSize();
            for(int i=0;i<size-1;i++){ //size-1 留最后一个不要dequeue
                temp.enqueue(original.dequeue());  //把所有在original 里面的东西暂放在temp里,**除了最后一个element**
            }
            reverse.enqueue(original.dequeue());  //把original里剩下的最后一个element放进reverse里（达成了从后面开始reverse的目的）
            while(!temp.isEmpty()){  //当temp 里的东西还没用完
                original.enqueue(temp.dequeue());  //重新把temp里的东西归还给original，再重新repeat过整个process
            }
        }
        System.out.print("\nThe reversed queue: ");
        reverse.showQueue();
        System.out.println();
    }
    
}
