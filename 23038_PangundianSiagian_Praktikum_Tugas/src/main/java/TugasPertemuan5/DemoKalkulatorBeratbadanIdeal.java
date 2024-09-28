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
public class DemoKalkulatorBeratbadanIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek Scanner untuk membaca input dengan nama masukan
        Scanner masukan = new Scanner (System.in);
        
        System.out.println("=============SELAMAT DATANG DI PROGRAM KALKULATOR BADAN IDEAL================");
        
        //Meminta input dari pengguna, pengguna memasukan Berat badan satuan KG
        System.out.print("Masukkan Berat Badan (Kg) : ");
        double bB = masukan.nextDouble();
        
        //Meminta input dari pengguna, pengguna memasukan Tinggi Badan Satuan M apabila ada koma ganti dengan (.)
        System.out.print("Masukan Tinggi Badan (M)  : ");
        double tB = masukan.nextDouble();
        
        //Mendeklarasikan Variabel
        double imt = bB /(tB*tB);
        String kriteria;
        
        //Melakukan Pengecekan
        if(imt <= 18.4){
             //Jika IMT kurang dari atau = 18.4, artinya berat badan kurang
            kriteria = "Berat Badan Kurang";
        }else if(imt >= 18.5&& imt <= 24.9){
            //Jika IMT antara 18.5 sampai 24.9, artinya berat badan dianggap ideal
            kriteria = "Berat Badan Ideal";
        }else if(imt >= 25 && imt <= 29.9){
            //Jika IMT antara 25 sampai 29.9, artinya berat badan dianggap berlebih
            kriteria = "Berat Badan Lebih";
        }else if(imt >= 30 && imt <= 39.9){
            //Jika IMT antara 30 sampai 39.9, artinya berat badan dianggap gemuk
            kriteria = "Berat Badan Gemuk";
        }else{
            //Jika diatas kriteria diatas, artinya berat badan dianggap sangat gemuk
            kriteria = "Sangat Gemuk";
        }
        
        System.out.println("\nHasil Perhitungan");
        System.out.println("IMT: " + imt);
        System.out.println("Kriteria: " + kriteria);
        System.out.println("======================TERIMA KASIH SAMPAI JUMPA KEMBALI======================");
    }
}
