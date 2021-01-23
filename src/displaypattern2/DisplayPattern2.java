/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displaypattern2;

import java.util.Scanner;

/**
 *
 * @author sa
 */
public class DisplayPattern2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter the number of rows");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        displayPattern(a);
    }
    public static void displayPattern(int n){
        
        System.out.println("This is your pattern");
        
         for (int i = 0; i < n; i++) {
            for (int k = n-i; k >= 1; k--) {
                System.out.print("*");
            }
            for (int j =i+1; j>=1; j--) {
                System.out.print(j + "");

            }
            System.out.println("");
        }
    }
}
