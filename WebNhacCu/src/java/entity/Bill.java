/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class Bill {
    private int bill_id;
    private Date purchaseDate;
    private String staff_id;
    private String customer_id;
    private float total;

    public Bill() {
    }

    public Bill(int bill_id, Date purchaseDate, String staff_id, String customer_id) {
        this.bill_id = bill_id;
        this.purchaseDate = purchaseDate;
        this.staff_id = staff_id;
        this.customer_id = customer_id;
        this.total = 0;
    }


    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Bill{" + "bill_id=" + bill_id + ", purchaseDate=" + purchaseDate + ", staff_id=" + staff_id + ", customer_id=" + customer_id + ", total=" + total + '}';
    }

        
    
}
