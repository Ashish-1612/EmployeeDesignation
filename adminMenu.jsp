<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrator Database Options</title>
<link rel=stylesheet
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style>
div {
	font-size: 68px;
	font-face: ariel;
}
</style>
</head>
<body>
	<div class="row">
		<div class="col-lg-12"
			style="border-color: black; border: solid; background-color: black; color: white; height: 110px">
			Employee Designation <img src="image/del.jpg" height="90px"
				style="float: right;">
		</div>
	</div>
	<div class="row">
		<div class="col-lg-4" style="height: 300px;">
			<center>
				<img src="../image/add-user.png" height="200px"> <a
					href="/personalDetails"><h2>Add New Fresher</h2></a>
			</center>
		</div>

		<div class="col-lg-4" style="height: 300px;">
			<center>
				<img src="../image/admin.png" height="200px"> <a
					href="/newadmin"><h2>Add a New Admin</h2></a>
			</center>
		</div>
		<div class="col-lg-4" style="height: 300px;">
			<center>
				<img src="../image/admin.png" height="200px"> <a
					href="/addnewtrainerform"><h2>Add New Trainer</h2></a>
			</center>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-6" style="height: 300px;">
			<center>
				<img src="../image/remove-user.png" height="200px"> <a
					href="/deleteuserdetail"><h2>Remove A User</h2></a>
			</center>
		</div>
		<div class="col-lg-6" style="height: 300px;">
			<center>
				<img src="../image/multy-user.png" height="200px">
				<a href="/displayallfresher"><h2>Designation Details Of All User</h2></a>
			</center>
		</div>
	</div>
</body>
</html>