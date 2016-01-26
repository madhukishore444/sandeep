+<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user details home page</title>
</head>
<body>
<a href="adduser.jsp">Add User</a>


<table >
<tr>
<td>uid</td>
<td>uname</td>
<td>fname</td>
<td>lname</td>
<td>city</td>
<td>state</td>
<td>country</td>
<td>edit</td>
<td>delete</td>
</tr>
</table>
</body>

<body>
<input type="submit" value="save"/>

<table>
<tr><%=request.getAttribute("key1") %> </tr>
<tr><%=request.getAttribute("key2") %> </tr>
<tr><%=request.getAttribute("key3") %> </tr>
<tr><%=request.getAttribute("key4") %> </tr>
<tr><%=request.getAttribute("key5") %> </tr>
<tr><%=request.getAttribute("key6") %> </tr>
<tr><%=request.getAttribute("key7") %> </tr>
</table>

</body>

</html>