<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ENTER DETAILS OF BOOK</h1>
<form action="savebook" method="post">
Book id:<input type="number" name="bid"><br><br>
Bookname:<input type="text" name="bname"><br><br>
BookAuthor:<input type="text" name="bauthor"><br><br>
Bookpage:<input type="number" name="bpage"><br><br>
BookPrice:<input type="number" name="bprice"><br><br>
<input type="submit" value="save">



</form>
</body>
</html>