<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All User Job Designations</title>
<link rel=stylesheet href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style>
div{
font-size:68px;
font-face:ariel;
}
th{
text-align:center;
}
td{
     padding-left:30px;
}
h1{
   font-size:60px;
}
</style>
</head>
<body>
<div class="row">
<div class="col-lg-12" style="border-color:black; border:solid; background-color:black;color:white; height:110px">
Employee Designation
<img src="../image/del.jpg" height="90px" style="float:right;">
</div> </div>
<center><h1>All User Job Descriptions</h1></center>
<table width="100%" border="1">
<tr>
<th>User Id</th>
<th>Name</th>
<th>Designation</th>
<th>Package</th>
</tr>
<c:forEach items="${freshers}" var="fresher">
<tr>
<td>${fresher.getUserId()}</td>
<td>${fresher.getName()}</td>
<td>${fresher.getDesignation()}</td>
<td>${fresher.getSalaryPackage()}</td>
</tr>
</c:forEach>
</table>
</body>
</html>