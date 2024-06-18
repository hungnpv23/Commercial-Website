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
public class Account {

    private String id;
    private String username;
    private String password;
    private int isAdmin;
    private int isStaff;
    private int isCus;
    private int id_people;

    public Account() {
    }

    public Account(String id, String username, String password, int isAdmin, int isStaff, int isCus, int id_people) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isStaff = isStaff;
        this.isCus = isCus;
        this.id_people = id_people;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getIsStaff() {
        return isStaff;
    }

    public void setIsStaff(int isStaff) {
        this.isStaff = isStaff;
    }

    public int getIsCus() {
        return isCus;
    }

    public void setIsCus(int isCus) {
        this.isCus = isCus;
    }

    public int getId_people() {
        return id_people;
    }

    public void setId_people(int id_people) {
        this.id_people = id_people;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + ", isStaff=" + isStaff + ", isCus=" + isCus + ", id_people=" + id_people + '}';
    }
 
}
