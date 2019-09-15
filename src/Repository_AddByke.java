
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Repository_AddByke {

    public Repository_AddByke() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Repository_AddByke.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int insert(String name,float retailer_price,float customer_price,int quantity){
        int result =0;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/add","root","");
            PreparedStatement pstmt = con.prepareStatement("insert into byke(id,name,retailer_price,customer_price,quantity) values(?,?,?,?)");
            pstmt.setString(1, name);
            pstmt.setFloat(2, retailer_price);
            pstmt.setFloat(3, customer_price);
            pstmt.setInt(4, quantity);
            result = pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error in insert"+ex.getMessage());
            //Logger.getLogger(Repository_AddByke.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        }
    return result;
    }

public ArrayList<Product> loadProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/add","root","");
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT id,name, retailer_price, customer_price,quantity FROM byke");
            while (result.next()) { 
                products.add(new Product(result.getInt(1),result.getString(2),result.getFloat(3),result.getFloat(4),result.getInt(5)));
                
            }
            result.close();
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
//            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
            return products;
        }
        
        return products;
}

 public void updateProduct(int id, int quantity) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/add","root","");
            PreparedStatement stmt = con.prepareStatement("UPDATE productinventorylist SET byke=? WHERE id=?");
            stmt.setInt(1, quantity);
            stmt.setInt(2, id);
            int result = stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}
    

    

