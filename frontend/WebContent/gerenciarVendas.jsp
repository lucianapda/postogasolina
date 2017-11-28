<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">

<!-- Website CSS style -->
<link rel="stylesheet" type="text/css" href="css/main.css">

<!-- Website Font style -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=Passion+One'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Oxygen'
	rel='stylesheet' type='text/css'>

<title>GSM Usuarios</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/gerenciarUsuarios.css" type="text/css">

</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-light bg-light"> <a
		class="navbar-brand" href="home.jsp">GSM!</a>
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
		<li class="nav-link"><a class="nav-link" href="index.jsp">Logoff<span
				class="sr-only">(current)</span>
		</a></li>
		</ul1>
	</div>
	</nav>



	<div class="container">
		<div class="row main">
			<div class="panel-heading">
				<div class="panel-title text-center">
					<hr />

				</div>
			</div>
			<div class="main-login main-center">
				<form class="form-horizontal" method="post" action="home.jsp">

				

					<div class="form-group">
						<label for="password" class="cols-sm-2 control-label">Produto</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa 	 fa-lg" aria-hidden="true"></i></span> <select
									id=cdProduto>
									<option>Selecione o Produto </option>
									<option>Gasolina</option>
									<option>Alcool</option>
									<option>Diesel</option>
								</select>
					

							</div>
							<div class="form-group ">
					</div>
						</div>
					</div>

					<div class="form-group">
						<label for="confirm" class="cols-sm-2 control-label">Quantidade</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa  fa-lg" aria-hidden="true"></i></span> <input
									type="text" class="form-control" name="confirm"
									id="confirm" placeholder="Informe a quantidade" required autofocus/>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="confirm" class="cols-sm-2 control-label">Valor</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa fa-lg" aria-hidden="true"></i></span> <input
									type="text" class="form-control" name="confirm"
									id="confirm" placeholder="Informe o valor" required/>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<label for="confirm" class="cols-sm-2 control-label">Data</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa  fa-lg" aria-hidden="true"></i></span> <input
									type="date" class="form-control" name="confirm"
									id="confirm" placeholder="Informe o valor" required />
							</div>
						</div>
					</div>
			
					<div class="form-group ">
						<button type="submit"
							class="btn btn-primary btn-lg btn-block login-button">Cadastrar Compra</button>



					</div>



				</form>
			</div>

		</div>



		<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>