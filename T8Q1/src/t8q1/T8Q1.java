package t8q1;


public class T8Q1 {

    public static void main(String[] args) {
        SortTest<Character> a = new SortTest<>(SortTest.DESCENDING,'A',10);
        System.out.print("The random characters are : ");
        a.showValue();
        System.out.println("Selection Sort - Descending Order");
        a.selectionSort();
        a.showValue();
        
        
        a = new SortTest<>(SortTest.DESCENDING,'A',10);
        System.out.print("The random characters are : ");
        a.showValue();
        System.out.println("Bubble Sort - Descending Order");
        a.bubbleSort();
        a.showValue();
        
        
        a = new SortTest<>(SortTest.DESCENDING,'A',10);
        System.out.print("The random characters are : ");
        a.showValue();
        System.out.println("Insertion Sort - Descending Order");
        a.insertionSort();
        a.showValue();
        
        
        a = new SortTest<>(SortTest.DESCENDING,'A',10);
        System.out.print("The random characters are : ");
        a.showValue();
        System.out.println("Merge Sort - Descending Order");
        a.mergeSort();
        a.showValue();
        
        
        a = new SortTest<>(SortTest.DESCENDING,'A',10);
        System.out.print("The random characters are : ");
        a.showValue();
        System.out.println("Quick - Descending Order");
        a.quickSort();
        a.showValue();
        
    }
    
}
