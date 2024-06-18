/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Account;
import entity.Cart;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
@WebServlet(name = "Pay", urlPatterns = {"/Pay"})
public class Pay extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DAO dao = new DAO();
        HttpSession session = request.getSession();
        float total = Float.valueOf(request.getParameter("total"));
        Account account = (Account) session.getAttribute("acc");

        Date d = new Date();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.000");
        LocalDateTime localDateTime = LocalDateTime.now();
        String OrderDate = localDateTime.format(formatter);
        if (account.getIsCus() == 1) {
            dao.setBillCus(OrderDate, "1", String.valueOf(account.getId_people()));
            List<Cart> list = new ArrayList<>();
            list = dao.getCart(String.valueOf(account.getId_people()));

            for (Cart c : list) {
                dao.setDetail(c.getQuantity(), String.valueOf(c.getProduct_id()));
                dao.minus(c.getQuantity(), String.valueOf(c.getProduct_id()));
            }
            dao.Pay(String.valueOf(account.getId_people()), total);
            response.sendRedirect("HomeControl");
        } else {
            Cookie[] arr = request.getCookies();
            String txt = "";
            for (Cookie o : arr) {
                if (o.getName().equals("cart")) {
                    txt = txt + o.getValue();
                    o.setMaxAge(0);
                    response.addCookie(o);
                }
            }
            String[] a = txt.split(",");
            List<Product> list = new ArrayList<Product>();
            for (int i = 0; i < a.length; i++) {
                String[] b = a[i].split(":");
                Product test = dao.getProductsByID(b[0]);
                test.setQuantity(Integer.valueOf(b[1]));
                list.add(test);
            }
            String phone = (String) request.getParameter("phone");
            String id = String.valueOf(dao.getIDCustomerByPhone(phone));
            dao.setBillCus(OrderDate, String.valueOf(account.getId_people()), id);
            for (Product p : list) {
                dao.setDetail(p.getQuantity(), String.valueOf(p.getPro_id()));
                dao.minus(p.getQuantity(), String.valueOf(p.getPro_id()));
            }
            dao.Pay(id, total);
            response.sendRedirect("HomeControl");
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
