<%-- 
    Document   : acompanhamento
    Created on : 23/04/2017, 03:34:26
    Author     : Ariane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="br.eleicao.candidato.lCandidato"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../template/css/style.css">
        <link rel="stylesheet" type="text/css" href="../template/css/media.css">
        <link rel="stylesheet" type="text/css" href="../template/bootstrap/css/bootstrap.min.css">
        <script src="../template/jQuery/jquery.min.js"></script>
         <title>Sistema de Eleicão</title>
    </head>
    <body>
        <h1> pagina de acompanhamento</h1>
        <%  lCandidato cand = new lCandidato();
            List <lCandidato> listaResultado = (List<lCandidato>)request.getAttribute("lista");
            
        %>
        
        <table class="table table-bordered acompanhamento">
            
            <tr>
                <th>Número</th>
                <th>Nome</th>
                <th>Votos</th>
            </tr>
            
            
            
        <% for(lCandidato c : listaResultado){%>
            
            <tr>
                <th> <%= c.getLnumero()%></th>
                <th> <%= c.getLnome() %></th>                
                <th> <%= c.getlqndVoto()%> </th>
            </tr>      
            
            <%  //out.println("Numero: "+c.getLnumero()+ " Nome: "+c.getLnome()+ " Quantidade de votos: "+c.getlqndVoto());
                }
            %>


        </table>
    
                <a href="index.jsp">Home</a>
    
    </body>
</html>
