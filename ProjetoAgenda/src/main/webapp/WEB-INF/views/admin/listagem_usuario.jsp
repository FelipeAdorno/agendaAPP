<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="decorator" content="admin" /> 
	<title>Home</title>
</head>
<body>
<br />
<div class="row">
	<ul class="breadcrumb">
		<li><a href="<c:url value='/usuario/novo'/>"Novo</a></li>
		<li class="active">Listar</li>
	</ul>
</div>
</body>
</html>
