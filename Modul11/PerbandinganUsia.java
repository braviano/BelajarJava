/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner;//Memanggil scanner

/**
 *
 * @author Braviano Reihan Ali 265314032
 */
public class PerbandinganUsia {//awal kelas PerbandinganUsia
    public static void main(String[] args) {
        Scanner dataUsia = new Scanner (System.in);//menyiapkan input data usia dari keyboard
        Scanner dataNama = new Scanner (System.in);//menyiapkan input data nama dari keyboard
        int usia1, usia2;//variabel usia orang 1 dan orang 2 bertipe integer
        String nama1,nama2;//variabel nama untuk orang 1 dan orang 2 dengan tipe string
        
        System.out.print("Masukkan nama orang 1 : ");//mencetak perintah untuk input nama
        nama1 = dataNama.nextLine();//meyimpan hasil input keyboard ke variabel nama1
        System.out.print("Masukkan Usia orang 1 : ");//mencetak perintah untuk input usia orang 1
        usia1 = dataUsia.nextInt();//menyimpan hasil input keyboard ke variabel usia1
        
        System.out.print("Masukkan nama orang 2 : ");//mencetak perintah untuk input nama
        nama2 = dataNama.nextLine();//meyimpan hasil input keyboard ke variabel nama2
        System.out.print("Masukkan Usia orang 2 : ");//mencetak perintah untuk input usia orang2
        usia2 = dataUsia.nextInt();//menyimpan hasil input keyboard ke variabel usia2
        
        if (usia1 > usia2) {//memulai kondisi jika usia1 lebih besar dari usia2
            System.out.println(nama1 + " lebih tua dari " + nama2);//maka mencetak nama1 lebih tua dari nama2
        } else if (usia1 == usia2) {//jika usia1 dan usia2 sama
            System.out.println("Usia " + nama1 + " sama dengan usia " + nama2);//maka mencetak usia nama1 sama dengan usia nama2
        } else {//kalau tidak
            System.out.println(nama2 + " lebih tua dari " + nama1);//mencetak nama2 lebih tua dari nama1
                }
        }
    }//Akhir kelas PerbandinganUsia
    

