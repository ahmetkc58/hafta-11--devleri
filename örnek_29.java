/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev_hafta12;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class örnek_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
String txt="MeRhAbA";
        for (int i = 0; i <txt.length(); i++) {
            int a =(int)txt.charAt(i);
            if (65<=a && a<=90) {
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
            else if (97<=a && a<=122) {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
        }

        
    }
    
}
