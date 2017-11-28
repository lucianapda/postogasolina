<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">

		<!-- Website CSS style -->
		<link rel="stylesheet" type="text/css" href="assets/css/main.css">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>	
		
		
<title>GSM Cadastro de Produto</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/singin.css" type="text/css">

<script type="text/javascript">
    function exibirMensagem()
    {
        if(document.getElementById("nome").value == ""){
        alert("Produto cadastrado com Sucesso!");
        }
    }
    </script>


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
		<li class="nav-link"><a class="nav-link" href="index.jsp">Logoff<span class="sr-only">(current)</span>
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
							<label for="name" class="cols-sm-2 control-label">Nome do Produto</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-tags fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="name" id="name"  placeholder="Nome do produto" required autofocus/>
								</div>
							</div>
						</div>

						<div class="form-group ">
							<button type="submit"  class="btn btn-primary btn-lg btn-block login-button">Cadastrar</button>
	
							<script>
							if(document.getElementById("nome").value == ""){
                             alert("Produto cadastrado com Sucesso!");
                               }
							</script>
							
						</div>
					</form>
				</div>
			</div>
		</div>

		<script type="text/javascript" src="js/bootstrap.js"></script>


</body>
</html>