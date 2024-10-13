/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan6;
/**
 *
 * @author Asus
 */
public class Prima {
    //Membuat Method Pengecekan Bilangan Prima Atau Bukan
    public static boolean isPrima(int m) {
        //Pengecekan jika nilai m kurang dari 2, maka bukan bilangan prima 
        if (m < 2) {
            return false;
        }
        //Perulangan untuk memeriksa 
        for (int i = 2; i <= m / 2; i++) {
            //Jika m dibagi habis oleh nilai i, berarti m bukan bilangan prima
            if (m % i == 0) {
                return false;
            }
        }
        //Jika tidak ada pembagi selain 1 dan dirinya sendiri, m adalah bilangan prima
        return true;
    }
}
