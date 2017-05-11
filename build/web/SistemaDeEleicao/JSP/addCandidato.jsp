<!DOCTYPE html>

<html lang="PT-BR">
    <head>
        
	<title>Sistema de Eleições Online</title>
     
	
	


<%@include file="../template/template_cabecalho.jsp" %>

<%@include file="../template/template_menu_fundo.html" %>

    <div class="addcand">
        
        <fieldset class="fieldset">
    <legend>Cadastrar candidato</legend>
    <form class="formulario-fieldset" method="POST" action="../../addcandidato">
        <div class="form-group">
            <div class="col-sm-10">
                <input type="text" 	class="form-control" name="nome" placeholder="Nome" required="required">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-10">
                <input type="number" class="form-control" name="numero" placeholder="Numero" required="required">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-10">
                <button type="submit" class="btn btn-default btn btn-primary">Cadastrar</button>
            </div>
        </div>
    </form>
</fieldset>
        
    </div>

<%@include file="../template/template_footer.html" %>  

