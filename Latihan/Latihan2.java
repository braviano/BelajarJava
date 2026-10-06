/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;
import java.util.Scanner;

/**
 *
 * @author Braviano Reihan Ali 265314032
 */
public class Latihan2 {
    public static void main(String[] args) {
        Scanner datakec = new Scanner (System.in);
       int V0,a,t;
       double hitung;
        System.out.println("Masukkan kecepatan awal : ");
        System.out.println("Masukkan percepatan     : ");
        System.out.println("Masukkan waktu          : ");
        V0 = datakec.nextInt();
        a = datakec.nextInt();
        t = datakec.nextDouble();
        hitung = (V0*t)+(0.5*a*t*t);
                
        
    }
}
