
package l2q2;


public class L2Q2 {

 
    public static void main(String[] args) {
        String name = "Siti";
        int max = 5;
        TextFileLog<String> a = new TextFileLog<>(max);
        System.out.println("Create a text file log with maximum record equal to "+ max);
        System.out.println("Text File Log Size "+max);
        a.insert("James");
        a.insert("Ahmad");
        a.insert("Siti");
        a.insert("Ramesh");
        a.insert("John");
        a.insert("MesutOzil");
        //searching
        a.search(name);
        
        //clear file log
        a.clear();
    }
    
}
