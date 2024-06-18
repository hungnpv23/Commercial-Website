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
public class Cart {
    private int product_id;
    private int customer_id;
    private int quantity;
    

    public Cart() {
    }

    public Cart(int product_id, int customer_id, int quantity) {
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.quantity = quantity;
    }


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Cart{" + "product_id=" + product_id + ", customer_id=" + customer_id + ", quantity=" + quantity + '}';
    }

    
}
