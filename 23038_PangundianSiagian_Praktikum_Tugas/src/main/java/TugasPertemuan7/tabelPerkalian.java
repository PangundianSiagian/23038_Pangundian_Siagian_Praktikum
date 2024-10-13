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
public class tabelPerkalian {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("==================TABEL PERKALIAN===================");
        //Meminta User memasukan berapa besar tabel yang akan dibuat max 10
        System.out.print("Masukan Berapa Besar tabelnya(Maksimal0) : ");
        int i = masukan.nextInt();
        
        //Melakukan Pengecekan 
        if(i > 10){
            //Jika input lebih dari 10 akan menampilkan output ini
            System.out.println("Besarnya tidak boleh lebih dari 10.");
        }else{
            //Jika input <=10 maka akan menampilkan program
            System.out.println("Tabel Perkalian "+ i + " x "+ i + " : ");
            //Perulangan untuk baris
            for(int j = 1; j <= i; j++){
                //Perulangan untuk kolom
                for(int k = 1; k <=i; k++){
                    System.out.print(j*k+"\t");
                }
                System.out.println();
            }
        }
    }
}
