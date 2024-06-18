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
import org.apache.coyote.http11.Http11AprProcessor;

/**
 *
 * @author DELL
 */
@WebServlet(name = "RemoveCart", urlPatterns = {"/RemoveCart"})
public class RemoveCart extends HttpServlet {

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
        String id = request.getParameter("id");
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("acc");
        DAO dao = new DAO();

        if (account.getIsCus() == 1) {
            String peo_id = String.valueOf(account.getId_people());
            dao.RemoveCart(id, peo_id);
            response.sendRedirect("CartControl");
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
            List<Product> p = new ArrayList<Product>();
            for (int i = 0; i < a.length; i++) {
                String[] b = a[i].split(":");
                Product test = dao.getProductsByID(b[0]);
                test.setQuantity(Integer.valueOf(b[1]));
                p.add(test);
            }
            for (Product product : p) {
                if (product.getPro_id() == Integer.valueOf(id)) {
                    p.remove(product);
                    break;
                }
            }
            int check = 0;
            if (p.size() == 0) {
                Cookie c = new Cookie("cart", txt);
                c.setMaxAge(0);
            } else {
                for (Product product : p) {
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
