/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1q4;

/**
 *
 * @author User
 */
public class BannerO_T extends Banner{
    public void display1stLine(char c) {
        switch (c) {
            case 'O':
                System.out.print("   *** ");
                break;
            case 'P':
                System.out.print("  **** ");
                break;
            case 'Q':
                System.out.print("   *** ");
                break;
            case 'R':
                System.out.print("  **** ");
                break;
            case 'S':
                System.out.print("   ****");
                break;
            case 'T':
                System.out.print("  *****");
                break;
        }
    }

    public void display2ndLine(char c) {
        switch (c) {
            case 'O':
                System.out.print("  *   *");
                break;
            case 'P':
                System.out.print("  *   *");
                break;
            case 'Q':
                System.out.print("  *   *");
                break;
            case 'R':
                System.out.print("  *   *");
                break;
            case 'S':
                System.out.print("  *    ");
                break;
            case 'T':
                System.out.print("    *  ");
                break;
        }
    }

    public void display3rdLine(char c) {
        switch (c) {
            case 'O':
                System.out.print("  *   *");
                break;
            case 'P':
                System.out.print("  **** ");
                break;
            case 'Q':
                System.out.print("  *   *");
                break;
            case 'R':
                System.out.print("  **** ");
                break;
            case 'S':
                System.out.print("   *** ");
                break;
            case 'T':
                System.out.print("    *  ");
                break;
        }
    }

    public void display4thLine(char c) {
        switch (c) {
            case 'O':
                System.out.print("  *   *");
                break;
            case 'P':
                System.out.print("  *    ");
                break;
            case 'Q':
                System.out.print("  *  **");
                break;
            case 'R':
                System.out.print("  *  * ");
                break;
            case 'S':
                System.out.print("      *");
                break;
            case 'T':
                System.out.print("    *  ");
                break;
        }
    }

    public void display5thLine(char c) {
        switch (c) {
            case 'O':
                System.out.print("   *** ");
                break;
            case 'P':
                System.out.print("  *    ");
                break;
            case 'Q':
                System.out.print("   ** *");
                break;
            case 'R':
                System.out.print("  *   *");
                break;
            case 'S':
                System.out.print("  **** ");
                break;
            case 'T':
                System.out.print("    *  ");
                break;
        }
    }
}
