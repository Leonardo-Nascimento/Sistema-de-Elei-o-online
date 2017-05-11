/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eleicao.servlet;

import br.eleicao.candidato.lCandidato;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.eleicao.dao.lCandidatoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Ariane
 */
public class lRegistrarVoto extends HttpServlet {

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
        
        
}

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
                        
        
            String num = request.getParameter("numero");
            int lnumeroVotado = Integer.parseInt(num);        
          
            lCandidatoDao novoCand = new lCandidatoDao();
            
            lCandidato cand = novoCand.verificaCand(lnumeroVotado);
            
            if(cand != null){
                request.setAttribute("candidato", cand);
                RequestDispatcher rd = request.getRequestDispatcher("/confirmarvoto");
                rd.forward(request, response);
               
            }else{
                response.sendRedirect("votoerro");
            }
              
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}





