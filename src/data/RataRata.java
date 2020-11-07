/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG RATA RATA
 */

public class RataRata {
    
    public float nilai;
    public float jumlah = 0;
    public float rataRata;
    
    public float  rataRataNilai(int parBanyakMhs){
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= parBanyakMhs; i++){
            System.out.printf("nilai mahasiswa ke-" + i +": ");
            nilai = input.nextFloat();
            jumlah += nilai;
        }
        return(jumlah);
    }
    
    public float hasil(int parBanyakMhs){
        rataRata = jumlah / parBanyakMhs;
        System.out.println();
        System.out.println("Maka, Rata-Rata Nilainya adalah " + rataRata);
        return (rataRata);
    }
}
