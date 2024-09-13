/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author Asus
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Membuat objek baru dari class KonversiSuhu2 dan disimpan 
         * dalam objek khs
         */
        KonversiSuhu2 khs = new KonversiSuhu2();
        //Memanggil Method celciusToFarenheit
        khs.celciusToFarenheit(12);
        //Memanggil Method celciusToReamur
        khs.celciusToReamur(70);
        //Memanggil Method FarenheitToReamur
        khs.FarenheitToReamur(50);
    }
    
}
