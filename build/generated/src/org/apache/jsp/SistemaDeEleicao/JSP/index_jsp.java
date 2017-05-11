package org.apache.jsp.SistemaDeEleicao.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.eleicao.servlet.lLogin;
import javax.jms.*;
import br.eleicao.usuario.lUsuario;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/SistemaDeEleicao/JSP/../template/template_cabecalho.jsp");
    _jspx_dependants.add("/SistemaDeEleicao/JSP/../template/template_menu_fundo.html");
    _jspx_dependants.add("/SistemaDeEleicao/JSP/../template/template_footer.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"PT-BR\">\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("\t<title>Sistema de Eleições Online</title>\n");
      out.write("     \n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Sistema de Eleição Online</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../template/css/style.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../template/css/media.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../template/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script src=\"../template/jQuery/jquery.min.js\"></script>\r\n");
      out.write("        <meta charset=\"ISO-8859-1\">\r\n");
      out.write("        </head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<section class=\"top\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<header class=\"header-top\">\r\n");
      out.write("\t\t\t\t<img src=\"../template/img/pessoa-voto.jpg\" class=\"img-header\" alt=\"Logo EleiÃ§Ã£o\" title=\"Logo EleiÃ§Ã£o\">\r\n");
      out.write("\t\t\t\t<h1 class=\"titulo-header\">Sistema de Votos</h1>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("              \t");
      out.write("          \r\n");
      out.write("            \t");
 lUsuario usuario = (lUsuario)session.getAttribute("sessao");
                	String usuarioLogado = "Usuário não Logado"; 
                                                
                    	if (usuario != null){                                
                        	usuarioLogado  = "Usuário "+usuario.getNome()+" Logado";
                       
                            }
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"usuarioLogin\">\r\n");
      out.write("                            <p>");
out.println(usuarioLogado);
      out.write(" </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <main>       \r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t           <div>\r\n");
      out.write("                            \t\t");
if(usuario == null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-inline formulario\" method=\"POST\" action=\"../../login\">\r\n");
      out.write("\t\t\t\t                \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    \t<input type=\"text\" \tclass=\"form-control\" id=\"login\" name=\"email\" placeholder=\"Email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      <input type=\"password\" class=\"form-control\" id=\"senha\" name=\"senha\" placeholder=\"Senha\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    \t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      \t\t<input type=\"submit\" class=\"btn btn-default btnEntrar\" value=\"Entrar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      \t</div>\t\t\t\t\t\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>                                                                        \r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t \r\n");
      out.write("                                                                ");
 }else if( usuario != null){
      out.write("     \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form class=\"form-inline btnSair\" method=\"POST\" action=\"../../logout\">                                        \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group sair\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-default \" name=\"sair\" value=\"Sair\">\r\n");
      out.write("                        \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("                                                                ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>  \r\n");
      out.write("\t\t\t\t\t\t</main>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write('\n');
      out.write('\n');
      out.write("<div class=\"img-body\"></div>\n");
      out.write("\t\n");
      out.write("<nav class=\"navbar navbar-default nav-menu\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav nav-menu-ul\">\n");
      out.write("\t    <li class=\"item-menu\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li class=\"item-menu\"><a href=\"../JSP/votacao.jsp\">Votar</a></li>\n");
      out.write("        <li class=\"item-menu\"><a href=\"../JSP/controleacessoAcompanhar\" >Acompanhar</a></li>\n");
      out.write("        <li class=\"item-menu\"><a href=\"../JSP/addUsuario.jsp\">Criar Login</a></li>\n");
      out.write("        <li class=\"item-menu\"><a href=\"../JSP/controleacessoAddCand\">Adicionar Candidato</a></li>            \n");
      out.write("      </ul>\n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("  </div><!-- /.container-fluid -->\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("        ");
 String acessoErro = (String)request.getAttribute("msg"); 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 if (acessoErro == "Você não tem acesso ao acompanhamento"){ 
      out.write("\n");
      out.write("            <div class=\"acessoErro\">\n");
      out.write("                <div class=\"alert alert-danger alert-dismissible\" role=\"alert\">        \n");
      out.write("                    <strong>É Necessário estar Logado para ver o Acompanhamento das Eleições!</strong>\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("            ");
}
      out.write(" \n");
      out.write("            \n");
      out.write("        ");
 if (acessoErro == "Você não tem acesso a add candidato"){ 
      out.write("\n");
      out.write("            <div class=\"acessoErro\">\n");
      out.write("                <div class=\"alert alert-danger alert-dismissible\" role=\"alert\">        \n");
      out.write("                    <strong>É Necessário estar Logado para Adicionar um novo Candidato! </strong>\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("            ");
 } 
      out.write('\n');
      out.write('\n');
      out.write("\t<footer class=\"footer\">\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tCopyrigth &copy; <strong>Leo BMX</strong> - Todos os direitos reservados\n");
      out.write("\t\t</p>\t\t\n");
      out.write("\t</footer>\n");
      out.write("\t<script src=\"../template/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
