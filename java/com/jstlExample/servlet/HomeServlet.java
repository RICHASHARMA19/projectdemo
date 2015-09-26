/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jstlExample.servlet;

import com.jstlExample.model.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RICHA
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/HomeServlet"})
public class HomeServlet extends HttpServlet {
    
    private static final long serialVersionUId=1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    List<Employee> empList=new ArrayList<Employee>();
    Employee emp1=new Employee();
    emp1.setId(1);
    emp1.setName("ABC");
    emp1.setRole("user");
    
    Employee emp2=new Employee();
    emp2.setId(2);
    emp2.setName("XYZ");
    emp2.setRole("admin");
    
    empList.add(emp1);
    empList.add(emp2);
    
    request.setAttribute("empList", empList);
    
    RequestDispatcher rd=getServletContext().getRequestDispatcher("/home.jsp");
    rd.forward(request, response);
    
    
    }
    
    

    

}
