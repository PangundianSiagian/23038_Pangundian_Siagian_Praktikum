/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author Asus
 */
//class ini merupakan pewarisan dari class Konversi suhu
public class KonversiSuhu2 extends KonversiSuhu {
    //Membuat Method mengubah farenheit ke reamur
    public void FarenheitToReamur(double suhu){
        double FarenheitToReamur = (suhu - 32)*4/9;
        System.out.println("Merubah Celcius To Reamur : "+FarenheitToReamur);          
    }
}
