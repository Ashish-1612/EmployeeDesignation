<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel=stylesheet href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style>
div{
font-face:ariel;
}
.First{
font-size:68px;
}
h1{
   font-size:60px;
}
.mar{
    margin-left:80px;
	margin-top:10px;
	font-size:20px;
}
</style>
</head>
<body style="background-color:#dedede;">
<script src="../js/changeuserinfo.js">
</script>
<div class="row">
<div class="col-lg-12 First" style="border-color:black; border:solid; background-color:black;color:white; height:110px">
Employee Designation
<img src="../image/del.jpg" height="90px" style="float:right;">
</div> </div>
<div class="row">
<div class="col-lg-12 " style="height:20px">
<p></p>
</div> </div>
<div class="container" style="background-color:white; width:60%; height:600px;">
<center><h1>Delete User Details</h1>

<img src="../image/admin.png" height="200px"></center>

<form action="deleteuser" onsubmit="return changeUserInfoFunction()">
<div class="row">
<div class="col-lg-6" style="padding-left:180px"><center>
<br>
  <h4>  User-Id:</h4>
	<center>
</div>
<div class="col-lg-6" >
<br>
    <input type="text" name="userId" id="userId" placeholder="Enter Your User-Id" autofocus />
 <p id="validUserInfoChange"></p>
</div>   
</div>     
<div class="row">
<div class="col-lg-12"><center><br>
    <input type="submit" value="Delete User From DataBase"/>

</div>   
</div> 
</form>
</div>
</body>
</html>