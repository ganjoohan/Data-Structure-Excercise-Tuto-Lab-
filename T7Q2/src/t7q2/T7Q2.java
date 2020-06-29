
package t7q2;


public class T7Q2 {

    public static void main(String[] args) {
        BST<Character> tree = new BST <>();
        tree.addNode('F');
        tree.addNode('A');
        tree.addNode('C');
        tree.addNode('U');
        tree.addNode('L');
        tree.addNode('T');
        tree.addNode('Y');
        
        System.out.println("The number of elements in the tree: "+tree.getSize());
        System.out.print("The tree elements - PREORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        System.out.print("\nThe tree elements - INORDER : ");
        tree.setOrder(BST.INORDER);
        tree.showTree();
        System.out.print("\nThe tree elements - POSTORDER : ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
        
        //Removing
        System.out.println("\nRemove 1 Character L");
        tree.remove('L');
        System.out.println("The number of elements in the tree : "+tree.getSize());
        System.out.print("The tree elements - PREORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        System.out.print("\nThe tree elements - INORDER : ");
        tree.setOrder(BST.INORDER);
        tree.showTree();
        System.out.print("\nThe tree elements - POSTORDER : ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
        System.out.println();
        
    }
     
    
}
