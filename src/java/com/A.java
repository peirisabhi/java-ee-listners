/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author abhi
 */
public class A extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session =  req.getSession();
       session.setAttribute("name", new User());
       
    }
    
    
    

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//       HttpSession session =  req.getSession();
//       session.setMaxInactiveInterval(10);
//       session.setAttribute("name", "aasas");
//    }
//    
    

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        req.setAttribute("name", "asasa");
//    
//    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        
//        String name = req.getParameter("name");
//       ServletContext context =  getServletContext();
//       context.setAttribute("name", name);
//       req.removeAttribute("name");
//       
//    }
    
    

    

}
