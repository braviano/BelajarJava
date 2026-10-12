/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul12;
import java.util.Scanner;
/**
 * @author Braviano Reihan Ali 265314032
 */
public class BonusGaji {
    public static void main(String[] args) {
        Scanner dataGaji = new Scanner (System.in);
        int masakerja;
        double bonus,gaji,total;
        String golongan;
        
        System.out.print("Masukkan Golongan     : ");
        golongan = dataGaji.nextLine();
        System.out.print("Masukkan Gaji Pokok   : ");
        gaji = dataGaji.nextDouble();
        System.out.print("Masukkan Masa kerja   : ");
        masakerja = dataGaji.nextInt();

        switch (golongan){
            case "1":
                if (masakerja > 0 && masakerja <=10){
                    bonus = gaji*0.50;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);
                }else if (masakerja >= 11 && masakerja <=20){
                    bonus = gaji*0.60;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);
                }else if (masakerja >= 21 && masakerja <=30){
                    bonus = gaji*0.70;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);
                }
                break;
            case "2":
                if (masakerja > 0 && masakerja <=10){
                    bonus = gaji*0.60;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);
                }else if (masakerja >= 11 && masakerja <=20){
                    bonus = gaji*0.70;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);
                }else if (masakerja >= 21 && masakerja <=30){
                    bonus = gaji*0.80;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);  
                }
                break;
            case "3":
                if (masakerja > 0 && masakerja <=10){
                    bonus = gaji*0.70;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);
                }else if (masakerja >= 11 && masakerja <=20){
                    bonus = gaji*0.80;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);
                }else if (masakerja >= 21 && masakerja <=30){
                    bonus = gaji*0.90;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);  
                }
                break;
            case "4":
                if (masakerja > 0 && masakerja <=10){
                    bonus = gaji*0.80;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);
                }else if (masakerja >= 11 && masakerja <=20){
                    bonus = gaji*0.90;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);
                }else if (masakerja >= 21 && masakerja <=30){
                    bonus = gaji*1.00;
                    total = gaji+bonus;
                    System.out.println("==================================");
                    System.out.println("Bonus Gaji : " +bonus);
                    System.out.println("Total Gaji : " +total);  
                }
                break;       
        }
        dataGaji.close();
    }   
}
