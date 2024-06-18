/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author DELL
 */
public class Detail {
    private int bill_id;
    private float price;
    private int quantity;
    private int product_id;
    
    

    public Detail() {
    }

    public Detail(int bill_id, float price, int quantity, int product_id) {
        this.bill_id = bill_id;
        this.price = price;
        this.quantity = quantity;
        this.product_id = product_id;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Detail{" + "bill_id=" + bill_id + ", product_id=" + product_id + ", quantity=" + quantity + ", price=" + price + '}';
    }

    
    
}
