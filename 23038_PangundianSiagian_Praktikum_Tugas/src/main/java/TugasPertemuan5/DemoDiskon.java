/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan5;

/**
 *
 * @author Asus
 */
//
import java.util.Scanner;
public class DemoDiskon {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek Scanner untuk membaca input dengan nama masukan
        Scanner masukan = new Scanner (System.in);
        
        System.out.println("=============SELAMAT DATANG DI MINIMARKET================");
        
        //Meminta input dari pengguna, pengguna memasukan total pembelian
        System.out.print("Total Pembelian = Rp. ");
        int tP = masukan.nextInt();
        
        //Mendeklarasikan Variabel
        int potongan;
        int totalBayar;
        
        //Melakukan pengecekan apakah total pembelian kurang dar1 Rp.50.000
        if(tP < 50000 ){
            //jika kurang dar1 Rp.50.000 maka mendapatkan potongan 5%
            potongan = tP *5/100;
        }else{
            //jika total pembelian Rp.50.000 atau lebih maka mendapatkan potongan 20%
            potongan = tP *20/100;
        }
        //Melakukan perhitungan setelah total pembelian dipotong potongan harga
        totalBayar = tP - potongan;
        
        System.out.println("Besarnya potongan = Rp. "+potongan);
        System.out.println("Jumlah Yang Harus Dibayarkan = Rp. "+totalBayar);
        System.out.println("===========TERIMA KASIH SAMPAI JUMPA LAGI===============");
    }   
}
