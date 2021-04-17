package com.mycompany.tallerjakartaservletsii;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NumeroAleatorio", urlPatterns = {"/NumeroAleatorio"})
public class NumeroAleatorio extends HttpServlet {
    
    public ArrayList<Double> numeros = new ArrayList<Double>();
    
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        for(int i=0;i<10;i++){
            numeros.add(Math.random()*(1-100)+100);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double r=0;
        String rn = "";
        for(int i=0;i<10;i++){
            r = r+ numeros.get(i);
        }
        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Alcubo</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Numeros sumados:</h1>");
        out.println("<br>");
        for(int i=0;i<10;i++){
            out.println(numeros.get(i));
            out.println("<br>");
        }
        out.println("<h1>La Suma es:</h1>");
        out.println("<br>");
        out.println("["+r+"]");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
/*CARLOS ANDRES HEREDIA VALOYES*/