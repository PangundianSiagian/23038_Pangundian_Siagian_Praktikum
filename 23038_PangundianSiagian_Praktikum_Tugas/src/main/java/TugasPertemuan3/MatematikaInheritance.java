/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author Asus
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Membuat objek baru dari class Matematika2 dan disimpan 
         * dalam objek mtk
         */
        Matematika2 mtk = new Matematika2();
        //Memanggil method Pertambahan
        mtk.pertambahan(30, 50);
        //Memanggil method Perkurangan
        mtk.pengurangan(56, 15);
        //Memanggil method Perkalian
        mtk.perkalian(70, 2);
        //Memanggil Method Pembagian
        mtk.pembagian(76, 4);
        //Memanggil Method Modulus
        mtk.modulus(74, 4);
    }
}
