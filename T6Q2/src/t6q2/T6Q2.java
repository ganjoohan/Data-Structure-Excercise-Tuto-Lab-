/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6q2;

/**
 *
 * @author User
 */
public class T6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayQueue <String> queue = new ArrayQueue<>();
        System.out.println("Queue Implementatio using Array");
        System.out.println("Enqueue three nodes");
        queue.enqueue("B");
        queue.enqueue("M");
        queue.enqueue("W");
        queue.showQueue();
        System.out.println("\nDequeue one node");
        queue.dequeue();
        queue.showQueue();
        System.out.println("\nThe front node of the queue is "+queue.peek());
        System.out.println("The queue size is "+queue.getSize());
    }
    
}
