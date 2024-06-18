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
@WebServlet(name = "Increase", urlPatterns = {"/Increase"})
public class Increase extends HttpServlet {

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
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("acc");
        DAO dao = new DAO();
        String id = request.getParameter("id");

        if (account.getIsCus() == 1) {  
            dao.Increase(String.valueOf(account.getId_people()), id);
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

            for (Product p : listP) {
                if (p.getPro_id() == Integer.valueOf(id)) {
                    p.setQuantity(p.getQuantity() + 1);
                    break;
                }
            }
            
            int check = 0;
            String txt ="";
            for (Product product : listP) {
                if (check == 0) {
                    txt = product.getPro_id() + ":" + product.getQuantity();
                    check = 1;
                } else {
                    txt += "," + product.getPro_id() + ":" + product.getQuantity();
                }
            }
            Cookie c = new Cookie("cart", txt);
            c.setMaxAge(60 * 60 * 24);
            response.addCookie(c);

        }
        response.sendRedirect("CartControl");
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
