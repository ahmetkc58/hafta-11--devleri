/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev_hafta12;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class örnek_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String txt = "merhaba dünya";
        
        int min = 1;
        int max = txt.length();
        int hsayı = (int) (Math.random() * (max - min - 1) + min);//harf sayısını bulduk
        int[] a = new int[hsayı];
        for (int i = 1; i < hsayı; i++) {
            int min1 = 0;
            int max1 = txt.length();
            int h = (int) (Math.random() * (max - min - 1) + min);//hangi indisin büyük olacağını bulduk
           
            char c = Character.toUpperCase(txt.charAt(h));
            int t = 0;
            a[t] = h;
            t = t + 1;
        }
        for (int j = 0; j < txt.length(); j++) {
          int  t1=0;
                if (j == a[t1]) {
                    System.out.print(Character.toUpperCase(txt.charAt(j)));
                } else {
                    System.out.print(txt.charAt(j));
                }
                t1++;

            }

        }

    }

