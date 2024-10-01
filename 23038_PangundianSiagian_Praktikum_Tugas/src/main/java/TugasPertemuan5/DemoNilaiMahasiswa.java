/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan5;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class DemoNilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek Scanner untuk membaca input dengan nama masukan
       Scanner masukan = new Scanner (System.in);
       
        System.out.println("===========SELAMAT DATANG DI PROGRAM PENGECEKAN NILAI========");
        
        //Meminta input dari pengguna, pengguna memasukan NPM
        System.out.print("NPM             : ");
        String NPM = masukan.nextLine();
        
        //Meminta input dari pengguna, pengguna memasukan Nama
        System.out.print("Nama Mahasiswa  : ");
        String Nama = masukan.nextLine();
        
        //Meminta input dari pengguna, pengguna memasukan Nilai kehadiran
        System.out.print("Nilai Kehadiran : ");
        double Nk = masukan.nextDouble();
        
        //Meminta input dari pengguna, pengguna memasukan Nilai tugas
        System.out.print("Nilai Tugas     : ");
        double Nt = masukan.nextDouble();
        
        //Meminta input dari pengguna, pengguna memasukan Nilai UTS
        System.out.print("Nilai UTS       : ");
        double Nuts = masukan.nextDouble();
        
        //Meminta input dari pengguna, pengguna memasukan Nilai UAS
        System.out.print("Nilai UAS       : ");
        double Nuas = masukan.nextDouble();
        
        //Melakukan perhitungan nilai kehadiran,tugas, UTS, dan UAS
        double nilaiAkhir = (0.1*Nk) + (0.2*Nt) + (0.3*Nuts) + (0.4*Nuas);
        
        //Mendeklarasikan Variabel
        String mutuNilai;
        String keterangan;
        
        //Melakukan Pengecekan
         if (nilaiAkhir >= 76) {
            //Jika Nilai Lebih dari = 76 maka mendapat A
            mutuNilai = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            //Jika Nilai Lebih dari = 66 maka mendapat B
            mutuNilai = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            //Jika Nilai Lebih dari = 56 maka mendapat C
            mutuNilai = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            //Jika Nilai Lebih dari = 46 maka mendapat D
            mutuNilai = "D";
            keterangan = "KURANG";
        } else {
            //Jika Nilai tidak ada memenuhi kriteria diatas maka mendapat E
            mutuNilai = "E";
            keterangan = "KURANG SEKALI";
        }
        
         System.out.println("\nHasil Cetak");
         System.out.println("NPM Mahasiswa   : "+NPM);
         System.out.println("Nama Mahasiswa  : "+Nama);
         System.out.println("Nilai Akhir     : "+nilaiAkhir);
         System.out.println("Grade           : "+mutuNilai);
         System.out.println("Keterangan      : "+keterangan);
         System.out.println("==============TERIMA KASIH TELAH BERKUNJUNG===================");
    }
}
