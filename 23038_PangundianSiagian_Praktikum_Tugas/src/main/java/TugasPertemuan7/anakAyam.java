/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan6;
//Mengimport Scanner untuk dapat memasukan input kedalam program
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class anakAyam {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek Scanner
        Scanner masukan = new Scanner(System.in);
        System.out.println("==============Lagu Anak Ayam Turun======================");
        //Meminta user memasukan jumlah anak ayam
        System.out.print("Masukkan Jumlah Anak Ayam : ");
        int anakAyam = masukan.nextInt();
        
        //Menampilkan bait awal lagu
        System.out.println("Tek kotek, kotek kotek,\nAnak ayam turun berkotek");
        //Melakukan Perulangan hingga anak ayam tersisah satu
        while(anakAyam > 1){
            //Menampilkan jumlah anak ayam yang turun
            System.out.println("Anak ayam turunlah "+anakAyam);
            //Menampilkan anak ayam setelah satu anak ayam mati
            System.out.println("Mati satu tinggalah "+(anakAyam-1));
            //Mengurangi jumlah anak ayam 1 per 1
            anakAyam--;
        }
        //Menampilkan bait lagi ketika anak ayam tersisah 1
        System.out.println("Anak Ayam turunlah 1, mati satu tinggal induknya");
        //Menampilkan bait terakhir lagu
        System.out.println("Tek kotek, kotek kotek,Anak ayam turun berkotek");
        System.out.println("=======================================================");
    }
}
