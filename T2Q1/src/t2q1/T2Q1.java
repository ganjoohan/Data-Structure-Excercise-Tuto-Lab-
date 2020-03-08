
package t2q1;

public class T2Q1 <T>{

    public static void main(String[] args) {
        
        Generic<String> a = new Generic<>("Hello","World");
        Generic<Double> b = new Generic<>(12.4,64.3);
        Generic<?> c = new Generic<>(20, 35);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        
        
    }
    
//    public static <E> void Sum(T a, T b){
//        if(a instanceof String && b instanceof String){
//            if (a.equals(b)){
//               System.out.println("The string is equal");
//            }
//            else 
//                System.out.println("The string is not equal");
//            
//        }
//        else if (a instanceof Integer && b instanceof Integer){
//            System.out.println("The sum of the integer is "+(a+b));
//        }
//        else if (a instanceof Double && b instanceof Double){
//            System.out.println("The sum of the double is "+(a+b));
//        }
    
        
        
    
    
    
    
}
