<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GSM Bem vindo</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/start.css" type="text/css">

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light"> <a
		class="navbar-brand" href="index.jsp">GSM!</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
		</ul>
		<ul1 class="navbar-nav my-sm-0">
		<li class="nav-link"><a class="nav-link" href="index.jsp">Logout<span class="sr-only">(current)</span>
		</a></li>


	</div>
	</nav>



	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="contract-wall">
					<img class="profile-img" src="images/user.png" alt="">
					<h1 class="text-center login-title">Gerencimento de usuarios</h1>
					<form class="form-signin" method="post" action="gerenciarUsuarios.jsp">
						<button class="btn btn-lg btn-primary btn-block" type="submit">
							Gerenciar</button>
					</form>
				</div>
			</div>
			<div class="col-sm-6 col-md-4 col-md-offset-4">	
				<div class="work-wall">
					<img class="profile-img" src="images/sale.png" alt="">
					<h1 class="text-center login-title">Gerencimanto de vendas</h1>
					<form class="form-signin">
						<button class="btn btn-lg btn-primary btn-block" type="submit">
							Gerenciar</button>
					</form>
				</div>
			</div>
						<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="work-wall">
					<img class="profile-img" src="images/stock.png" alt="">
					<h1 class="text-center login-title">Gerenciamento de estoque</h1>
					<form class="form-signin">
						<button class="btn btn-lg btn-primary btn-block" type="submit">
							Gerenciar</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>