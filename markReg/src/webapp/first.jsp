<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select student ID</title>
</head>
<body bgcolor="tan">
<h2><center><b>Mark registration form</b></center></h2>
<%! 
private Connection con;
private PreparedStatement ps;
private ResultSet rs;
%>
<%
try{
Class.forName("oracle.jdbc.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
Statement stm=con.createStatement();
rs=stm.executeQuery("select * from emp");
%>
<table align="center"
>
<b><tr><td>Student id:</td><td></b>
<select name="select1" id="slectboxid">
<% 

while(rs.next())
{
%>
<option>
<%=rs.getString(1) %>

</option>

<% }
%>

</select></td></tr>

</table>


<br>


<%

rs.close();


}catch(SQLException e){
System.out.print(e);
}

%>


<script type="text/javascript" src="jquery-1.7.2.min.js"></script>
 <script type="text/javascript">
 function makeCall() {
$.ajax({
type : "POST",
url : "/MarkEntry/HelloServlet",
data : {"uname" : $('#slectboxid option:selected').val()},
success : function(resultdata) {
$("#result").html(resultdata);
},
error : function() {
alert("Could not retrieve data.");
}
});	
 }
</script>

 <form name="f1">

<center><input type="button" value="Get Details" onClick="makeCall()"></center>
<p>

<div id="result"></div></form>
</body>
</html>