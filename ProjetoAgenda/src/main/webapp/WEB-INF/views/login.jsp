<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta name="decorator" content="login-theme" />
<title>Home</title>
<style>
body {
	padding-top: 15%;
	padding-bottom: 40px;
	background-color: #eee;
}

.form-signin {
	max-width: 330px;
	padding: 15px;
	margin: 0 auto;
}

.form-signin .form-signin-heading,.form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin .checkbox {
	font-weight: normal;
}

.form-signin .form-control {
	position: relative;
	font-size: 16px;
	height: auto;
	padding: 10px;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

.form-signin .form-control:focus {
	z-index: 2;
}

.form-signin input[type="text"] {
	margin-bottom: -1px;
	border-bottom-left-radius: 0;
	border-bottom-right-radius: 0;
}

.form-signin input[type="password"] {
	margin-bottom: 10px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}
</style>
</head>
<body>
	<form class="form-signin" role="form">
		<h2 class="form-signin-heading">Efetuar Login</h2>
		<input type="text" class="form-control" placeholder="Nome de usuário"
			required="" autofocus=""> <input type="password"
			class="form-control" placeholder="Senha" required=""> <label
			class="checkbox"> <input type="checkbox" value="remember-me">
			Continuar Logado
		</label>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
	</form>
</body>
</html>
