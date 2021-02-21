<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
<link style="text/css"
	href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.min.css">
<script>
	$(document).ready(function() {
		$('#contacttbl').DataTable({
			dom : 'Bfrtip',
		});
	});
	 function Conform_Delete()
	    {
	       return conform("Are You Sure Want to Delete?");
	    }
</script>
<body>
	<h2>View all contacts Details</h2>
	<table  id="contacttbl" style="width:100%" class="display">
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

			<c:forEach items="${contacts}" var="c" varStatus="index">
				<tr>
					<td>${index.count}</td>
					<td>${c.contactName}</td>
					<td>${c.contactEmail}</td>
					<td>${c.contactNumber}</td>
					<td><a href="editcontact?cid=${c.contactId}">EDIT</a> <a
						href="deletecontact?cid=${c.contactId}" onclick="return Conform_Delete()"">DELETE</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="loadform">+Add contact</a>
</body>
</html>