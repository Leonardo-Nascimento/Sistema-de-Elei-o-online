
        
	<%@page import="br.eleicao.servlet.lLogin"%>
<%@page import="javax.jms.*"%>
<%@page import="br.eleicao.usuario.lUsuario"%>
<title>Sistema de Eleição Online</title>

        <link rel="stylesheet" type="text/css" href="../template/css/style.css">
		<link rel="stylesheet" type="text/css" href="../template/css/media.css">
		<link rel="stylesheet" type="text/css" href="../template/bootstrap/css/bootstrap.min.css">
		<script src="../template/jQuery/jquery.min.js"></script>
        <meta charset="ISO-8859-1">
        </head>
<body>

	<section class="top">
		<div class="container">
			<header class="header-top">
				<img src="../template/img/pessoa-voto.jpg" class="img-header" alt="Logo EleiÃ§Ã£o" title="Logo EleiÃ§Ã£o">
				<h1 class="titulo-header">Sistema de Votos</h1>
			</header>
              	<%-- Assimq entrar na index esse if irá verificar se existe um usuario logado
              	e exibira no top se tiver ou nao, isso se extenderá por todas as paginas q importarem esse template--%>          
            	<% lUsuario usuario = (lUsuario)session.getAttribute("sessao");
                	String usuarioLogado = "Usuário não Logado"; 
                                                
                    	if (usuario != null){                                
                        	usuarioLogado  = "Usuário "+usuario.getNome()+" Logado";
                       
                            }%>
                        
                        <div class="usuarioLogin">
                            <p><%out.println(usuarioLogado);%> </p>
                        </div>
                        
                        <main>       
                            

				           <div>
                            		<%if(usuario == null){ %>
								<form class="form-inline formulario" method="POST" action="../../login">
				                	<div class="form-group">
										<div class="col-sm-10">
									    	<input type="text" 	class="form-control" id="login" name="email" placeholder="Email">
									    </div>
									</div>
									  <div class="form-group">
									    <div class="col-sm-10">
									      <input type="password" class="form-control" id="senha" name="senha" placeholder="Senha">
									    </div>
									  </div>
									  	<div class="form-group">
									    	<div class="col-sm-10">
									      		<input type="submit" class="btn btn-default btnEntrar" value="Entrar">
									      	</div>									    	
									  </div>                                                                        
								</form>
								 
                                                                <% }else if( usuario != null){%>     
									<form class="form-inline btnSair" method="POST" action="../../logout">                                        
									<div class="form-group sair">
										<div class="col-sm-10">
										<input type="submit" class="btn btn-default " name="sair" value="Sair">
                        				</div>
									</div>
									</form>
                                                                <% } %>
							</div>  
						</main>
				</div>
	</section>
			

