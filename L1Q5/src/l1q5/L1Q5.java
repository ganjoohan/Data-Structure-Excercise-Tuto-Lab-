
package l1q5;


public class L1Q5 {

    public static void main(String[] args) {
        String str = "Welcome to FSKTM!\nPlease register your matric number.\nPlease register your UMMail account.";
        TextFile t1 = new TextFile("Register.txt");
        System.out.println("Write to text file");
        t1.writeToFile(str);
        System.out.println(str);
        System.out.println("Read from text file");
        System.out.println(t1.readFromFile());
        
        BinaryFile b1 = new BinaryFile("Register.dat");
        System.out.println("Write to binary file");
        b1.writeToFile(str);
        System.out.println(str);
        System.out.println("Read from binary file");
        System.out.println(b1.readFromFile());
    }
    
}
