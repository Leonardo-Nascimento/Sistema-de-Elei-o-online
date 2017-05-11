<!DOCTYPE html>

<html lang="PT-BR">
    <head>
        
	<title>Sistema de Eleições Online</title>
     
	
	


<%@include file="../template/template_cabecalho.jsp" %>

<%@include file="../template/template_menu_fundo.html" %>

        <% String acessoErro = (String)request.getAttribute("msg"); %>
        
        <% if (acessoErro == "Você não tem acesso ao acompanhamento"){ %>
            <div class="acessoErro">
                <div class="alert alert-danger alert-dismissible" role="alert">        
                    <strong>É Necessário estar Logado para ver o Acompanhamento das Eleições!</strong>
                </div>
            </div>    
            <%}%> 
            
        <% if (acessoErro == "Você não tem acesso a add candidato"){ %>
            <div class="acessoErro">
                <div class="alert alert-danger alert-dismissible" role="alert">        
                    <strong>É Necessário estar Logado para Adicionar um novo Candidato! </strong>
                </div>
            </div>    
            <% } %>

<%@include file="../template/template_footer.html" %>

