/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev_hafta12;

import java.util.Scanner ;

/**
 *
 * @author Lenovo
 */
public class örnek_43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner  (System.in);

        System.out.println("lütfen bir kelime giriniz:");
String txt =input.nextLine();
        
        for (int i = txt.length()/2-1; i >=0; i--) {
            System.out.print(txt.charAt(i));
        
        }
         
        for (int i = txt.length()-1; i>txt.length()/2-1; i--) {
            System.out.print(txt.charAt(i));
        }
        
    }
    
}
