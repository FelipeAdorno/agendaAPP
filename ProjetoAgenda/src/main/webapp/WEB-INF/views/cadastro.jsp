<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta name="decorator" content="login-theme" />
<title>Home</title>
<style>
body {
	padding-top: 8%;
	padding-bottom: 40px;
	background-color: #eee;
}

.form {
	max-width: 500px;
	margin: 0 auto;
}
.form-control { 
	margin-bottom: 10px; 
}
</style>
</head>
<body>
<div class="row" ng-controller="LoginController">
        
        <div class="col-xs-12 col-sm-12">
        
        	<div class="row form">
	        	<div class="alert alert-dismissable nao-visivel">
	        		 <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        		 <div class = "mensagens"></div>
	        	</div>
		    </div>    
        
            <form method="post" class="form" role="form" id="cadastroForm" ng-submit="cadastrar();">
            <h2 class="form-signin-heading">Cadastrar-se</h2>
            <input ng-model="usuario.empresa.razaoSocial" class="form-control" placeholder="Razão Social" type="text" required autofocus />
            <input ng-model="usuario.empresa.nomeFantasia" class="form-control" placeholder="Nome Fantasia" type="text"  required />
            <input ng-model="usuario.nome" class="form-control" placeholder="Responsável" type="text"  required />
            <div class="row">
                <div class="col-xs-6 col-md-6">
                    <input ng-model="usuario.empresa.cnpj" class="form-control cnpj" placeholder="CNPJ" type="text" required  />
                </div>
                <div class="col-xs-6 col-md-6">
                    <input ng-model="usuario.empresa.telefone" class="form-control tel" placeholder="Telefone" type="text" required  />
                </div>
            </div>
            <input ng-model="usuario.nomeUsuario" class="form-control" placeholder="Email" type="email" required />
            <div class="row">
                <div class="col-xs-6 col-md-6">
                    <input ng-model="usuario.senha" class="form-control" placeholder="Senha" type="password" required />
                </div>
                <div class="col-xs-6 col-md-6">
                    <input class="form-control" placeholder="Confirmar Senha" type="password" />
                </div>
            </div>
            <br />
            <br />
            <button class="btn btn-lg btn-primary btn-block" type="submit">Cadastrar</button>
            <br />
            <div class="text-center">
            <span>Voltar para a página de <a href="<c:url value='/login/'  />">login.</a></span>
            </div>
            </form>
        </div>
    </div>

</body>
</html>
