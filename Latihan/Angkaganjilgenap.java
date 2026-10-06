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
public class Angkaganjilgenap {
    public static void main(String[] args) {
        Scanner dataAngka = new Scanner (System.in);
        int angka;

        System.out.println("Masukkan angkanya : ");
        angka = dataAngka.nextInt();
        
        if (angka %2 == 0){
            System.out.print("Bernilai  : Genap ");
        } else {
            System.out.print("Bernilai  : Ganjil ");
        }
    }
}
    
    

