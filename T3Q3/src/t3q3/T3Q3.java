
package t3q3;


public class T3Q3 {

    
    public static void main(String[] args) {
        writeLine('$', 3);
        writeBlock('$', 3, 2);
    }
    
    public static void writeLine(char c, int n){
        if(n != 0){
            System.out.print(c);
            writeLine(c, n-1);
        }
        else{
            System.out.println("");
        }
    }
    
    public static void writeBlock(char c, int n, int row){
        if(row != 0){
            writeLine(c, n);
            writeBlock(c, n, row-1);
        }
    }
    
}
