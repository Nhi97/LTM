package controller;

import model.entities.User;
import model.services.UserServices;
import model.services.servicesimpl.UserServicesImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {

    private UserServices userServices;
    private RequestDispatcher dispatcher;


    public Login() {
        userServices = new UserServicesImpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");

        System.out.println("---------------------------------------------");
        System.out.println(username);
        System.out.println(password);

        User user = new User(username, password);
       /// User  user1 = userServices.getAddress(user);

        if(userServices.checkLogin(user)){
            User  user2 = userServices.getAddress(user);
            req.setAttribute("address", user2.getAddress());
            dispatcher = req.getRequestDispatcher("/view/Welcome.jsp");
        }else{
            dispatcher = req.getRequestDispatcher("/view/Login.jsp");
        }

        dispatcher.forward(req,resp);

    }
}
