/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register_design;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author urbennoroac
 */

public class My_CNX {
    
    public static String passwordbd = "0";
    private static String servername = "192.168.64.2";
    private static String username = "rubs";
    private static String dbname = "prueba";
    private static Integer portnumber = 3306;
    private static String password = "1234567";
    
    
   /* public static void crearTabla() throws Exception{
        String newtable = "Tarea" + MenuTareas.val;
        try{
           Connection con = getConnection();
         

           PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS `" + newtable + "` (id int NOT NULL AUTO_INCREMENT, Nombre varchar(100), Estado varchar(40) DEFAULT 'Sin Subir' , Calificacion int(20) DEFAULT '0', NombreTarea varchar(45), Tarea longblob, PRIMARY KEY(id))");
           create.executeUpdate();
            PreparedStatement s = con.prepareStatement("INSERT INTO `" + newtable + "` (`id`, `Nombre`) SELECT `id`, `Nombre` FROM `users`");
            s.executeUpdate();
        }catch(SQLException e){System.out.println(e);}
    }*/
    
    public static boolean DataCheck(String Id){
        InputStream input = null;
        String query = "SELECT * FROM TabladeEstados WHERE id = " + Id;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.2/prueba" , "rubs" , "1234567");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
            input = rs.getBinaryStream("Tarea");	
            }
        } catch (SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return input != null;
    }
    
    public static int getNoRevision(String Id){
        String No;
        ResultSet rs;
        String query = "SELECT * FROM TabladeEstados WHERE id = " + Id;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.2/prueba" , "rubs" , "1234567");
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
            No = rs.getString("NoRevision");
            int val = Integer.parseInt(No);	
            return val;
            }
        } catch (SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }
    
    
    public static String getemail(String user) throws SQLException{
        String email;
        ResultSet rs;
        String query = "SELECT * FROM users WHERE id = " + user;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.2/prueba" , "rubs" , "1234567");
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
            email = rs.getString("email");	
            return email;
            }
        } catch (SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "0";
        }
    
    public static void password(String user) throws SQLException{
        ResultSet rs;
        String query = "SELECT * FROM users WHERE id = " + user;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.2/prueba" , "rubs" , "1234567");
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
            passwordbd = rs.getString("password");	
            }
        } catch (SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    public static void password2(String user) throws SQLException{
        ResultSet rs;
        String query = "SELECT * FROM pusers WHERE id = " + user;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.2/prueba" , "rubs" , "1234567");
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
            passwordbd = rs.getString("password");	
            }
        } catch (SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    public static String getemail2(String user) throws SQLException{
        String email;
        ResultSet rs;
        String query = "SELECT * FROM pusers WHERE id = " + user;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.2/prueba" , "rubs" , "1234567");
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
            email = rs.getString("email");	
            return email;
            }
        } catch (SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "0";
        }
    
    public static Connection getConnection(){
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection ->" + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        return cnx;
    }
}