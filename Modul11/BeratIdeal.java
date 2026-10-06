/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner;//memanggil kelas scanner
/**
 *
 * @author Braviano Reihan Ali 265314032
 */
public class BeratIdeal {//Awal kelas BeratIdeal
    public static void main(String[] args) {
        Scanner dataBerat  = new Scanner (System.in);//Menyiapkan input dataBerat dari keyboard
        Scanner dataTinggi = new Scanner (System.in);//Menyiapkan input dataTinggi dari keyboard
        double tinggi,berat;//Variabel tinggi dan berat yang bertipe double
        double selisih;//variabel selisih tinggi badan dengan berat badan yang bertipe double
        
        System.out.print("Masukkan Tinggi Badan   : ");//Meminta input tinggi badan
        tinggi = dataTinggi.nextDouble();//Menyimpan hasil input tinggi badan ke variabel tinggi
        System.out.print("Masukkan Berat Badan    : ");//meminta input berat badan
        berat = dataBerat.nextDouble();//Menyimpan hasil input berat badan ke variabel berat
        
        selisih = tinggi-berat;//proses menghitung selisih tinggi dan berat
        if (selisih >= 90 && selisih <= 110) {
            //Memulai kondisi jika selisih lebih besar sama dengan 90 dan lebih kecil sama dengan 110
            System.out.println("Berat badan ideal");//maka mencetak berat badan ideal
            }else if (selisih>90){//Jika selisih lebih besar dari 90
                System.out.println("Terlalu Gemuk");//maka mencetak berat badan terlalu gemu
            }else {//Kalau tidak
                System.out.println("Terlalu Kurus");//Mencetak berat badan terlalu kurus
                    }         
    }
    
}//Akhir kelas BeratIdeal
