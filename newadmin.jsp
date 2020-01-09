<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>
<script>
function mailValidation()
{
var x=document.getElementById("eid").value;
var pattern="^[0-9]+$";
if(x==null||x==""){
	document.getElementById("errormail").style.color="red";
document.getElementById("errormail").innerHTML="plz enter email";
return false;
}
else if(!x.match(pattern)){
document.getElementById("errormail").innerHTML="write in correct format";
return false;
}
else{
document.getElementById("errormail").innerHTML="";
return true;
}
}
function userValidation()
{
	var userValue=document.getElementById("txtname").value;
	var namePattern="^[A-Za-z]+$";
	if(userValue==null||userValue==""){
		document.getElementById("errorname").style.color="red";
document.getElementById("errorname").innerHTML="plz enter name";
return false;
}
	else if(!userValue.match(namePattern)){
		document.getElementById("errorname").innerHTML="name should be alphabets";
return false;
}
	else{
		document.getElementById("errorname").innerHTML="";
return true;
}
}
function pwdValidation()
{
	var Value=document.getElementById("pid").value;
	var pwdPattern="^[A-Za-z0-9@!#$&*]{8,}$";
	if(Value==null||Value==""){
		document.getElementById("errorpwd").style.color="red";
document.getElementById("errorpwd").innerHTML="plz enter password";
return false;
}
	else if(!Value.match(pwdPattern)){
		document.getElementById("errorpwd").innerHTML="password should contain atleast 8 characters"
return false;
}
	else{
document.getElementById("errorpwd").innerHTML="";
return true;
}
}
function confirmpwdValidation()
{
	var password=document.getElementById("pid").value;
	var confirmpwd=document.getElementById("pid1").value;
	if(confirmpwd==null||confirmpwd==""){
		document.getElementById("errorpwd1").style.color="red";
document.getElementById("errorpwd1").innerHTML="plz enter password";
return false;
}
	else if(!password.match(confirmpwd)){
	document.getElementById("errorpwd1").innerHTML="plz match the password";
return false;
}
else{
	document.getElementById("errorpwd1").innerHTML="";
return true;
}
}
function formValidation()
{
a=mailValidation();
b=userValidation();
c=pwdValidation();
d=confirmpwdValidation();
if(a&&b&&c&&d)
return true;
else
return false;
}
</script>
 
<div class="row" >
<div class="col-lg-12" style="background-color:black ;font-size:50px;color:white;"> Employee Designation
<img src="../image/del.jpg" align="right" height="100px" width="100px"></div>  
</div>  
<div class="container"> 
<form action="/addadmin" method="post" class="form-horizontal" onsubmit="return formValidation()"> 
<div class="row">
<div class="col-lg-12">
<center><h1>NEW ADMIN</h1></center>
</div>
</div>
<div class="row"> 
<div class="col-lg-6" style="height:70px; padding-left:230px;"><label>Admin Id</label></div>
<div class="col-lg-6">          
<input type="text" name="userId" onchange="mailValidation()" id="eid" placeholder="Enter admin Id">
</div>
<span id="errormail"></span>	 
</div>
<div class="row"> 
<div class="col-lg-6" style="height:70px; padding-left:230px;"><label>Name</label>
</div>
<div class="col-lg-6">          
<input id="txtname" name="name" onchange="userValidation()" type="text" placeholder="Enter name">
    </div>
<span id="errorname"></span>	
</div>
<div class="row"> 
<div class="col-lg-6" style="height:70px; padding-left:230px;" ><label>password</label></div>
<div class="col-lg-6">          
<input type="password" name="password" onchange="pwdValidation()" id="pid" placeholder="Enter Password">
</div>
<span id="errorpwd"></span>	 
</div>
<div class="row"> 
<div class="col-lg-6" style="height:70px; padding-left:230px;"><label>confirm password</label></div>
<div class="col-lg-6">          
<input type="password" id="pid1" onchange="confirmpwdValidation()">
</div>
<span id="errorpwd1"></span>	 
</div>
<div class="row">
<div class="col-lg-12"><center>
<input type="submit" value="create"></center></div>
</div>
</form>
</div>
</body>
</html>