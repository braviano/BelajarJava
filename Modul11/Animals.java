/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author Braviano Reihan Ali 265314032
 */
public class Animals {//Awal kelas Animals
 public static void main(String [] args){
    boolean rabbit = true;//Variabel rabbit bertipe boolean dengan nilai true
    boolean donkey = false;//Variabel donkey bertipe boolean dengan nilai false
    boolean leporidae = true;//Variabel leporidae bertipe boolean dengan nilai true
    if (rabbit & donkey | donkey & leporidae | donkey)
    //Jika rabbit dan donkey benar, atau donkey dan leporidae benar, atau donkey benar.
        System.out.print("DOG ");//Cetak DOG
    if (rabbit & donkey | donkey & leporidae | donkey | rabbit)
    //Jika rabbit dan donkey benar, atau donkey dan leporidae benar, atau donkey benar, atau rabbit benar
        System.out.println("CAT ");//Cetak CAT
    }
}//Akhir Kelas Animals
