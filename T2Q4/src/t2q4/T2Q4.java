
package t2q4;
public class T2Q4 {

    public static void main(String[] args) {
        ArrayDice<Integer> a = new ArrayDice<>(5);
        ArrayDice<?> b = new ArrayDice<>(4);
        LinkedListDice<?> c = new LinkedListDice<>(3);
        LinkedListDice<?> d = new LinkedListDice<>(4);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
    }
    
}
