/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "addNewStaff", urlPatterns = {"/addNewStaff"})
public class addNewStaff extends HttpServlet {

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
        request.getRequestDispatcher("staff").forward(request, response);
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

        String fullname = request.getParameter("fullname");
        String phoneNum = request.getParameter("phoneNum");
        String address = request.getParameter("address");
        String image = request.getParameter("image");
        String status = request.getParameter("status");       
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String re_pass = request.getParameter("repass");
        if (fullname == null || phoneNum == null || address == null || image == null || status == null || user == null || pass == null || re_pass == null) {
            request.setAttribute("success", "Please fill all ");
            request.getRequestDispatcher("addNewStaff.jsp").forward(request, response);
        } else if (!pass.equals(re_pass)) {
            request.setAttribute("mess", "Password confirm incorrect");
            request.setAttribute("fullname", fullname);
            request.setAttribute("phoneNum", phoneNum);
            request.setAttribute("address", address);
            request.setAttribute("status", status);
            request.setAttribute("image", image);
            request.getRequestDispatcher("addNewStaff.jsp").forward(request, response);
        } else {
            DAO dao = new DAO();
            Account a = dao.checkAccountExist(user);
            if (a == null) {
                //tạo tài khoản staff mới
                dao.addNewStaff(fullname, phoneNum, address, image, status, user, pass);
                request.setAttribute("success", "Add new Staff succeed");
                response.sendRedirect("addNewStaff");
            } else {
                //day ve trang addnewstaff
                request.setAttribute("mess", "Username had been used");
                request.setAttribute("fullname", fullname);
                request.setAttribute("phoneNum", phoneNum);
                request.setAttribute("address", address);
                request.setAttribute("status", status);
                request.setAttribute("image", image);
                request.getRequestDispatcher("addNewStaff.jsp").forward(request, response);
            }
        }
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
