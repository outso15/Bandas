/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author esteb
 */
@WebServlet(urlPatterns = {"/bandas"})
public class bandas extends HttpServlet {
String s;
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Bandas Aleatorias</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>En esta oportunidad:   " + s + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        
        String[] musicos = new String[5];
        String[] instrumentos = new String[6];
        String[] Afinar = new String[6];
        
        musicos[0]="Kurt Cobain";
        musicos[1]="Krist Novoselic";
        musicos[2]="Dave Grohl";
        musicos[3]="Dave Foster";
        musicos[4]="Dan Peters";
        
        instrumentos[0] ="Guitarra Electrica";
        instrumentos[1] ="Bateria";
        instrumentos[2] ="Voz";
        instrumentos[3] ="Bajo Electrico";
        instrumentos[4] ="Teclado";
        instrumentos[5] ="Contrabajo";
        
        Afinar[0]="Afinando la guitarra, GRRRRR";
        Afinar[1]="Afinando la Bateria, Bummmmm";
        Afinar[2]="Afinando la Voz, 'la la la la' ";
        Afinar[3]="Afinando el bajo electrico, dammm";
        Afinar[4]="Afinando el teclado dododo";
        Afinar[5]="Afinando el contrabajo, deedee ";
        
        int n = (int)(Math.random()*5);
         int m = (int)(Math.random()*6);
         s= musicos[n]+" hoy manejara " + instrumentos[m] + " ... " + musicos[n] + "está " + Afinar[m];            
           // return s;
        
       // banda hoy= new banda (musicos[], instrumentos[],Afinar[]);
        
        processRequest(request, response);
    }
    
     public static String banda (String c[], String i[], String a[]){
         int n = (int)(Math.random()*5);
         int m = (int)(Math.random()*6);
         String s= c[n]+" hoy manejara " + i[m] + " ... " + c[n] + "está " + a[m];            
            return s;
        };
     

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
