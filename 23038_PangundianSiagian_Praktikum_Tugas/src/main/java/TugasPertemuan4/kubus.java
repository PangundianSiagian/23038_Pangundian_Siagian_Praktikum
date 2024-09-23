/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author Asus
 */
//Kelas Balok adalah inheritance dari Kelas BangunRuangOverride
public class kubus extends BangunRuangOverride{
    // Mendeklarasi variabel
    private double sisi;
    //Membuat Method
    public kubus(double sisi){
        this.sisi = sisi;
    }
    // Mengoverride method volume dari kelas BangunRuangOverride
    @Override
    public void volume(){
        System.out.println("Volume Kubus: " + sisi*sisi*sisi);
    }
    // Mengoverride method Luas Permukaan dari kelas BangunRuangOverride
    @Override
    public void luasPermukaan(){
        System.out.println("Luas Permukaan Kubus: " + 6*sisi*sisi);
    }
}
