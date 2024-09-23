/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author Asus
 */
public class BangunRuangOverload {
    //Membuat Method Menghitung Volume Kubus
    public void volume(double sisi){
        System.out.println("Volume Kubus : "+sisi*sisi*sisi);
    }
    //Membuat Method Menghitung volume balok
    public void volume(double panjang, double lebar, double tinggi){
        System.out.println("Volume Balok : "+panjang*lebar*tinggi);
    }
    //Membuat Method Menghitung Luas Permukaan kubus
    public void luasPermukaan(double sisi){
        System.out.println("Luas Permukaan Kubus : "+6*sisi*sisi);
    }
    //Membuat Method Menghitung Luas Permukaan Balok
    public void luasPermukaan(double panjang, double lebar, double tinggi){
        System.out.println("Luas Permukaan Balok : "+(2*(panjang * lebar + panjang * tinggi + lebar * tinggi)));
    }
}
