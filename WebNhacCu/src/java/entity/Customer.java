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
public class Customer {
    private int cus_id;
    private String fullname;
    private String phoneNum;
    private String address;
    private String cus_type;
    private int accumlated_points;

    public Customer() {
    }

    public Customer(int cus_id, String fullname, String phoneNum, String address, String cus_type, int accumlated_points) {
        this.cus_id = cus_id;
        this.fullname = fullname;
        this.phoneNum = phoneNum;
        this.address = address;
        this.cus_type = cus_type;
        this.accumlated_points = accumlated_points;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCus_type() {
        return cus_type;
    }

    public void setCus_type(String cus_type) {
        this.cus_type = cus_type;
    }

    public int getAccumlated_points() {
        return accumlated_points;
    }

    public void setAccumlated_points(int accumlated_points) {
        this.accumlated_points = accumlated_points;
    }

    @Override
    public String toString() {
        return "Customer{" + "cus_id=" + cus_id + ", fullname=" + fullname + ", phoneNum=" + phoneNum + ", address=" + address + ", cus_type=" + cus_type + ", accumlated_points=" + accumlated_points + '}';
    }

    
}
