/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7q3;

public class T7Q3 {

    public static void main(String[] args) { 

        String str = "FACULTY"; 
        ArrayBST<Character> tree = new ArrayBST<>(); 
        
        for(char c : str.toCharArray()) tree.addNode(c); 
        displayTree(tree); 
         
        System.out.println("Remove 1 Character L"); 
        tree.removeNode('L'); 
        displayTree(tree); 
        
    } 
     
    public static void displayTree(ArrayBST<Character> tree){ 
        System.out.println("The number of elements in the tree : " + tree.getSize()); 
        System.out.print("The tree elements - PREORDER : "); 
        tree.setOrder(ArrayBST.PREORDER); 
        tree.showTree();
         
        System.out.print("\nThe tree elements - INORDER : "); 
        tree.setOrder(ArrayBST.INORDER); 
        tree.showTree(); 
         
        System.out.print("\nThe tree elements - POSTORDER : "); 
        tree.setOrder(ArrayBST.POSTORDER); 
        tree.showTree(); 
        System.out.println("\n"); 
         
    } 
   
}
