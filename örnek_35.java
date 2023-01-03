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
public class örnek_35 {

    /**
     * @param args the command line argumentsint 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
String txt="merhaba";


char [] k1 = new char [3];
char [] k2 = new char [4];
int sk1=0,sk2=0;
char [] sesli = { 'a','e','ı','o','u'};
        for (int i = 0; i < txt.length(); i++) {
            int s=0;
            for (int j = 0; j <sesli.length; j++) {
                if (txt.charAt(i)==sesli[j]) {
                    s=1;
                }
            }
            if (s==1) {
           k1[sk1]=txt.charAt(i);
           sk1++;
            }else if (s==0) {
           k2[sk2]=txt.charAt(i);
           sk2++;
            }
        }
        for (int i = 0; i < k1.length; i++) {
            System.out.print(k1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < k2.length; i++) {
            System.out.print(k2[i]);
        }
    }

}
