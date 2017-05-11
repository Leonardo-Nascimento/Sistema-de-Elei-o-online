<%-- 
    Document   : loginUsuSucesso
    Created on : 21/04/2017, 15:04:02
    Author     : Ariane
--%>

<%-- 
<%@page link rel="stylesheet" type="text/css" href="../template/css/style.css"%>
<%@page link rel="stylesheet" type="text/css" href="../template/css/media.css"%>
<%@page link rel="stylesheet" type="text/css" href="../template/bootstrap/css/bootstrap.min.css"%>
<%@page script src="../template/jQuery/jquery.min.js"></script>%> --%>

<%@page import="br.eleicao.usuario.lUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%lUsuario usu  = (lUsuario)session.getAttribute("sessao");
String nomeUsu = usu.getNome(); %>
<!DOCTYPE html>
<html>
    <head>       
        <title>Sistema de Eleição</title>
    </head>
    <body>

        <div class="ErroLoginSenha">
            <img src="../template/img/erroEmailSenha.jpg"  alt="imgErroLoginSenha" title="imgErroLoginSenha">
            
            <a href="/eleicao/SistemaDeEleicao/JSP/index.jsp">
                <button type="button" class="btn btn-warning" >Tentar de novo</button>
            </a>
        </div>
    </body>
</html>
