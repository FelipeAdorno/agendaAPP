<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-BR">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Projeto Agenda - <decorator:title /></title>
    <link href="<c:url value='/resources/css/bootstrap.min.css'  />" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/bootstrap-theme.min.css'  />" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/footer.css'  />" rel="stylesheet"/>
    <script src="<c:url value='/resources/js/jquery.js' />"></script>
    <script src="<c:url value='/resources/js/jquery.mask.min.js' />"></script>
    <script src="<c:url value='/resources/js/angular.min.js' />"></script>
    <script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
    <script src="<c:url value='/resources/js/Main.js' />"></script>
    <script src="<c:url value='/resources/js/json2.js' />"></script>
    <decorator:head />
    <style>
    body {
		background-color: #eee;
	}
</style>
    
</head>
<body>
	<div class="navbar navbar-default navbar-static-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Squamata - Agenda</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="<c:url value='/'/>">Home</a></li>
					<li><a href="<c:url value='/sobre'/>">Sobre</a></li>
					<li><a href="<c:url value='/aderir'/>">Aderir</a></li>
					<li><a href="<c:url value='/contato'/>">Contato</a></li>
					<li><a href="<c:url value='/login/'/>">Login</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
    <div class="container">
   		<decorator:body />
    </div>
 	<!-- FOOTER -->
    <div class="fhp" id="fbar" style="text-align: center;">
		<div class="fbar">
			<span id="fsr">
				<span class="fbl">Squamata Software</span>
				<span class="fbl">Sobre</span>
				<span class="fbl">Termos e Privacidade</span>
				<span class="fbl">Ajuda</span>
				<span class="fbl" style="color:#b14436">Versão Beta</span> 
			</span>
		</div>
	</div>
</body>
</html>