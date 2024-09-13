/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan1;

/**
 *
 * @author Asus
 */
public class DemoNilai {//Membuat class Demo Nilai

    /**
     * Main class untuk menjalankan program
     */
    public static void main(String[] args) {
        //Membuat objek nMahasiswa sebagai objeknya
        Nilai nMahasiswa = new Nilai();
        
        //Memasukan value NIM dan Nama
        nMahasiswa.NIM = "xxxxxxx";
        nMahasiswa.nama = "xxxxxxx";
        
        //Memanggil Method menggunakan objek nMahasiswa
        nMahasiswa.Nilai(0, 0, 0, 0, 0);
        nMahasiswa.cetakNilai();
    }
    
}
