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
public class SwitchDemo {
    public static void main(String[] args) {
        int angka;
        Scanner bulan = new Scanner (System.in);
        System.out.print("Masukkan bulan ke- ");
        angka = bulan.nextInt();
        
        String monthString;
        switch (angka) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "Oktober";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid Month";
                break;
                
        }
        System.out.println(monthString);
    }
    
}
