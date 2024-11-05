/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan10;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
    //Mendeklarasikan Variabel
    private String NIM, Nama, Alamat, Matkul;
    private double nilaiAkhir;
    
    //Membuat Method Mahasiswa yang memiliki konstruktor
    public Mahasiswa(String NIM, String Nama, String Alamat, String Matkul, double nilaiAkhir) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Matkul = Matkul;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    //Method mengembalikan nilai Alamat
    public String getAlamat() {
        return Alamat;
    }
    
    //Method mengembalikan nilai NIM
    public String getNIM() {
        return NIM;
    }
    
    //Method mengembalikan nilai Nama
    public String getNama() {
        return Nama;
    }
    
    //Method mengembalikan nilai Matkul
    public String getMatkul(){
        return Matkul;
    }
    
    //Method mengembalikan nilai Nilai AKhir
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
}
