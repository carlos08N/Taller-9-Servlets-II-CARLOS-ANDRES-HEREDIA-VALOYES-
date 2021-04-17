package com.mycompany.tallerjakartaservletsii;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Alcubo", urlPatterns = {"/Alcubo"})
public class Alcubo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Alcubo</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Resultado</h1>");
        out.println("<br>");
        out.println("["+(Math.pow(Double.parseDouble(request.getParameter("num")), 3))+"]");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
/*CARLOS ANDRES HEREDIA VALOYES*/