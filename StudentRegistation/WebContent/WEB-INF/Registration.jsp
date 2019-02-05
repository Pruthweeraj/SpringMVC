<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BCCST</title>
</head>
<body>
<h1>Student Registration</h1>

<form action="/FirstSpringMvcProject/submitRegistationForm" method="post">
<label>Student Name:</label>
<input type="text" name="studentName" /><br/><br/>
<label>Student RollNumber:</label>
<input type="text" name="studentRollNumber" /><br/><br/>
<input type="submit" value="Register" />
</form>

</body>
</html>