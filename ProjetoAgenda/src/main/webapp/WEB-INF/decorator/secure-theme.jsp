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
<nav class="navbar navbar-inverse navbar-default navbar-fixed-top" role="navigation">
  <div class="container">
  <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">Brand</a>
  </div>

  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
		<li class="active"><a href="#">Home</a></li>
		<li><a href="#about">Cadastro</a></li>
      <!--<li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
        <ul class="dropdown-menu">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="#about">Cadastro</a></li>
        </ul>
      </li> -->
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="<c:url value='/logout'/>">Sair</a></li>
    </ul>
  </div><!-- /.navbar-collapse -->
  </div>
</nav>

    <div class="container" style="padding-top: 3%">
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