/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eleicao.servlet;

import br.eleicao.candidato.lCandidato;
import br.eleicao.dao.lApuracaoVotosDAO;
import br.eleicao.usuario.lUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ariane
 */
public class lControleAcessoAcompanhar extends HttpServlet {

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
       
        HttpSession sessaoExistente = request.getSession();
        lUsuario acesso = (lUsuario)sessaoExistente.getAttribute("sessao");
        
         if (acesso != null){
            lApuracaoVotosDAO apuracao = new lApuracaoVotosDAO();
            List <lCandidato> retorno = apuracao.apuracaoVotos();
        
                request.setAttribute("lista",retorno);
                request.getRequestDispatcher("/acompanhamentoVotos").forward(request, response);
                //System.out.println("Numero: "+c.getLnumero()+ " Nome: "+c.getLnome()+ " Quantidade de votos: "+c.getlqndVoto());
                    
            }else{
                request.setAttribute("msg","Você não tem acesso ao acompanhamento");
                request.getRequestDispatcher("/home").forward(request, response);
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
        processRequest(request, response);
        
        
        
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
