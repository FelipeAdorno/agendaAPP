<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta name="decorator" content="admin" />
<title>Home</title>

<script src="<c:url value='/resources/js/Controller/UsuarioController.js' />"></script>

</head>
<body>
	<br />
	<div class="row-fluid" ng-controller="UsuarioController">
		<ul class="breadcrumb">
			<li class="active"><span class="glyphicon glyphicon-file">&nbsp;</span>Novo</li>
			<li><span class="glyphicon glyphicon-list-alt">&nbsp;</span><a href="<c:url value='/usuario/listar'/>">Listar</a></li>
		</ul>
		
		<div class="col-xs-12 col-md-12">
			<legend>Novo usuário</legend>
		</div>
		
		<div class="col-xs-10 col-md-10">
		
			<div class="row form">
	        	<div class="alert alert-dismissable nao-visivel">
	        		 <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        		 <div class = "mensagens"></div>
	        	</div>
		    </div>  
		
			<form method="post" class="form-group" ng-submit="cadastrar();">
				
				<div class="col-xs-6 col-md-6">
					<input type="checkbox" ng-model="usuario.administrador" />&nbsp;<label>Administrador</label><br />
					<input type="checkbox" ng-model="usuario.habilitado" /><label>Habilitado</label><br />
				</div>
				<div class="col-xs-6 col-md-6">
					<br />
				</div>
				<div class="row">
					<div class="col-xs-12 col-md-12">
						<input type="text" class="form-control" placeholder="Empresa" disabled value="${usuarioLogado.empresa.nomeFantasia}"  />
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6 col-md-6">
						<input type="text" ng-model="usuario.nome" class="form-control" placeholder="Nome completo" required autofocus />
					</div>
					<div class="col-xs-6 col-md-6">
						<input type="text" ng-model="usuario.nomeUsuario" class="form-control" placeholder="Email" required  />
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6 col-md-6">
						<input type="password"ng-model="usuario.senha" class="form-control" placeholder="Senha" required  />
					</div>
					<div class="col-xs-6 col-md-6">
						<input type="password" class="form-control" placeholder="Confirmar Senha" required  />
					</div>
            	</div>
            	<div class="text-center">
           			<button class="btn btn-primary" type="submit">Cadastrar</button>
          			<button class="btn btn-primary">Cancelar</button>
    			</div>			
            </form>
            <br />
		</div>
	</div>
</body>
</html>
