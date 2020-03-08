
package l2q1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Generator<T>{
    T obj;
    static Random r;

    public Generator(int N, T obj) throws Exception {
        this.r = new Random();
        this.obj = obj;
        
        // Because in this method we only generate 100 random number in a list & shuffle
        if(N>100) throw new Exception("Over limit"); 
        
        generateRandomNumber(N);
    }
    
    private void generateRandomNumber(int N) throws Exception{
        //create array of 0 to 100 in order
        int [] numberArray = new int[101];
        for(int i=0; i<numberArray.length; i++){
            numberArray[i]=i;
        }
        
        //suffle the numbers, thus we get the random arranged values
        
        //method 1 to suffle
        for(int i=0; i<numberArray.length;i++){ 
            int randomIndexToSwap = r.nextInt(numberArray.length);
            int temp = numberArray[randomIndexToSwap];
            numberArray[randomIndexToSwap] = numberArray[i];
            numberArray[i] = temp;      
        }
        
        //method 2 to suffle
        Collections.shuffle(Arrays.asList(numberArray));
        
        //get the first N elements
        if(obj instanceof int[]){
            obj = (T)Arrays.copyOfRange((int [])numberArray,  0, N);
            Arrays.sort((int [])obj);
        }
        else if(obj instanceof LinkedList){
            LinkedList link = (LinkedList) obj;
            for(int i=0;i<N;i++){
                link.add(numberArray[i]);
            }
            Collections.sort(link);
        }
        else throw new Exception ("Invalid type");
    }

    @Override
    public String toString() {
        if(obj instanceof int[]){
            return Arrays.toString((int [])obj);
        }
        else if(obj instanceof LinkedList){
            return obj.toString();
        }
        else
            return "Invalid Constructor";
    }

}




















































//public class Generator<E> {
//    private E[] array;
//    private LinkedList<E> linkedlist;
//    private int N;
//
//    public Generator(int N) {
//        array = (E[]) new Object[N];
//        linkedlist = new LinkedList<>();
//    }
//    
//    public int[] arrayGenerator(int [] a){
//        Random rand = new Random();
//        for(int i=0; i<a.length;i++){
//            a[i]=rand.nextInt(101);
//            for(int j=0;j<i;j++){
//                if(a[i]==a[j]){
//                    i--;
//                    break;
//                }
//            }
//        }
//        return a;
//    }
//    
//    public LinkedList<E> linkedListGenerator(LinkedList<E> L){
//        Random rand = new Random();
//        //Using shuffle method
//        int [] num = new int[101];
//        for(int i=0;i<101;i++){       
//            num[i]=i;
//        }
//        Collections.shuffle(Arrays.asList(num));
//        
//        
//        LinkedList link = (LinkedList) linkedlist;
//            for(int i=0;i<N;i++){
//                link.add(num[i]);
//            }
//        // Collections.sort(link);
//
//        return link;
//    } 
//    
//    public int[] arraySort(int [] a){
//        System.out.println("Array Implementation");
//        Arrays.sort(a);
//        return a;
//    }
//    
//    public LinkedList<E> linkedListSort(LinkedList<E> L){
//        Collections.sort((LinkedList)L);
//        return L;
//    }
//    
//    
//}
