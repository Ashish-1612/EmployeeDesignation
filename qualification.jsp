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
function dropDownValidation()
{
var elem=document.getElementsByClassName("Education");
var count=0;
for(var i=0;i<elem.length;i++)
{
	if(elem[i].selected)
		count++;
}
if(count==0)
{
document.getElementById("errorDropDown").innerHTML="select a Qualification";
	return false;
}
else{
	document.getElementById("errorDropDown").innerHTML="";
	return true;
}	
}
function perValidation()
{
var userValue=document.getElementById("per").value;
var perPattern="^[0-9]{2}$";
if(userValue==null||userValue==""){
document.getElementById("errorper").innerHTML="plz enter your percentage";
return false;
}
else if(!userValue.match(perPattern)){
	document.getElementById("errorper").innerHTML="plz enter in 00.00% format";
return false;
}
else{
	document.getElementById("errorper").innerHTML="";
return true;
}
}
function intValidation()
{
var userValue=document.getElementById("int").value;
var perPattern="^[0-9]{2}$";
if(userValue==null||userValue==""){
document.getElementById("errorint").innerHTML="plz enter interview score";
return false;
}
else if(!userValue.match(perPattern)){
	document.getElementById("errorint").innerHTML="plz enter correct interview score";
return false;
}
else{
	document.getElementById("errorint").innerHTML="";
return true;
}
}
function comValidation()
{
var userValue=document.getElementById("com").value;
var perPattern="^[0-9]{2}$";
if(userValue==null||userValue==""){
document.getElementById("errorcom").innerHTML="plz enter communication skills score";
return false;
}
else if(!userValue.match(perPattern)){
	document.getElementById("errorcom").innerHTML="plz enter correct communicetion skills score";
return false;
}
else{
	document.getElementById("errorcom").innerHTML="";
return true;
}
}
function techValidation()
{
var userValue=document.getElementById("tech").value;
var perPattern="^[0-9]{2}$";
if(userValue==null||userValue==""){
document.getElementById("errortech").innerHTML="plz enter technical skills score";
return false;
}
else if(!userValue.match(perPattern)){
	document.getElementById("errortech").innerHTML="plz enter correct technical skills score";
return false;
}
else{
	document.getElementById("errortech").innerHTML="";
return true;
}
}
function formValidation()
{
a=dropDownValidation();
b=perValidation();
c=intValidation();
d=comValidation();
e=techValidation();
if(a&&b&&c&&d&&e)
return true;
else
return false;
}


http://localhost:8082/quasubmit/1004/aashishbn@gmail.com/ashish/hggfy/hgy/?qualification=Bachelors&finalPercentage=80&interviewScore=45&communicationScore=45&technicalScore=45#220,%20Krishna%20nagar,near%20Paramhans%20Mandir,Chandpur/9812360981/M/kumar123
</script>
 
<div class="row" >
<div class="col-lg-12" style="background-color:black ;font-size:50px;color:white;"> Employee Designation
<img src="../image/del.jpg" align="right" height="100px" width="100px"></div>  
</div>   
<form class="form-horizontal"  action="/quasubmit/${user.getUserId()}/${user.getEmail()}/${user.getName()}/${user.getFatherName()}/${user.getMotherName()}/${user.getAddress()}/${user.getContactNo()}/${user.getGender()}/${user.getPassword()}"> 
<div class="row">
<div class="col-lg-12"><center>
<h3>QUALIFICATION INFORMATION</h3></center>
</div>
</div>
<div class="container">
<div class ="row">
<div class ="col-lg-6" style="padding-left: 180px; height:70px;">
<label>Education Details</label>
</div>
<div class ="col-lg-6">
<select name="qualification">
<option value ="opt">Choose Qualification</option>
<option class="Education" value="Bachelors">Bachelors</option>
<option class="Education" value="Masters">Masters</option>
</select></div>
<span id ="errorDropDown"></span>
</div>
<div class="row"> 
<div class="col-lg-6" style="padding-left: 180px; height:70px;"><label>Final Percentage</label>
</div>
<div class="col-lg-6">          
<input id="per" onchange="perValidation()" type="text" placeholder="Enter final Percentage" name="finalPercentage">
    </div>
<span id="errorper"></span>	
</div>
<div class="row"> 
<div class="col-lg-6" style= "padding-left: 180px; height:70px;"><label>Interview Score</label>
</div>
<div class="col-lg-6">          
<input id="int" onchange="intValidation()" type="text" placeholder="Enter interview score" name="interviewScore">
    </div>
<span id="errorint"></span>	
</div>
<div class="row"> 
<div class="col-lg-6" style="padding-left: 180px;height:70px;"><label>Communication Skills</label>
</div>
<div class="col-lg-6">          
<input id="com" onchange="comValidation()" type="text" placeholder="Enter communication skills score" name="communicationScore">
    </div>
<span id="errorcom"></span>	
</div>
<div class="row"> 
<div class="col-lg-6" style="height:70px; padding-left: 180px;"><label>Technical Skills</label>
</div>
<div class="col-lg-6">          
<input id="tech" onchange="techValidation()" type="text" placeholder="Enter technical skills score" name="technicalScore">
    </div>
<span id="errortech"></span>	
</div>
<div class="row"> 
<div class="col-lg-12" style="height:70px;"><center>
<input type="submit" value="submit"></center>
</div>
</div>
</form>
</div><p>${data}</p>
</body>
</html>