
package l1q4;


public class A_G {

    public A_G() {
    }

    public String toString(String s) {
        switch(s){
            case "A": 
                System.out.println("    *    ");
                System.out.println("   * *   ");
                System.out.println("  *****  ");
                System.out.println(" *     * ");
                System.out.println("*       *");
                break;
            case "B":
                System.out.println(" *****   ");
                System.out.println(" *    *  ");
                System.out.println(" *****   ");
                System.out.println(" *    *  ");
                System.out.println(" *****   ");
                break;
            case "C":
                System.out.println(" ******* ");
                System.out.println(" *       ");
                System.out.println(" *       ");
                System.out.println(" *       ");
                System.out.println(" ******* ");
                break;
            case "D":
                System.out.println(" ******  ");
                System.out.println(" *     * ");
                System.out.println(" *     * ");
                System.out.println(" *     * ");
                System.out.println(" ******  ");
                break;
            case "E":
                System.out.println(" ******  ");
                System.out.println(" *       ");
                System.out.println(" ******  ");
                System.out.println(" *       ");
                System.out.println(" ******  ");
                break;
            case "F":
                System.out.println(" ******  ");
                System.out.println(" *       ");
                System.out.println(" ******  ");
                System.out.println(" *       ");
                System.out.println(" *       ");
                break;
            case "G":
                System.out.println(" ******  ");
                System.out.println(" *       ");
                System.out.println(" *  ***  ");
                System.out.println(" *    *  ");
                System.out.println(" ******  ");
                break;
        }
        return null;
    }
    
}
