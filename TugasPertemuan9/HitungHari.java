/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan9;
/**
 *
 * @author Asus
 */
public class HitungHari {
   //Method Untuk Menghitung Jumlah Hari
   public int hitungHari(int tahun, String bulan) {
        int jumlahHari = 0;
        // Menentukan jumlah hari berdasarkan nama bulan
        switch (bulan) {
            case "Januari":
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case "Februari":
                if ((tahun % 400 == 0) || ((tahun % 4 == 0) && (tahun % 100 != 0))) {
                    jumlahHari = 29; // Februari pada tahun kabisat
                } else {
                    jumlahHari = 28; // Februari pada tahun non-kabisat
                }
                break;
            case "Maret":
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case "April":
                jumlahHari = 30; // Bulan dengan 30 hari
                break;
            case "Mei":
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case "Juni":
                jumlahHari = 30; // Bulan dengan 30 hari
                break;
            case "Juli":
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case "Agustus":
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case "September":
                jumlahHari = 30; // Bulan dengan 30 hari
                break;
            case "Oktober":
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case "November":
                jumlahHari = 30; // Bulan dengan 30 hari
                break;
            case "Desember":
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            default:
                System.out.println("Bulan tidak valid.");
                break;
        }
        return jumlahHari;
    }
}  
