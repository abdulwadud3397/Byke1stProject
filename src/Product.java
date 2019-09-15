/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Product {
    private int id;
    private String Byke_Name;
    private float Retailer_Price;
    private float Customer_Price;
    private int Quantity;

    public Product() {
    }

    public Product(int id, String Byke_Name, float Retailer_Price, float Customer_Price, int Quantity) {
        this.id = id;
        this.Byke_Name = Byke_Name;
        this.Retailer_Price = Retailer_Price;
        this.Customer_Price = Customer_Price;
        this.Quantity = Quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getByke_Name() {
        return Byke_Name;
    }

    public void setByke_Name(String Byke_Name) {
        this.Byke_Name = Byke_Name;
    }

    public float getRetailer_Price() {
        return Retailer_Price;
    }

    public void setRetailer_Price(float Retailer_Price) {
        this.Retailer_Price = Retailer_Price;
    }

    public float getCustomer_Price() {
        return Customer_Price;
    }

    public void setCustomer_Price(float Customer_Price) {
        this.Customer_Price = Customer_Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    

  

    
}
