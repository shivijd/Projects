<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>deposit Money</title>
<style>
.error
{
color:blue;
font-weight:bold;
}
</style>
</head>
<body>
<a href="" >Home</a>
<form action="depositmoney" method="get">
<tr>
<td>Mobile Number : </td>
<td><input type="number" name="mobileNo" size="30"/></td>
</tr>
<tr>
<td> Enter Amount to Deposit : </td>
<td><input type="number" name="balance" size="30"/></td>
</tr>
<tr>
<td><input type="submit" value="submit"/>
</td></tr>
</form>
</body>
</html>