package com.mycompany.tallerjakartaservletsii;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Hipotenusa", urlPatterns = {"/Hipotenusa"})
public class Hipotenusa extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int c1 = Integer.parseInt(request.getParameter("num"));
        int c2 = Integer.parseInt(request.getParameter("num2"));
        double r = Math.sqrt((Math.pow(c1, 2))+(Math.pow(c2, 2)));
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Hipotenusa</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Resultado</h1>");
        out.println("<br>");
        out.println("["+ r +"]");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
/*CARLOS ANDRES HEREDIA VALOYES*/