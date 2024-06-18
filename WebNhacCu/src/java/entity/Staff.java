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
public class Staff {
    private String staff_id;
    private String name;
    private String phoneNum;
    private String address;
    private String image;
    private String status;

    public Staff() {
    }

    public Staff(String staff_id, String name, String phoneNum, String address, String image, String status) {
        this.staff_id = staff_id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.image = image;
        this.status = status;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Staff{" + "staff_id=" + staff_id + ", name=" + name + ", phoneNum=" + phoneNum + ", address=" + address + ", image=" + image + ", status=" + status + '}';
    }

    
    
}
