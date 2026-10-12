/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author Braviano Reihan Ali 265314032
 */
public class PrintRelation {//Awal kelas PrintRelation
    public static void main(String[] args) {
    int a = 7 * 3 + 6 / 2 - 5;// Variabel a yg bertipe integer dengan nilai 7x3+6/2-5
    int b = 21 - 8 + a % 3 * 11;//Variabel b bertipe integer dengan nilai 21-8+a modulo 3x11
        if(a < b){//Jika A lebih kecildari B
        System.out.println("A is less than B");//Cetak A kurang dari B
            }
        if(a == b){//Jika A sama dengan B
        System.out.println("A is equal to B");//Cetak A sama dengan B
            }
        if(a > b){//Jika A lebih besar dari B
        System.out.println("A is greater than B");//Cetak A lebih besar dari B
            }
    }
}//Akhir kelas PrintRelation
