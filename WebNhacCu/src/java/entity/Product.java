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
public class Product {
    private int pro_id;
    private String name;
    private String material;
    private float price;
    private int quantity;
    private int yearofManufacture;
    private String description;
    private String image;
    private int cate_id;

    public Product() {
    }

    public Product(int pro_id, String name, String material, float price, int quantity, int yearofManufacture, String description, String image, int cate_id) {
        this.pro_id = pro_id;
        this.name = name;
        this.material = material;
        this.price = price;
        this.quantity = quantity;
        this.yearofManufacture = yearofManufacture;
        this.description = description;
        this.image = image;
        this.cate_id = cate_id;
    }

    public Product(int aInt, String string, String string0, double aDouble, int aInt0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getYearofManufacture() {
        return yearofManufacture;
    }

    public void setYearofManufacture(int yearofManufacture) {
        this.yearofManufacture = yearofManufacture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCate_id() {
        return cate_id;
    }

    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }

    @Override
    public String toString() {
        return "Product{" + "pro_id=" + pro_id + ", name=" + name + ", material=" + material + ", price=" + price + ", quantity=" + quantity + ", yearofManufacture=" + yearofManufacture + ", description=" + description + ", image=" + image + ", cate_id=" + cate_id + '}';
    }
    
}
