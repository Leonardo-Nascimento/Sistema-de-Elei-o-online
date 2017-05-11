<!DOCTYPE html>

<html lang="PT-BR">
    <head>
        
	<title>Sistema de Eleições Online</title>
     
	
	


<%@include file="../template/template_cabecalho.jsp" %>

<%@include file="../template/template_menu_fundo.html" %>
    

    <div class="voto">
    <form class="form-horizontal" method="POST" action="../../registrarVoto">
  
        <div class="form-group">
    
            <div class="col-sm-10">
                <input type="number" class="form-control" name="numero" placeholder="Numero" required="required">
            </div>
        </div>
  
    
        <div class="col-sm-offset-2 col-sm-10">
            <input type="submit" class="btn btn-default btn btn-primary" value="Confirmar"> 
        
            <a href="../JSP/index.jsp">
                <button type="button" class="btn btn-default btn btn-primary" class="cancelar" >Cancelar</button>
            </a>
        </div>
    </form>
</div>


<%@include file="../template/template_footer.html" %>


