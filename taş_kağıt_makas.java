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
public class taş_kağıt_makas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k1 = 0, k2 = 0;
        System.out.println("1.oyuncunun ismini giriniz:");
        String i1 = input.nextLine();

        String[] a = {"1_taş", "2_kağıt", "3_makas"};

        while (k1 != 3 && k2 != 3) {
            System.err.println("SKOR");
            System.err.println(k1 + "," + k2);
            for (String a1 : a) {
                System.out.println(a1);
            }
            System.out.println("lütfen birini seçin:");
            int n = input.nextInt();
            int min = 1;
            int max = 5;
            int r = (int) (Math.random() * (max - min - 1) + min);

            if (n == r) {
                System.out.println("berabere");
            }
            if ((n == 1 && r == 3) || (n == 2 && r == 1) || n == 3 && r == 2 || n == 1 && r == 2) {//düzenle 
                System.out.println("1.oyuncu kazandı");
                k1++;
            } else if (n == 2 && r == 3 || n == 3 && r == 1) {

            }

        }
        if (k1 == 3) {
            System.out.println(i1 + "oyuncu kazandı");
        } else {
            System.out.println("bilgisayar oyuncusu kazandı");
        }

    }

}
