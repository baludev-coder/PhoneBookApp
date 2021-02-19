<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Contact Saved</h2>
	<p>
		<font color="green">${SuccMsg}</font>
	</p>
	<p>
		<font color="red">${errMsg}</font>
	</p>

	<form:form action="saveContact" modelAttribute="contact" method="POST">
		<table>
			<tr>
				<td>ContactName:</td>
				<td><form:input path="contactName" /></td>
			</tr>
			<tr>
				<td>ContactEmail:</td>
				<td><form:input path="contactEmail" /></td>
			</tr>
			<tr>
				<td>ContactNumber:</td>
				<td><form:input path="contactNumber" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset" /></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>