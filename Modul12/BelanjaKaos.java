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
public class BelanjaKaos {
    public static void main(String[] args) {
         Scanner dataBaju = new Scanner (System.in);
         String ukuran;
         int jumlah;
         double harga;
         
         System.out.print("Masukkan Ukuran Baju : ");
         ukuran = dataBaju.nextLine();
         System.out.print("Masukkan Jumlah Baju : ");
         jumlah = dataBaju.nextInt();
         
         switch (ukuran){
             case "s":
                 harga = jumlah*30000;
                 System.out.println("=================================");
                 System.out.println("Harga Totalnya Adalah : "+harga);
                 break;
            
             case "m":
                 harga = jumlah*38000;
                 System.out.println("=================================");
                 System.out.println("Harga Totalnya Adalah : "+harga);
                 break;
                 
             case "l":
                 harga = jumlah*45000;
                 System.out.println("=================================");
                 System.out.println("Harga Totalnya Adalah : "+harga);
                 break;
             
             case "xl":
                 harga = jumlah*50000;
                 System.out.println("=================================");
                 System.out.println("Harga Totalnya Adalah : "+harga);
                 break;
                 
             case "xxl":
                 harga = jumlah*60000;
                 System.out.println("=================================");
                 System.out.println("Harga Totalnya Adalah : "+harga);
                 break;
                 
             default: 
                 System.out.println("Input Tidak Valid");  
         }
            dataBaju.close();
    }
}
