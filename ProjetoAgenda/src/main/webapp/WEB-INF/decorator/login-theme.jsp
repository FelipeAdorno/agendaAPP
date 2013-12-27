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
    <script src="<c:url value='/resources/js/angular.min.js' />"></script>
    <script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
    <decorator:head />
</head>
<body>
    <div class="container">
   		<decorator:body />
    </div>
    <!-- FOOTER -->
    <div class="fhp" id="fbar">
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