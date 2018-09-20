/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian;

import java.util.*;

/**
 *
 * @author 680183
 */
public class perkalian_input {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = 0;
        float b = 0;
        System.out.println("==========PERKALIAN========= ");
        System.out.print("Masukkan bilangan 1= ");
        a = in.nextFloat();
        System.out.print("Masukkan bilangan 2= ");
        b = in.nextFloat();
        System.out.println("============================ ");
        System.out.println("Hasil perkalian biasa = " + kali(a, b));
        //kali(a,b);
        //kaliLoop(a,b);
        cbkaliLoop(a, b);
        int i;
    }

    public static float kali(float a, float b) {//fungsi
        float hasil;
        hasil = a * b;
        return hasil;
        //System.out.println("Hasil perkalian biasa = "+hasil);
    }

    public static void kaliLoop(float a, float b) {//void=prosedur
        float hasilLoop = 0;
        for (int i = 0; i < a; i++) {
            hasilLoop = hasilLoop + b;
        }
        if (a < 0) {
            hasilLoop = hasilLoop + b;
        }
        System.out.println("Hasil perkalian dengan loop = " + (-hasilLoop));
    }
/**
 * Fungsi= Perkalian antara a dan b
 * @param a menampung bilangan 1
 * @param b menampung bilangan 2
 */
    public static void cbkaliLoop(float a, float b) {
        float hasil = 0;
        if (a < 0) {
            for (int i = 0; i < Math.abs(a); i++) {
                hasil = hasil + b;
            }
            hasil = hasil * -1;
            System.out.println("Hasil perkalian dengan loop = " + (hasil));
        } else {
            for (int i = 0; i < a; i++) {
                hasil = hasil + b;
            }
            System.out.println("Hasil perkalian dengan loop = " + (hasil));
        }
    }
}
