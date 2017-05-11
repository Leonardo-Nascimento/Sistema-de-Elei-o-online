<%@page import="br.eleicao.candidato.lCandidato"%>





<%
 lCandidato candidato = (lCandidato)request.getAttribute("candidato");
 String nomeCandidato = null;
 int numeroVotado  = 0;

 if (candidato != null) {
     nomeCandidato = candidato.getLnome();
     numeroVotado =  candidato.getLnumero();
 } else {
     nomeCandidato = "Candidato nao encontrado!";
 }
%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmar voto</title>
        <style> 
            .confirmacao{color: red;}
            h1,h2,form{text-align: center;}
        </style>
    </head>
    <body>
        <h1>Confirme seu voto</h1>
        <h2>Você deseja Realmente votar em: <%= nomeCandidato %> </h2>
        
        <form method="post" action="confirmaVoto" >
            <input type="hidden" name="numero" value="<%= numeroVotado %>">
            <input type="hidden" name="nome" value="<%= nomeCandidato %>">
            
            <input type="submit" value='Confirmar' /><br><br>            
        
            
            
        </form>
        
            <form action="/eleicao/SistemaDeEleicao/JSP/votacao.jsp">
            <input type="submit" value='Voltar' /><br><br>
        </form>
        
       
        
    </body>
</html>
