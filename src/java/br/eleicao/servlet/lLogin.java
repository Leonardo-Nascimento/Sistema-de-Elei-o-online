
package br.eleicao.servlet;

import br.eleicao.dao.lUsuarioDao;
import br.eleicao.usuario.lUsuario;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class lLogin extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("/eleicao/SistemaDeEleicao/template/erroLogin.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    try{
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
        lUsuario usu = new lUsuario(email, senha);
        lUsuarioDao usuDao = new lUsuarioDao();
        
        lUsuario usuExistente = usuDao.altenticaUsuario(usu);
        
        if(usuExistente != null){
            //request.setAttribute("usuarioExistente",usuExistente);
            
            HttpSession sessao = request.getSession();
            sessao.setAttribute("sessao",usuExistente);
           
            response.sendRedirect("/eleicao/SistemaDeEleicao/JSP/index.jsp");  
            //RequestDispatcher rd = request.getRequestDispatcher("/SistemaDeEleicao/JSP/index.jsp");
            //rd.forward(request, response);
                        
           // RequestDispatcher rd = request.getRequestDispatcher("/loginsucesso");
           // rd.forward(request, response);
            
        } else{
            request.setAttribute("usuarioInexistente","usuario não encontrado");
            request.setAttribute("msg","deixa de ser burro cara, ESSE USUARIO NÃO EXISTE!");
          //  RequestDispatcher rd = request.getRequestDispatcher("/adicionausuario");
          //  rd.forward(request, response);
            response.sendRedirect("/eleicao/SistemaDeEleicao/template/erroLogin.html");  
            // response.sendRedirect("/eleicao/SistemaDeEleicao/JSP/addUsuario.jsp");
            
        }
    }catch(Exception e ){
        Logger.getLogger(lAddUsuario.class.getName()).log(Level.SEVERE, null, e);
    }
}
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
