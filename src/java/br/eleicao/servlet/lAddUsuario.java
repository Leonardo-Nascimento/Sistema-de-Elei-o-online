/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eleicao.servlet;

import br.eleicao.dao.lUsuarioDao;
import br.eleicao.usuario.lUsuario;
import static com.sun.faces.el.FacesCompositeELResolver.ELResolverChainType.JSP;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ariane
 */
public class lAddUsuario extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.sendRedirect("/eleicao/SistemaDeEleicao/template/erro.html");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            try{
            String nome = request.getParameter("Nome");
            String email = request.getParameter("Email");
            String senha = request.getParameter("Senha");
           
            lUsuarioDao usuDao = new lUsuarioDao();
            lUsuario usu = usuDao.verificaUsuario(email);
            if(usu == null){
                //se o usuario for null, é por q nao existe e pode ser criado
                usuDao.inserirUsuario(nome,email, senha);
                request.setAttribute("usuarioNulo","usuario era nulo más passou a existir");
                
                RequestDispatcher rd = request.getRequestDispatcher("/adicionausuario");
                rd.forward(request, response);
            } else{
                //aki ele vai ser != null, entao é por q ja existe esse email
                request.setAttribute("usuarioExiste",usu);
                request.setAttribute("msg","deixa de ser burro cara, esse Email já existe!");  
                RequestDispatcher rd = request.getRequestDispatcher("/adicionausuario");
                rd.forward(request, response);
                
               // response.sendRedirect("/eleicao/SistemaDeEleicao/JSP/addUsuario.jsp");
                
            }
        }   catch (SQLException ex) {
                Logger.getLogger(lAddUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
