/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Account;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AddProductToCart", urlPatterns = {"/AddProductToCart"})
public class AddProductToCart extends HttpServlet {

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
        String id_Pro = request.getParameter("pid");
        String quantity = request.getParameter("quantity");
        String id_Peo = request.getParameter("idp");

        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("acc");

        if (account.getIsCus() == 1) {
            DAO dao = new DAO();
            dao.AddProductToCart(id_Peo, id_Pro, quantity);
            response.sendRedirect("HomeControl");
        } else {
            DAO dao = new DAO();
            Cookie[] arr = request.getCookies();
            String txt = "";
            for (Cookie o : arr) {
                if (o.getName().equals("cart")) {
                    txt = txt + o.getValue();
                    o.setMaxAge(0);
                    response.addCookie(o);
                }
            }
            if (txt.isEmpty()) {
                txt = id_Pro + ":" + quantity;
            } else {
                String[] a = txt.split(",");
                List<Product> p = new ArrayList<Product>();
                for (int i = 0; i < a.length; i++) {
                    String[] b = a[i].split(":");
                    Product test = dao.getProductsByID(b[0]);
                    test.setQuantity(Integer.valueOf(b[1]));
                    p.add(test);
                }
                int check = 0;
                for (Product product : p) {
                    if (product.getPro_id() == Integer.valueOf(id_Pro)) {
                        product.setQuantity(product.getQuantity() + Integer.valueOf(quantity));
                        check = 1;
                    }

                }
                if (check == 0) {
                    Product test = dao.getProductsByID(id_Pro);
                    test.setQuantity(Integer.valueOf(quantity));
                    p.add(test);
                }
                System.err.println(p);
                check = 0;
                for (Product product : p) {
                    if (check == 0) {
                        txt = product.getPro_id() + ":" + product.getQuantity();
                        check = 1;
                    } else {
                        txt += "," + product.getPro_id() + ":" + product.getQuantity();
                    }
                }
            }
            Cookie c = new Cookie("cart", txt);
            c.setMaxAge(60 * 60 * 24);
            response.addCookie(c);
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
