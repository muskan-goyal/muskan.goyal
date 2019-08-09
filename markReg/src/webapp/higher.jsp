<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">

<h1>Add marks of the higher secondary standard student:  </h1>
<form action="mark" method="get">
Student id: &nbsp &nbsp &nbsp<input type="text" name="student_id" ><br><br>
English :&nbsp &nbsp &nbsp <input type="text" name="english_mark"><br><br>
Tamil :&nbsp &nbsp &nbsp <input type="text" name="tamil_mark"><br><br>
Physics:&nbsp &nbsp &nbsp<input type="text" name="physics_mark"><br><br>
Chemistry :&nbsp &nbsp &nbsp &nbsp<input type="text" name="chemistry_mark"><br><br>
Computer : &nbsp<input type="text" name="computer_mark"><br><br>
Maths : &nbsp<input type="text" name="maths_mark"><br><br>
<input type="hidden" name="total_mark" value="0"><br><br>
<input type="hidden" name="average_mark" value="0"><br><br>
<input type="hidden" name="grade" value="n"><br><br>

<input type="submit" value="Save">&nbsp
<input type="reset" value="Reset"><br><br>
 </form>

</body>
</html>
