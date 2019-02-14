<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BCCST</title>
</head>
<body>
	<h1>${headMessage}</h1>

<form:errors path="student1.*" />

	<form action="/Student_reg_demo5_ExceptionHandling/submitRegistationForm" method="post">
		<label><spring:message code="label.studentName" /></label> <input type="text" name="studentName" /><br />
		<br /> <label>Student's RollNumber:</label> <input type="text"
			name="studentRollNumber" /><br />
		<br /> <label>Student's Mobile:</label> <input type="text"
			name="studentMobile" /><br />
		<br /> <label>Student's DOB:</label> <input type="text"
			name="studentDOB" /><br />
		<br /> <label>Student's skills set:</label><br />
		<br /> <select name="studentSkills" multiple>
			<option value="c">C</option>
			<option value="javaCore">Java Core</option>
			<option value="springCore">Spring Core</option>
			<option value="springMVC">Spring MVC</option>
		</select><br />
		<br /> <label>Address:</label> Village:<input type="text"
			name="Address.village"> Dist:<input type="text"
			name="Address.dist"> State:<input type="text"
			name="Address.state"> Country:<input type="text"
			name="Address.country"> Pin:<input type="text"	
			name="Address.pin"> <input type="submit" value="Register" />
	</form>
</body>
</html>
