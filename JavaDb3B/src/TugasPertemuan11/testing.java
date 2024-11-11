/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan11;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.sql.PreparedStatement;
/**
 *
 * @author Asus
 */
public class testing {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mengubah objek scanner menjadi masukan
        Scanner masukan = new Scanner(System.in);
        
        //Meminta pengguna memasukkan ID
        System.out.print("Masukkan ID : ");
        String Id = masukan.nextLine();
        //Meminta pengguna memasukkan Password
        System.out.print("Masukkan Password : ");
        String Password = masukan.next();
        try {
            //Membuka koneksi ke database menggunakan konfigurasi yang ada di Config.configDB()
            Connection connection = Config.configDB();
            System.out.println("Koneksi berhasil!");
            
            //Pengamanan sistem database menggunakan PreparedStatment
            //statement SQL untuk mengecek data login
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM akun WHERE Id = ? AND Password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            //Mengatur parameter pada query dengan input yang dimasukkan oleh pengguna
            preparedStatement.setString(1, Id);
            preparedStatement.setString(2, Password);
            
            //Menjalankan query dan mengambil hasilnya
            ResultSet resultSet = preparedStatement.executeQuery();
            
            //Memeriksa apakah ID dan password yang dimasukkan ada pada database
            //Jika ada maka akan tampil login berhasil
            if(resultSet.next()){
                System.out.println("Login berhasil");
            //Jika tidak ada makan akan tampil ID atau password salah
            }else{
                System.out.println("ID atau password salah");
            }
            //Menutup ResultSet, PreparedStatement, dan Connection setelah selesai login
            resultSet.close();
            statement.close();
            connection.close();
            
        }catch (SQLException ex){
            //Jika terjadi kesalahan saat berkomunikasi dengan database maka akan keluar perintah eror berikut
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
