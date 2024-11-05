/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan10;
//Berfungsi untuk mengimport array list
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class InputData {
        //Mendeklarasikan untuk menyimpan daftar mahasiswa dalam bentuk ArrayList
        ArrayList<Mahasiswa> listmahasiswa;
        
        //Method untuk Membuat ArrayList kosong untuk menyimpan data mahasiswa
        public InputData() { 
        listmahasiswa = new ArrayList (); 
        }
        
        //Method untuk menambahkan data baru kedalam array list
        public void insertData(String NIM, String Nama, String Alamat, String Matkul, double nilaiAkhir) { 
            Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, Matkul, nilaiAkhir); 
            listmahasiswa.add(mhs); 
        }
        
        //Method mengembalikan seluruh data mahasiswa dalam bentuk Array list
        public ArrayList<Mahasiswa> getALL() { 
            return listmahasiswa; 
        }
        
        //Method menghapus data berdasarkan index
        public void deleteData(int index) {
           //Mengecek apakah index valid?
           if (index >= 0 && index < listmahasiswa.size()) {
           //jika iya maka akan menghapus index pada data yang dipilih
           listmahasiswa.remove(index);
        }
    } 
}
