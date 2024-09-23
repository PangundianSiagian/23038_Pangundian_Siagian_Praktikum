/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author Asus
 */
public class DemoBangunRuangOverride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek balok dengan panjang 4, lebar 6, dan tinggi 2
        Balok balok = new Balok(4, 6, 2);
        System.out.println("===============BANGUN RUANG========================");
        System.out.println("Balok");
        //Memanggil Method volume balok
        balok.volume();
        //Memanggil Method Luas Permukaan Balok
        balok.luasPermukaan();

        // Membuat objek kubus dengan sisi 6
        kubus kubus = new kubus(6);
        System.out.println("\nKubus");
        //Memanggil Method volume kubus
        kubus.volume();
        //Memanggil Method Luas Permukaan kubus
        kubus.luasPermukaan();
        System.out.println("===================================================");
    }
}
