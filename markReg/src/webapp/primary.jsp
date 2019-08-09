<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

<h1>Add marks of the primary standard student: </h1>
<form action="mark">
Student id: <input type="text" name="student_id" ><br><br>
English : <input type="text" name="english_mark"><br><br>
Hindi : <input type="text" name="hindi_mark"><br><br>
Maths :<input type="text" name="maths_mark"><br><br>
Science :<input type="text" name="science_mark"><br><br>

<input type="hidden" name="total_mark" value="0"><br><br>
<input type="hidden" name="average_mark" value="0"><br><br>
<input type="hidden" name="grade" value="n"><br><br>
<input type="submit" value="Save">&nbsp
<input type="reset" value="Reset"><br><br>
 </form>
</body>
</html>
