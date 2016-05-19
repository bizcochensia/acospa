/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.Conexion;
import dao.Visitante;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miguel
 */
@WebServlet(name = "registro", urlPatterns = {"/registro"})
public class registro extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    public registro() {
        super();
        System.out.println("Se genera la instancia del servlet-BuscarPorEntidad");
        // TODO Auto-generated constructor stub
    }
    @Override
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        Visitante  visitante = new Visitante();
        visitante.setNombre(request.getParameter("nombre"));
        visitante.setApPat(request.getParameter("apPat"));
        visitante.setApMat(request.getParameter("apMat"));
        visitante.setTelefono(request.getParameter("tel"));
        visitante.setCel(request.getParameter("cel"));
        Conexion conexion = new Conexion();
        conexion.open();
        conexion.insert(visitante);
        
    }

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
