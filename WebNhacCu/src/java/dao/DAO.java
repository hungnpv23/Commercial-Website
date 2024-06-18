/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Bill;
import entity.Cart;
import entity.Category;
import entity.Customer;
import entity.Detail;
import entity.Product;
import entity.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Product> getAllGuitar() {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product\n"
                + "where Category_ID = 1";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getAllDrum() {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product\n"
                + "where Category_ID = 2";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getAllFlute() {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product\n"
                + "where Category_ID = 3";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Staff> getAllStaff() {
        List<Staff> listS = new ArrayList<>();
        String query = "select * from Staff";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listS.add(new Staff(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listS;
    }

    public List<Product> getAllProduct() {
        List<Product> listP = new ArrayList<>();
        String query = "select * from Product";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listP;
    }

    public Product getLastGuitar() {
        String query = "select top 1 * from Product\n"
                + "where Category_ID = 1\n"
                + "order by Product_ID desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Product getLastDrum() {
        String query = "select top 1 * from Product\n"
                + "where Category_ID = 2\n"
                + "order by Product_ID desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Product getLastFlute() {
        String query = "select top 1 * from Product\n"
                + "where Category_ID = 3\n"
                + "order by Product_ID desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Product getElectricGuitar() {
        String query = "select top 1 * from Product\n"
                + "where Product_ID ='3'";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccountExist(String user) {
        String query = "Select * from Account\n "
                + "where [UserName] = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public Account login(String user, String pass) {
        String query = "select * from Account\n"
                + "where [UserName] = ? and [Password] = ? ";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new Account(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7));

            }
        } catch (Exception e) {

        }
        return null;
    }

    public void deleteProduct(String pid) {
        String query = "delete from Product\n"
                + "where Product_ID = ?";
        try {
            // Open connection with SQL Server
            conn = new DBContext().getConnection();
            // Throw the query statement to SQL Server
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setString(1, pid);

            ps.executeUpdate();
        } catch (Exception e) {

        }

    }

    public void removeStaffAccount(String id_peo) {
        String query = "delete from Account\n"
                + "where ID_People = ? and isSatff = 1";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id_peo);
            ps.executeUpdate();
        } catch (Exception e) {

        }

    }

    public void signUp(String fullname, String phone, String address, String username, String password) {
        String query = "insert into Customer\n"
                + "values (?, ?, ?, 'Bronze', '0')\n"
                + "insert into Account\n"
                + "values (?, ?, 0, 0, 1, (select Customer_ID from Customer where FullName = ? and PhoneNumber = ?))";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, fullname);
            ps.setString(2, phone);
            ps.setString(3, address);
            ps.setString(4, username);
            ps.setString(5, password);
            ps.setString(6, fullname);
            ps.setString(7, phone);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addNewStaff(String fullname, String phone, String address, String image, String status, String username, String password) {
        String query = "insert into Staff\n"
                + "values (?, ?, ?, ?, ?)\n"
                + "insert into Account\n"
                + "values (?, ?, 0, 1, 0, (select Staff_ID from Staff where FullName = ? and PhoneNumber = ?))";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, fullname);
            ps.setString(2, phone);
            ps.setString(3, address);
            ps.setString(4, image);
            ps.setString(5, status);
            ps.setString(6, username);
            ps.setString(7, password);
            ps.setString(8, fullname);
            ps.setString(9, phone);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void EditProduct(String id, String name, String material, String price, String quantity, String year, String description, String image, String cate_id) {
        String query = "update [dbo].[Product]"
                + "set [ProductName] = ?,"
                + "[Material] = ?,"
                + "[Price] = ?,"
                + "[Quantity]= ?,"
                + "[YearOfManufacture] = ?,"
                + "[Description] = ?,"
                + "[Image] = ?,"
                + "Category_ID = ?"
                + " where [Product_ID] = ?";

        try {
            conn = new DBContext().getConnection();
            // Throw the query statement to SQL Server
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setString(1, name);
            ps.setString(2, material);
            ps.setString(3, price);
            ps.setString(4, quantity);
            ps.setString(5, year);
            ps.setString(6, description);
            ps.setString(7, image);
            ps.setString(8, cate_id);
            ps.setString(9, id);
            System.out.println(id + " " + name + " " + material + " " + price + " " + quantity + " " + year + " " + description + " " + image);

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void AddProduct(String name, String material, String price, String quantity, String year, String description, String image, String category) {
        String query = "INSERT INTO [Product]"
                + "([ProductName],[Material],[Price],[Quantity],[YearOfManufacture],[Description],[Image],[Category_ID])\n"
                + "VALUES (?,?,?,?,?,?,?,?);";
        try {
            // Open connection with SQL Server
            conn = new DBContext().getConnection();
            // Throw the query statement to SQL Server
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setString(1, name);
            ps.setString(2, material);
            ps.setString(3, price);
            ps.setString(4, quantity);
            ps.setString(5, year);
            ps.setString(6, description);
            ps.setString(7, image);
            ps.setString(8, category);

            ps.executeUpdate();
        } catch (Exception e) {

        }

    }

    public Product getProductsByID(String id) {
        String query = "Select * from [Product]"
                + "where [Product_ID] = ?";
        try {
            // Open connection with SQL Server
            conn = new DBContext().getConnection();
            // Throw the query statement to SQL Server
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setString(1, id);

            rs = ps.executeQuery();

            // Add data in rs to ArrayList
            while (rs.next()) {
                //int id, String name, String image, double price, String title, String description
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9));
            }
        } catch (Exception e) {
            System.out.println("Fail, please contact to admin!!");
            e.printStackTrace();
        }
        return null;
    }

    public Customer getCustomerByID(int id) {
        String query = "select * from Customer\n"
                + "where Customer_ID = ?";
        try {
            // Open connection with SQL Server
            conn = new DBContext().getConnection();
            // Throw the query statement to SQL Server
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setInt(1, id);

            rs = ps.executeQuery();

            // Add data in rs to ArrayList
            while (rs.next()) {
                return new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void AddProductToCart(String peo_id, String pro_id, String quantity) {
        String query = "if (SELECT 1 FROM [dbo].[Cart] WHERE Product_ID = ?) = 1	\n"
                + "	update Cart\n"
                + "	set Quantity = Quantity + ?\n"
                + "	where Product_ID = ? and Customer_ID = ?\n"
                + "else \n"
                + "	INSERT INTO [Cart] ([Product_ID], [Customer_ID], [Quantity]) VALUES(?, ?, ?)";
        try {
            // Open connection with SQL Server
            conn = new DBContext().getConnection();
            // Throw the query statement to SQL Server
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setString(1, pro_id);
            ps.setString(2, quantity);
            ps.setString(3, pro_id);
            ps.setString(4, peo_id);
            ps.setString(5, pro_id);
            ps.setString(6, peo_id);
            ps.setString(7, quantity);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RemoveStaff(String id) {
        String query = "delete from [Staff] where [Staff_ID] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void EditStaff(String id, String name, String phone, String address, String image, String status) {
        String query = "update [dbo].[Staff]"
                + "set [FullName] = ?,"
                + "[PhoneNumber] = ?,"
                + "[Address] = ?,"
                + "[Image]= ?,"
                + "[Status] = ?"
                + " where [Staff_ID] = ?";

        try {
            conn = new DBContext().getConnection();
            // Throw the query statement to SQL Server
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, address);
            ps.setString(4, image);
            ps.setString(5, status);
            ps.setString(6, id);
            System.out.println(id + " " + name + " " + phone + " " + address + " " + image + " " + status);

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void EditCustomer(String id, String name, String phone, String address, String cus_type, String points) {
        String query = "update Customer\n"
                + "set FullName = ?,\n"
                + "PhoneNumber = ?,\n"
                + "[Address] = ?,\n"
                + "Customer_type = ?,\n"
                + "Accumulated_points = ? \n"
                + "where Customer_ID = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, address);
            ps.setString(4, cus_type);
            ps.setString(5, points);
            ps.setString(6, id);

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public Staff getStaffByID(String id) {
        String query = "Select * from [Staff]"
                + "where [Staff_ID] = ?";
        try {
            // Open connection with SQL Server
            conn = new DBContext().getConnection();
            // Throw the query statement to SQL Server
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setString(1, id);

            rs = ps.executeQuery();

            // Add data in rs to ArrayList
            while (rs.next()) {
                //int id, String name, String image, double price, String title, String description
                return new Staff(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        } catch (Exception e) {
            System.out.println("Fail, please contact to admin!!");
            e.printStackTrace();
        }
        return null;
    }

    public List<Cart> getCartByID(String id) {
        List<Cart> list = new ArrayList<>();
        String query = "Select * from [Cart]"
                + "where [Customer_ID] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Cart(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void RemoveCart(String pro_id, String peo_id) {
        String query = "DELETE FROM [Cart] WHERE [Product_ID] = ? AND [Customer_ID] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pro_id);
            ps.setString(2, peo_id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void Increase(String id_Peo, String id_Pro) {
        String query = "UPDATE [Cart] SET [Quantity] = [Quantity] + 1 WHERE [Product_ID] = ? AND [Customer_ID] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id_Pro);
            ps.setString(2, id_Peo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void Decrease(String id_Peo, String id_Pro) {
        String query = "IF (SELECT [Quantity] - 1 FROM [Cart] WHERE Product_ID = ? AND Customer_ID = ?) = 0\n"
                + "	DELETE Cart WHERE Product_ID = ? AND Customer_ID = ?\n"
                + "ELSE \n"
                + "	UPDATE [Cart] SET [Quantity] = [Quantity] - 1 WHERE [Product_ID] = ? AND [Customer_ID] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id_Pro);
            ps.setString(2, id_Peo);
            ps.setString(3, id_Pro);
            ps.setString(4, id_Peo);
            ps.setString(5, id_Pro);
            ps.setString(6, id_Peo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void Pay(String id_Peo, float total) {
        String query = "DELETE [Cart] WHERE [Customer_ID] = ?\n"
                + "UPDATE [Customer] SET [Accumulated_points] = [Accumulated_points] + ? / 10 WHERE [Customer_ID] = ?\n"
                + "if (SELECT [Accumulated_points] FROM [Customer] WHERE [Customer_ID] = ?) >= 100\n"
                + "	UPDATE [Customer] SET [Customer_type] = 'SILVER' WHERE [Customer_ID] = ?\n"
                + "else if (SELECT [Accumulated_points] FROM [Customer] WHERE [Customer_ID] = ?) >= 1000\n"
                + "	UPDATE [Customer] SET [Customer_type] = 'GOLD' WHERE [Customer_ID] = ?\n"
                + "else if (SELECT [Accumulated_points] FROM [Customer] WHERE [Customer_ID] = ?) >= 1000\n"
                + "	UPDATE [Customer] SET [Customer_type] = 'PLATINUM' WHERE [Customer_ID] = ?\n"
                + "else if (SELECT [Accumulated_points] FROM [Customer] WHERE [Customer_ID] = ?) >= 10000\n"
                + "	UPDATE [Customer] SET [Customer_type] = 'DIAMOND' WHERE [Customer_ID] = ?\n"
                + "else if (SELECT [Accumulated_points] FROM [Customer] WHERE [Customer_ID] = ?) >= 100000\n"
                + "	UPDATE [Customer] SET [Customer_type] = 'VIP' WHERE [Customer_ID] = ?\n"
                + "else if (SELECT [Accumulated_points] FROM [Customer] WHERE [Customer_ID] = ?) >= 1000000\n"
                + "	UPDATE [Customer] SET [Customer_type] = 'SVIP' WHERE [Customer_ID] = ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id_Peo);
            ps.setFloat(2, total);
            ps.setString(3, id_Peo);
            ps.setString(4, id_Peo);
            ps.setString(5, id_Peo);
            ps.setString(6, id_Peo);
            ps.setString(7, id_Peo);
            ps.setString(8, id_Peo);
            ps.setString(9, id_Peo);
            ps.setString(10, id_Peo);
            ps.setString(11, id_Peo);
            ps.setString(12, id_Peo);
            ps.setString(13, id_Peo);
            ps.setString(14, id_Peo);
            ps.setString(15, id_Peo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int getIDCustomerByPhone(String phone) {
        String query = "Select [Customer_ID] from [Customer]"
                + "where [PhoneNumber] = ?";
        try {
            // Open connection with SQL Server
            conn = new DBContext().getConnection();
            // Throw the query statement to SQL Server
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setString(1, phone);

            rs = ps.executeQuery();

            // Add data in rs to ArrayList
            while (rs.next()) {
                //int id, String name, String image, double price, String title, String description
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Fail, please contact to admin!!");
            e.printStackTrace();
        }
        return 0;
    }

    public List<Cart> getCart(String id_Peo) {
        List<Cart> list = new ArrayList<>();
        String query = "SELECT * FROM [Cart] WHERE [Customer_ID] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id_Peo);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Cart(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void minus(int quantity, String id_Pro) {
        String query = "UPDATE [Product] SET [Quantity] = [Quantity] - ? WHERE [Product_ID] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, quantity);
            ps.setString(2, id_Pro);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void setBillCus(String time, String id_Staff, String id_Cus) {
        String query = "INSERT INTO [Bill] ([Purchase_date],[Staff_ID],[Customer_ID]) VALUES(?,?,?);";

        try {
            // Open connection with SQL Server
            conn = new DBContext().getConnection();
            // Throw the query statement to SQL Server
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setString(1, time);
            ps.setString(2, id_Staff);
            ps.setString(3, id_Cus);

            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void setDetail(int quantity, String id_Pro) {
        String query = "INSERT INTO [Detail] ([Bill_ID],[Price],[Product_ID],[Quantity]) VALUES((SELECT MAX(Bill_ID) FROM Bill),(SELECT [Price] FROM Product WHERE Product_ID = ?),?,?)";
        try {
            // Open connection with SQL Server
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            // Get the result of SQL Server ans store in rs
            ps.setString(1, id_Pro);
            ps.setString(2, id_Pro);
            ps.setInt(3, quantity);

            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public List<Bill> getAllBills() {
        List<Bill> list = new ArrayList<>();
        String query = "SELECT * FROM [Bill]";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Bill(rs.getInt(1),
                        rs.getDate(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Detail> getProductFromBill(String id) {
        List<Detail> list = new ArrayList<>();
        String query = "SELECT * FROM [Detail] WHERE [Bill_ID] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Detail(rs.getInt(1),
                        rs.getFloat(2),
                        rs.getInt(3),
                        rs.getInt(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Product> searchProductByName(String searchValue) {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product where ProductName like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + searchValue + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from Category";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getProductByCategory(String cid) {
        List<Product> listPBC = new ArrayList<>();//list to store data
        String query = "select * \n"
                + "from product p \n"
                + "where p.Category_ID = ?";

        try {
            conn = new DBContext().getConnection(); //open connect to sql
            ps = conn.prepareStatement(query);//throw query to sql
            ps.setString(1, cid);
            rs = ps.executeQuery();//take result from sql

            while (rs.next()) {
                listPBC.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listPBC;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();

    }

}
