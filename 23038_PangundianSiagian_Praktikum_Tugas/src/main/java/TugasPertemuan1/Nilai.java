/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan1;

/**
 *
 * @author pangundian siagian
 */
public class Nilai {//Membuat class
    String NIM, nama;//Tipe data untuk NIM dan Nama Menggunakan string
    double absen, tugas, UTS, UAS, akhir;//Tipe data untuk nilai menggunakan double
    
    //Membuat Method Nilai
    void Nilai(int inputAbsen, int inputTugas, int inputUTS, int inputUAS, int inputAkhir){
        this.absen = inputAbsen;
        this.tugas = inputTugas;
        this.UTS = inputUTS;
        this.UAS = inputUAS;
        
        //Menghitung Nilai akhir
        this.akhir = this.absen*(0.1) + this.tugas*(0.2) + this.UTS*(0.3) + this.UAS*(0.4);
    }
    
    //Membuat Method cetak nilai 
   void cetakNilai(){
        System.out.println("NIM              : " + this.NIM);
        System.out.println("Nama             : " + this.nama);
        System.out.println("Nilai Absen[10%] : "+ this.absen);
        System.out.println("Nilai Tugas[20%] : "+ this.tugas);
        System.out.println("Nilai UTS[30%]   : "+ this.UTS);
        System.out.println("Nilai UAS[40%]   : "+ this.UAS);
        System.out.println("Nilai Akhir      : "+ this.akhir);
    }
}
