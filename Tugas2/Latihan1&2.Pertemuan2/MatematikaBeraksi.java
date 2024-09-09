/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan1.Pertemuan2;

/**
 *
 * @author Asus
 */
public class MatematikaBeraksi{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Membuat objek baru dari class matematika dan disimpan 
         * dalam objek AlatPenghitung
         */
        Matematika AlatPenghitung = new Matematika();
        //Memanggil Method pertambahan dengan nilai a=20 b=10
        AlatPenghitung.pertambahan(20, 10);
        //Memanggil Method pengurangan dengan nilai a=10 b=5
        AlatPenghitung.pengurangan(10, 5);
        //Memanggil Method perkalian dengan nilai a=10 b=13
        AlatPenghitung.perkalian(10, 3);
        //Memanggil Method pembagian dengan nilai a=21 b=2
        AlatPenghitung.pembagian(21, 2);
    }
}