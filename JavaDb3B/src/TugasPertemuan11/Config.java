/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Asus
 */
public class Config {
    /**
     * @param args the command line arguments
     */
    //Mendeklarasikan variabel untuk menyimpan objek Connection
    private static Connection mysqlconfig;
    
    public static Connection configDB() throws SQLException {
        try {
             //URL koneksi ke database dengan nama databasenya login
            String url = "jdbc:mysql://localhost:3306/login";
            //untuk usernya root
            String user = "root";
            //untuk passwordnya tidak ada
            String pass = "";
            
            //Mendaftarkan driver MySQL yang digunakan untuk koneksi
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            
            //Mendapatkan koneksi ke database menggunakan DriverManager
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            
        //Jika terjadi kesalahan saat koneksi maka akan tampil perintah eror berikut
        } catch (SQLException e) {
            System.err.println("Error: Koneksi tidak berhasil! " + e.getMessage());
        }
        return mysqlconfig;
    }
}
