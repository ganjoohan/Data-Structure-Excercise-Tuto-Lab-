
package t2q2;

public class T2Q2 {

  
    public static void main(String[] args) {
        Integer [] num = {3,2,5,0,1};
        Character [] letter = {'P','I','V','C','D'};
        SpecialEncoding<Integer> a = new SpecialEncoding<>(num);
        SpecialEncoding<Character> b = new SpecialEncoding<>(letter);
        System.out.println(a.toString());
        System.out.println(b.toString());
        
    }
    
}
