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
public class Balok extends BangunRuangOverride{
    // Mendeklarasi variabel
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    // Mengoverride method volume dari kelas BangunRuangOverride
    @Override
    public void volume(){
        System.out.println("Volume Balok: " + panjang*lebar*tinggi);
    }
    // Mengoverride method Luas Permukaan dari kelas BangunRuangOverride
    @Override
    public void luasPermukaan(){
        System.out.println("Luas Permukaan Balok: " + (2 * (panjang * lebar + panjang * tinggi + lebar * tinggi)));
    }
}

