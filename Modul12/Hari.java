/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul12;
import java.util.Scanner;

/**
 *
 * @author Braviano Reihan Ali 265314032
 */
public class Hari {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int bulan;
        int jumlahhari;
        
        System.out.print("Masukkan nomor bulan : ");
        bulan = input.nextInt();
        
        switch (bulan){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahhari = 31;
                System.out.println("Jumlah Hari : "+jumlahhari);
                break;
            
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahhari = 30;
                System.out.println("Jumlah Hari : "+jumlahhari);
                break;
            
            case 2:
                jumlahhari = 28;
                System.out.println("Jumlah Hari : "+jumlahhari);
                break;
                
            default:
                System.out.println("Bulan Tidak Valid");
        }
        input.close();
    }
    
}
