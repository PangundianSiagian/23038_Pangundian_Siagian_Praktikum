/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan6;
//Mengimport Method isPrima dari class Prima
import static TugasPertemuan6.Prima.isPrima;
/**
 *
 * @author Asus
 */
public class bilanganPrimaDanNonPrima {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("======================Bilangan Prima dan Non Prima=====================");
        System.out.println("Bilangan Prima:");
        //Perulangan menampilkan bilangan dari 0 sampai 20 
        for (int i = 0; i <= 20; i++) {
            //Jika nilai i mengembalikan true maka, nilai i adalah prima
            if (isPrima(i)) {
                System.out.println("\n"+i+" Adalah Bilangan Prima ");
            } 
        }
        System.out.println("=======================================================================");
        System.out.println("");
        
        System.out.println("=======================================================================");
        System.out.println("\nBilangan Non-Prima:");
        //Perulangan menampilkan bilangan dari 0 sampai 20 
        for (int i = 0; i <= 20; i++) {
            //Jika nilai i mngembalikan false maka, nilai i adalah non prima
            if (!isPrima(i)) {
                System.out.println("\n"+i+" Adalah Bilangan Non Prima");     
            }
        }
        System.out.println("=======================================================================");
        System.out.println("");
    }
}