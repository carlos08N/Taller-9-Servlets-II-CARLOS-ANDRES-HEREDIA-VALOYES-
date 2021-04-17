package com.mycompany.tallerjakartaservletsii;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ContadordeVisitas", urlPatterns = {"/ContadordeVisitas"})
public class ContadordeVisitas extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Integer Sesion = 0;
        PrintWriter out = response.getWriter();
        HttpSession Msession = request.getSession();
        Sesion = (Integer)Msession.getAttribute("num");
        if(Sesion == null){
            Sesion = 1;
        }
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Contador de Visitas</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Resultado</h1>");
        out.println("<br>");
        out.println("La pagina a sido visitada ["+Sesion+"] Veces.");
        out.println("</body>");
        out.println("</html>");
        Sesion++;
        Msession.setAttribute("num", Sesion);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
/*CARLOS ANDRES HEREDIA VALOYES*/