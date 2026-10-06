/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner;//AMemanggil kelas scanner
/**
 *
 * @author Braviano Reihan Ali 265314032
 */
public class NilaiUTS {//Awal kelas NilaiUTS
    public static void main(String[] args) {
        Scanner dataNilai = new Scanner (System.in);//Menyiapkan input dataNilai
        double nilaiuts1,nilaiuts2,nilaiuas,total;//Variabel nilaiuts1,nilaiuts2,nilaiuas,dan total bertipe double
        char nilaifinal;//Variabel nilaifinal bertipe char
        System.out.print("Masukkan Nilai UTS 1    : ");//Meminta input nilai uts1
        nilaiuts1 = dataNilai.nextDouble();//Menyimpan hasil input ke variabel nilaiuts1
        System.out.print("Masukkan Nilai UTS 2    : ");//Meminta input nilai uts2
        nilaiuts2 = dataNilai.nextDouble();//Menyimpan hasil input ke variabel nilaiuts2
        System.out.print("Masukkan Nilai UAS      : ");//Meminta input nilai uas
        nilaiuas = dataNilai.nextDouble();//Menyimpan hasil input nilai uas ke variabel nilaiuas
        
        total = (0.30*nilaiuts1)+(0.30*nilaiuts2)+(0.40*nilaiuas);
        //proses menghitung total nilai
        
        if (total>80){//Jika nilai total lebih besar dari 80
            nilaifinal='A';//maka mencetak nilai A
        }else if (total>=65){//Jika lebih besar sama dengan 65
            nilaifinal='B';//Maka mencetak nilai B
        }else if (total>=55){//Jika lebih besar sama dengan 55
            nilaifinal='C';//Mencetak nilai C
        }else if (total>=50){//Jika lebih besar sama dengan 50
            nilaifinal='D';//Maka mencetak nilai D
        }else{//Klaaau tidak
            nilaifinal='E';//Mencetak nilai E
        }
        System.out.println();//Spasi
        System.out.println("======================================");//Garis batas
        System.out.println("Jumlah Nilaimu Adalah   : "+total);//Mencetak total nilai
        System.out.println("Nilaimu Akhirmu Adalah  : "+nilaifinal);//Mencetak nilai huruf
    }
    
}//Akhir kelas NilaiUTS
