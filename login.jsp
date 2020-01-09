<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<link rel=stylesheet
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
	<script>
		function emailFunction() {
			var userValue = document.getElementById("emailId").value;
			var namePattern = "^[1-9]{1}[0-9]{3}$";
			document.getElementById("validemail").style.color = "red";

			if (!userValue.match(namePattern)) {

				document.getElementById("validemail").innerHTML = "enter correct user name";
				return false;
			} else
				document.getElementById("validemail").innerHTML = "";
			return true;
		}
		function passwordValidation() {
			var userValue = document.getElementById("passwordId").value;
			var namePattern = "^[A-Za-z0-9@!#$&*]{8,}$";
			document.getElementById("validPassword").style.color = "red";
			if (!userValue.match(namePattern)) {

				document.getElementById("validPassword").innerHTML = "enter correct password";
				return false;
			} else
				document.getElementById("validPassword").innerHTML = "";
			return true;
		}
		function submitButtonFunction() {
			var x = emailFunction();
			var y = passwordValidation();
			if (x && y) {
				return true;
			} else {
				return false;
			}
		}
	</script>
	<div class="row">
		<div class="col-lg-12"
			style="height: 100px; font-size: 68px; color: white; background-color: black;">
			<img style="float: right; height: 100px;" src="../image/del.jpg">
			Employee Designation
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12" style="height: 20px;">
			<p></p>
		</div>
	</div>
	<div class="container"
		style="height: 600px; background-color: #dedede; width: 60%;">
		<form action="/login" method="post"
			onsubmit="return submitButtonFunction()">
			<div class="row">
				<div class="col-lg-12" style="height: 200px;">
					<center>
						<img style="float: center; padding-top: 10px; height: 200px;"
							src="../image/add-user.png">
					</center>
				</div>
			</div>
			<div class="row">

				<div class="col-lg-6" style="padding-left: 180px">
					<center>
						<br>
						<h1>${err}</h1>
						<h4>User-Id:</h4>
						<center>
				</div>
				<div class="col-lg-6">
					<br> <input type="text" name="userId" id="emailId"
						placeholder="Enter Your User-Id" />
					<p id="validemail"></p>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6" style="padding-left: 180px">
					<center>
						<br>
						<h4>Password:</h4>
						<center>
				</div>
				<div class="col-lg-6">
					<br> <input type="password" name="password" id="passwordId"
						placeholder="Enter Your password" />
					<p id="validPassword"></p>

				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<center>
						<br>
						<button>login</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>