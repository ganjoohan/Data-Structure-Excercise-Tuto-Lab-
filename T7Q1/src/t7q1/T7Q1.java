/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7q1;

/**
 *
 * @author User
 */
public class T7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BST <Integer> tree = new BST<>();
        int [] input = {50,30,25,71,80,99,40,1,7,5};
        System.out.print("Input : ");
        for(int a:input){
            tree.addNode(a);
            System.out.print(a+" ");
        }
        System.out.print("\nThe tree elements - PRE-ORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        System.out.print("\nThe tree elements - IN-ORDER : ");
        tree.setOrder(BST.INORDER);
        tree.showTree();
        System.out.print("\nThe tree elements - POST-ORDER : ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
        System.out.println();
        
    }
    
}
