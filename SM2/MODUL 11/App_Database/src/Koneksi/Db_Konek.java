package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Db_Konek {

  private static Connection conn;
public static Connection getKonek(){
    String host = "jdbc:mysql://localhost/pendaftaran",
            user = "root",
            pass = "";
try{
conn = (Connection) DriverManager.getConnection(host, user, pass);
}catch(SQLException err){
JOptionPane.showMessageDialog(null, err.getMessage());
}
return conn;
    
    }
    
}

