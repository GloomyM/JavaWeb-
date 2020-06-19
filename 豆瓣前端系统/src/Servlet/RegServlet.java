package Servlet;

import Bean.Admin;
import Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/regs")
public class RegServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password0 = req.getParameter("password0");
        String password1 = req.getParameter("password1");
        if(password0 != null && password1 != null && username != null){
            if(password0.equals(password1)){
                Admin admin = new Admin();
                admin.setUsername(username);
                admin.setPassword(password0);
                UserService us = new UserService();
                us.Reg(admin);
                req.getRequestDispatcher("/index.jsp").forward(req,resp);
            }
        }
    }
}
