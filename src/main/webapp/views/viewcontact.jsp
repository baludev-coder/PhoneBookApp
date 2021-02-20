<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>SL.NO</th>
				<th>CONTACT NAME</th>
				<th>CONTACTE EMAIL</th>
				<th>CONTACT NUMBER</th>
				<th>ACTION</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="contacts" var="c" varStatus="index">
				<tr>
					<td>${index.count+1}</td>
					<td>${c.contactName}</td>
					<td>${c.contactEmail}</td>
					<td>${c.contactNumber}</td>
					<td><a href="">EDIT</a></td>
					<td><a href="">DELETE</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>