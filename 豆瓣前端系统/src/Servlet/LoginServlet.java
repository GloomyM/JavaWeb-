package Servlet;

import Bean.Admin;
import Dao.UserDao;
import Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Admin admin = new Admin();
        admin.setPassword(password);
        admin.setUsername(username);
        UserService us = new UserService();
        if(username != null && password != null){
            if(us.Login(admin)){
                if(req.getParameter("autologin").equals("ok")){
                    Cookie cookie = new Cookie("user",username+"-"+password);
                    cookie.setMaxAge(60*60);
                    cookie.setPath("/");
                    resp.addCookie(cookie);
                }
                req.getRequestDispatcher("main.jsp").forward(req,resp);
            }else {
                resp.setContentType("text/html;charset=UTF-8");
                resp.setHeader("Cache-Control", "no-cache");
                resp.setCharacterEncoding("UTF-8");
                resp.getWriter().write("登录失败");
            }
        }
    }
}
