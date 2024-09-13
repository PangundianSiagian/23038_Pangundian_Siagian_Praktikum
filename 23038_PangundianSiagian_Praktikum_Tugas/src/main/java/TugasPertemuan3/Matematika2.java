/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3;
//Mengimpor dari package Latihan1.Pertemuan2
import Latihan1.Pertemuan2.*;

/**
 *
 * @author Asus
 */
/*class ini merupakan pewarisan dari class Matematika yang ada pada
* package Latihan1.Pertemuan2
*/
public class Matematika2 extends Matematika {
    //Method untuk menghitung modulus
    public void modulus (int a, int b){
    //Mendeklarasikan Variabel
    int modulus = a%b;
        System.out.println("Modulus     : "+ a + "%" + b + "  = "+ modulus );
    }
}