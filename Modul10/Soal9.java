/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Braviano Reihan Ali 265314032
 */
public class Soal9 {//Awal dari kelas Soal9
    public static void main(String[] args) {
        int alas,tinggi;//Deklaraasi varaiabel alas,dan tinggi bertipe integer
        double miring;//Deklarasi variabel miring dengan tipe double
        
        alas=8;//Isi dari variabel alas
        tinggi=10;//Isi dari variabel tinggi
        miring=Math.sqrt(alas*alas+tinggi*tinggi);//Rumus menghitung sisi 
        
        System.out.println("sisi miring segitiga dengan alas "+alas+ " dan tinggi "+tinggi+ " adalah "+miring);
        //Mencetak hasil menghitung sisi miring segitiga
    }
}//Akhir dari kelas Soal9
