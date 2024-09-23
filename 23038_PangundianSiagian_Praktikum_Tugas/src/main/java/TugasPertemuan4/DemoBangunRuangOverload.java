/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author Asus
 */
public class DemoBangunRuangOverload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek balok dengan panjang 5, lebar 3, dan tinggi 4
        Balok balok = new Balok(5, 3, 4);
        System.out.println("===============BANGUN RUANG========================");
        System.out.println("Balok");
        //Memanggil Method volume balok
        balok.volume();
        //Memanggil Method Luas Permukaan Balok
        balok.luasPermukaan();

        // Membuat objek kubus dengan sisi 4
        kubus kubus = new kubus(4);
        System.out.println("\nKubus");
        //Memanggil Method volume kubus
        kubus.volume();
        //Memanggil Method Luas Permukaan kubus
        kubus.luasPermukaan();
        System.out.println("===================================================");
    }
}
