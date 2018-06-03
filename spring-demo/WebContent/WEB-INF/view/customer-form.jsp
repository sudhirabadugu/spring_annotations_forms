<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form </title>
	<style>
	 .error{color:red} 
	</style>
</head>
<body>
 <form action="processForm" modelAttribute="customer">
	<br>
	First Name: <input path="firstname" />
 	<br>
 	Last Name :<input path="lastname" />
 	<errors path=" lastname" cssClass="error"/>
 	<br>
 	<input type="submit" value="submit"/>
 </form>
 

</body>
</html>