/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author Asus
 */
public class KonversiSuhu {
    //Membuat Method mengubah celcius ke Farenheit
    public void celciusToFarenheit(double suhu){
        double celciusToFarenheit = (suhu*9/5)+32;
        System.out.println("Merubah Celcius To Farenheit : "+celciusToFarenheit);          
    }
    //Membuat Method mengubah celcius ke reamur
    public void celciusToReamur(double suhu){
        double celciusToReamur = suhu *4/5;
        System.out.println("Merubah Celcius To Reamur : "+celciusToReamur);          
    }
}
