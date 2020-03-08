
package t1q4;

import java.util.ArrayList;
import java.util.Collections;

public class T1Q4{

    public static void main(String[] args) {
//        SmartPhone [] smartphone = {
//            new SmartPhone("iPhone", 2400),
//            new SmartPhone("Samsung", 2200),
//            new SmartPhone("Nokia", 1400),
//            new SmartPhone("LG", 1800)
//        };
//
//         System.out.println("List of Smart Phone: ");
//         for (SmartPhone sp : smartphone){
//
//             System.out.println(sp.getName() + " (RM " + sp.getPrice() + ") ");
//         }



        //ArrayList<ClassName> ListName = new ArrayList<SmartPhone>;
        ArrayList<SmartPhone> list = new ArrayList<SmartPhone>();
        list.add(new SmartPhone("iPhone", 2400));
        list.add(new SmartPhone("Samsung", 2200));
        list.add(new SmartPhone("Nokia", 1400));
        list.add(new SmartPhone("LG", 1800));

        System.out.println("List of Smart Phone: ");
        for(SmartPhone sp : list){
            System.out.print(sp.toString());
        }
        
        Collections.sort(list);
        System.out.println("\nList of Smart Phone in ascending order of the price ");
        for(SmartPhone sp : list){
            System.out.print(sp.toString());
        }
        
    }
    
    
//    (if want use public class T1Q4 extends SmartPhone) then have to initialize this constructor
//    public T1Q4(String name, int price) {
//        super(name, price);
//    }
    
}
