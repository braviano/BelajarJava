/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan;
/**
 *
 * @author Braviano Reihan Ali 265314032
 */
import java.util.Scanner;

public class Rentalmobil {
    public static void main(String[] args) {
       Scanner dataSewa = new Scanner (System.in);
       int jam,tarif,hasil;
        System.out.println("Masukkan jam sewa : ");
        jam = dataSewa.nextInt();
        tarif=125000;
        hasil = jam*tarif;
        
        System.out.println();
        System.out.println("Jumlah jam sewa     : "+jam);
        System.out.println("Tarif  per jam      : "+tarif);
        System.out.println("===============================");
        System.out.println("Total biaya sewa    : "+hasil);
    }
    
}
