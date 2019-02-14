<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registered</title>
</head>
<body>
	<h1>${heanMessage}</h1>

	<label>Student's Name:</label> ${student1.studentName}
	<br />
	<br />

	<label>Student's RollNumber:</label> ${student1.studentRollNumber}
	<br />
	<br />

	<label>Student's Mobile:</label> ${student1.studentMobile}
	<br />
	<br />

	<label>Student's DOB:</label> ${student1.studentDOB}
	<br />
	<br />

	<label>Student's skills set:</label> ${student1.studentSkills}
	<br />
	<br />


	<label>Address:</label> Village:${student1.address.village}

	DIST:${student1.address.dist} STATE:${student1.address.state}
	COUNTRY:${student1.address.country} PIN:${student1.address.pin}
	<br />




</body>
</html>