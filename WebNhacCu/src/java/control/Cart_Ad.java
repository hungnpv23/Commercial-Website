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
@WebServlet(name = "Cart_Ad", urlPatterns = {"/CartControl"})
public class Cart_Ad extends HttpServlet {

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
        Account account = (Account) session.getAttribute("acc");
        String id = String.valueOf(account.getId_people());

        if (account.getIsCus() == 1) {
            List<Cart> list = dao.getCartByID(id);
            System.out.println(id);
            List<Product> listP = new ArrayList<>();
            for (Cart c : list) {
                Product P = dao.getProductsByID(Integer.toString(c.getProduct_id()));
                P.setQuantity(c.getQuantity());
                listP.add(P);
            }
            
            float total = 0;
            
            for (Product p : listP){
                total += p.getQuantity() * p.getPrice();
            }
            
            request.setAttribute("Total", total);
            request.setAttribute("listP", listP);
            request.getRequestDispatcher("Cart.jsp").forward(request, response);
        } else {
            Cookie arr[] = request.getCookies();
            List<Product> listP = new ArrayList<Product>();
            for (Cookie c : arr) {
                if (c.getName().equals("cart")) {
                    String txt[] = c.getValue().split(",");
                    for (String s : txt) {
                        String[] a = s.split(":");
                        Product p = dao.getProductsByID(a[0]);
                        p.setQuantity(Integer.valueOf(a[1]));
                        listP.add(p);
                    }
                }
            }
            float total = 0;
            for (Product p : listP){
                total += p.getQuantity() * p.getPrice();
}
            
            request.setAttribute("Total", total);
            request.setAttribute("listP", listP);
            request.getRequestDispatcher("Cart.jsp").forward(request, response);
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
