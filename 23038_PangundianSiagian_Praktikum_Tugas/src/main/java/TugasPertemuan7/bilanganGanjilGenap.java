/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan6;
/**
 *
 * @author Asus
 */
public class bilanganGanjilGenap {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=============BILANGAN GENAP=================");
        //Perulangan dari 0 sampai dengan 20 mencari bilangan genap
        for (int i = 0; i <=20; i++){
            //Jika nilai i habis dibagi 2, maka bilangan tersebut genap
            if(i % 2 == 0){
                System.out.println("\n"+i+" Adalah Bilangan Genap ");
            }
        }
        System.out.println("============================================");
        
        System.out.println("");
        
        System.out.println("============BILANGAN GANJIL=================");
        //Perulangan dari 0 sampai dengan 20 mencari bilangan ganjil
        for (int j = 0; j<=20; j++){
            //Jika nilai i tidak habis dibagi 2, maka bilangan tersebut ganjil
            if(j % 2 !=0){
                System.out.println("\n"+j+ " Adalah Bilangan Ganjil ");
            }
        }
       System.out.println("=============================================");
    }
}
