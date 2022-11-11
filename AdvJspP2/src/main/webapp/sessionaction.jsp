<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Session Page</h1>
<%

String u1=request.getParameter("uname");

if(u1.equals("admin"))
{
	HttpSession sess=request.getSession();
	request.setAttribute("k1",u1);
	response.sendRedirect("viewsession.jsp");
}
else
{
	Cookie ck=new Cookie("k2",u1);
	response.addCookie(ck);
	response.sendRedirect("cookieaction.jsp");
}

%>
</body>
</html>