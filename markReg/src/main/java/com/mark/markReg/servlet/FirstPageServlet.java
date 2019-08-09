package com.mark.markReg.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/FirstPageServlet")
public class FirstPageServlet extends HttpServlet  {
private Connection con;
private PreparedStatement ps;
private ResultSet rs;

private int id;
private String ename="";
private String job="";
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at: ").append(request.getContextPath());
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
PrintWriter out = response.getWriter();
response.setContentType("text/plain");	
id = Integer.parseInt(request.getParameter("uname"));

try {
Class.forName("oracle.jdbc.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
//Statement stm=con.createStatement();
String query="select * from emp where empno=?";
//	rs=stm.executeQuery("select ename,job from emp where empno=?");
PreparedStatement ps=con.prepareStatement(query);
ps.setInt(1, id);
rs=ps.executeQuery();
while(rs.next()) {
ename=rs.getString(2);
job=rs.getString("job");
rs.close();
}

}catch(SQLException | ClassNotFoundException e) {}
//out.println("<h2><center><u>Student Record</u></h2></center>");
//out.println("<center><h3>ID: "+id+"</h3>");
//out.println("<center><h3>Student Name: "+ename+"</h3>");
//out.println("<center><h3>Standard Category: "+job+"</h3>");
//out.println("<form onsubmit='http://localhost:8080/MarkEntry/dem2.jsp' action='http://localhost:8080/MarkEntry/dem2.jsp'><input type='hidden' name='id' value="+id+"><input type='hidden' name='sname' value="+ename+"><input type='hidden' name='id' value="+job+"><center><input type='submit' value='ADD'></center></form>");	

request.setAttribute("id", id);
//request.setAttribute("name", ename);
request.setAttribute("sc", job);
switch(id) {
case 7521:
request.getRequestDispatcher("primary.jsp").forward(request, response);break;
case 53:
request.getRequestDispatcher("secondarymarks.jsp").forward(request, response);break;
case 535:
request.getRequestDispatcher("highersecondarymarks.jsp").forward(request, response);break;
default:
out.println("Sorry,ID has no Category.Try with someother ID");
}

out.flush();
out.close();


}
}
