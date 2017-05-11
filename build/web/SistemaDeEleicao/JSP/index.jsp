<!DOCTYPE html>

<html lang="PT-BR">
    <head>
        
	<title>Sistema de Elei��es Online</title>
     
	
	


<%@include file="../template/template_cabecalho.jsp" %>

<%@include file="../template/template_menu_fundo.html" %>

        <% String acessoErro = (String)request.getAttribute("msg"); %>
        
        <% if (acessoErro == "Voc� n�o tem acesso ao acompanhamento"){ %>
            <div class="acessoErro">
                <div class="alert alert-danger alert-dismissible" role="alert">        
                    <strong>� Necess�rio estar Logado para ver o Acompanhamento das Elei��es!</strong>
                </div>
            </div>    
            <%}%> 
            
        <% if (acessoErro == "Voc� n�o tem acesso a add candidato"){ %>
            <div class="acessoErro">
                <div class="alert alert-danger alert-dismissible" role="alert">        
                    <strong>� Necess�rio estar Logado para Adicionar um novo Candidato! </strong>
                </div>
            </div>    
            <% } %>

<%@include file="../template/template_footer.html" %>

