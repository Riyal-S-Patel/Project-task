<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
.content {
	height: 500px;
}
.body-class{
	min-height:470px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark"> <span
		class="navbar-brand mb-0 h1"><h2 style="color: orange">X-workz</h2>
	</span></nav>
	<div class="body-class">
	<div class="row col-sm-12 justify-content-center">
		<h3> Id : ${id} From : ${from} , Message:  ${msg}</h3>
	</div>
	</div>
	<div>
		<footer id="sticky-footer" class="py-4 bg-dark text-white-50">
		<div class="container text-center">
			<small style="color: white">@ 2020 Copyright &copy;
				xworkz.com</small>
		</div>
		</footer>
	</div>

</body>
</html>
