/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan37.rataratanilai;
import data.RataRata;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG RATA RATA
 */

public class PBOIF210119047Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int banyakMhs;
        RataRata nilai = new RataRata();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyaknya mahasiswa: ");
        banyakMhs = input.nextInt();
        nilai.rataRataNilai(banyakMhs);
        nilai.hasil(banyakMhs);
    }
    
}
