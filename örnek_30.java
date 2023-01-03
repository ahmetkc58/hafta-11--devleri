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
public class örnek_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
String txt="ahmet";
int s=0;
        for (int i = 0; i <txt.length(); i++) {
            int r =s%4;
            if (r<2) {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }else {
                System.out.print(txt.charAt(i));
            }
            s++;
        }
        System.out.println();
        for (int i = 0; i < txt.length(); i++) {
            System.out.print(txt.charAt(i));
        }

    }
    
}
