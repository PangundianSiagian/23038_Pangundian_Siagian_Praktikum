/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1.Pertemuan2;

/**
 *
 * @author Asus
 */
public class Matematika implements Penghitung{
    //Mendeklarasikan variabel
    int pertambahan = 0;
    int pengurangan = 0;
    int perkalian = 0;
    int pembagian = 0;
    
    //Method untuk melakukan pertambahan
    public void pertambahan(int a, int b){
        pertambahan = a + b;
            System.out.println("Pertambahan : "+ a + "+" + b + "= "+pertambahan );
    }
    //Method untuk melakukan pengurangan
    public void pengurangan(int a, int b){
        pengurangan = a - b;
            System.out.println("Pengurangan : "+ a + "-" + b + " = "+pengurangan );
    }
    //Method untuk melakukan perkalian
    public void perkalian(int a, int b){
        perkalian = a * b;
            System.out.println("Perkalian   : "+ a + "*" + b + " = "+perkalian );
    }
    //Method untuk Melakukan pembagian
    public void pembagian(int a, int b){
        pembagian = a / b;
            System.out.println("Pembagian   : "+ a + "/" + b + " = "+pembagian );
       
    }
    
}
