<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="br.eleicao.usuario.lUsuario"%>
<!DOCTYPE html>

<html lang="PT-BR">
    <head>
        
	<title>Sistema de Eleições Online</title>

<%@include file="../template/template_cabecalho.jsp" %>
           
<%@include file="../template/template_menu_fundo.html" %>

    <div class="addUsuario">
        <form class="form-horizontal" method="POST" action="../JSP/addUsuario">
            <h1> Cadastrar um novo Usuário </h1>
            <div class="form-group">    		
    		<label class="col-sm-2 control-label">Nome:</label>
                    <div class="col-sm-10">
    			<input type="text" class="form-control"  name= "Nome" placeholder="Nome" required="required">
  		</div>
            </div>
            
            <div class="form-group">
                <label class="col-sm-2 control-label">Email:</label>
                    <div class="col-sm-10">
    			<input type="email" class="form-control"  name= "Email" placeholder="Email" required="required">
  		</div>
            </div>
            
            <div class="form-group">            
            	<label class="col-sm-2 control-label">Senha:</label>
                    <div class="col-sm-10">
                	<input type="password" class="form-control" name="Senha" placeholder="Senha" placeholder="Senha" required="required">            
                    </div>
	</div>  
    
    	<div class="form-group">  
            <div class="col-sm-offset-2 col-sm-10">
            	<input type="submit" class="btn btn-default btn btn-primary" value="Criar">     
                    <a href="../JSP/index.jsp">
                        <button type="button" class="btn btn-default btn btn-primary" class="cancelar" >Cancelar</button>
                    </a>
            </div>
        </div>
    </form>
        
        
    <div class="msgErro" >
        
        <% String usuNulo = (String)request.getAttribute("usuarioNulo"); %>
        <% lUsuario usuExiste = (lUsuario)request.getAttribute("usuarioExiste"); %>
        <% if (usuExiste != null){ %>
                <%--Se o usuario existe,ele é diferente de nulo (óbvio) então vai entrar aki--%>
                <%-- <c:out value="${msg}"> </c:out> --%>
                
                <div class="alert alert-danger alert-dismissible" role="alert">        
                    <strong>Erro!</strong> Esse endereço de Email já está cadastrado.
                </div>
            <%}else if(usuNulo!=null){ %>
                <%--Se o usuario q antes era igual a nulo,e foi criado, então ele existe, entao vai entrar aki --%>
                <div class="alert alert-success" role="alert">        
                    <strong>Usuario criado com sucesso!</strong>
                </div>
            <%}%>

    </div>
     
    </div>
    
<%@include file="../template/template_footer.html" %>  

