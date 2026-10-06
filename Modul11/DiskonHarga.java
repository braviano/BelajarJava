/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner;//Memanggil kelas scanner
/**
 *
 * @author Braviano Reihan Ali 265314032
 */
public class DiskonHarga {//Awal kelas DiskonHarga
    public static void main(String[] args) {
        Scanner dataBelanja = new Scanner (System.in);//Menyiapkan input dataBelanja dari keyboard
        int belanja,harga;//Variabel belanja dan harga dengan tipe integer
        double totalharga,diskon,persen;//Variabel totalharga,diskon, dan persen bertipe double
        
        System.out.print("Masukkan jumlah barang yang dibeli : ");//Menanyakan input jumlah barang yang dibeli
        belanja = dataBelanja.nextInt();//Menyimpan input ke variabel belanja
        harga = 100000;//Variabel harga  bernilai 100000
        totalharga = belanja*harga;//Proses menghitung totalharga dengan belanja x harga
        persen = 0.1;//vaariabel persen dengan nilai 10% atau 0.1
        
        
        
        
        System.out.println("Jumlah Barang yang dibeli   : "+belanja);//Mencetak jumlah barang yang dibeli
        System.out.println("Total Harga sebelum Diskon  : "+totalharga);//Menceak total harga sebelum diskon
        if (totalharga>=1000000){//Jika total harga lebih besar sama dengan 1000000
            diskon = totalharga*persen;//maka hitung diskon yaitu total harga x persen
            System.out.println("Mendapat Diskon Sebesar     : 10%");//dan cetak mendapat diskon sebesar 10%
        } else {//Kalau tidak
            diskon = totalharga;//Diskon=total harga
            System.out.println("Mendapat Diskon Sebesar     : 0%");//mencetak mendapat diskon sebesar 0%
                    }
        System.out.println("============================================");//baris pembatas
        System.out.println("                     Total  : "+diskon);//mencetak hasil perhitungan dengan diskon
        }  
    }//Akhir dari kelas DiskonHarga
    

