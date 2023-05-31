<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.js.dto.Book"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>UPDATE TOUR DATA</h1>
<% Book b =(Book)request.getAttribute("book"); %>
<form action="edit" method="get">
Book id:<input type="number" name="bid" value="<%=b.getId()%>" readonly="readonly"><br><br>
Book name : <input type="text" name="bname" value="<%=b.getBook_name()%>"><br><br>
Book Author:<input type="text" name="bauthor"value="<%=b.getAuthor_name()%>"><br><br>
Book page:<input type="number" name="bpage" value="<%=b.getNo_of_pages()%>"><br><br>
Book Price:<input type="number" name="bprice" value="<%=b.getPrice()%>" ><br><br>
<input type="submit" value="update">
</form>
</body>
</html>
