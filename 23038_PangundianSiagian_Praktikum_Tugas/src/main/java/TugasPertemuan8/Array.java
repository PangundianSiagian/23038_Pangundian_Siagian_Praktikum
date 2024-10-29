/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan8;
//Mengimport Scanner Agar dapat Memasukan Input
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Array {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat Objek Baru untuk dapat menginput data
        Scanner masukan = new Scanner(System.in);

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("=======================");
        
        //Meminta agar user memasukan Jumlah Item barang 
        System.out.print("Masukkan Item Barang  : ");
        int jumlahItem = masukan.nextInt();
        
        //Deklarasi Array untuk menyimpan kode barang, nama barang,
        // harga, jumlah beli, dan total bayar
        String[] kodeBarang = new String[jumlahItem];
        String[] namaBarang = new String[jumlahItem];
        int[] hargaBarang = new int[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] totalBayar = new int[jumlahItem];
        
        //Perulangan Untuk memasukan data setiap barang perulangan ini sesuai
        //Dengan input yang dimasukan di awal jumlah item barang
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            
            //Meminta agar user memasukan kode barang 
            System.out.print("Masukkan Kode         : ");
            kodeBarang[i] = masukan.next();
            
            //Deklarasi Array untuk Daftar kode, nama, dan harga barang
            String[] daftarKode = {"a001", "a002", "a003"};
            String[] daftarNama = {"Buku", "Pensil", "Pulpen"};
            int[] daftarHarga = {3000, 4000, 5000};
            
            //Melakukan apakah barang ada dalam array?
            boolean barangDitemukan = false;
            //Perulangan untuk mengecek kode barang yang ada dalam array
            for (int j = 0; j < daftarKode.length; j++) {
                // Jika kode cocok, mengisi nama dan harga barang dari daftar
                if (kodeBarang[i].equalsIgnoreCase(daftarKode[j])) {
                    namaBarang[i] = daftarNama[j];
                    hargaBarang[i] = daftarHarga[j];
                    //Jika barang ditemukan maka kondisi akan true
                    barangDitemukan = true;
                    //Keluar dari perulangan jika barang sudah ditemukan
                    break;
                }
            }
            // Jika kode barang tidak ditemukan, meminta ulang input kode barang
            if (!barangDitemukan) {
                System.out.println("Kode barang tidak ditemukan!");
                i--;
                continue;
            }
            
            //Meminta user untuk memasukan jumlah barang yang dibeli berapa buah
            System.out.print("Masukkan Jumlah Beli  : ");
            jumlahBeli[i] = masukan.nextInt();
            
            //Menghitung Total Bayar belanja barang
            totalBayar[i] = hargaBarang[i] * jumlahBeli[i];
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("======================");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("=================================================================");

        int totalHarga = 0;
        //Perulangan untuk menampilkan data barang yang dibeli
        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%-3d  %-11s  %-11s %-7d   %-11d  %-12d \n",
                    (i + 1), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], totalBayar[i]);
            totalHarga += totalBayar[i];
        }
        //Menampilkan Total Harga barang yang dibeli
        System.out.println("=================================================================");
        System.out.println("Total Bayar                                          " +  totalHarga);
        System.out.println("=================================================================");
    }
}
