<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
   <link rel="stylesheet" href="<c:url value='/resource/css/bootstrap.min.css'/> "/>
  <link rel="stylesheet" href="<c:url value='/resource/mycss/Index.css'/>" />
<title>Login</title>
</head>

<body bgcolor="#D5F5E3" background="<c:url value='/resource/Images/Fly.jpg" style="width:100%; height:auto;'/> "/>
<%@include file="Header.jsp" %>

<form action="LoginCheck" method="post">

<h1 style="text-align:center; font-face:cambria">Ready to sail away?</h1>
<br/>
<table align="center">
	<tr>
<td style="font-face:cambria">Username</td>
<td><input type="text" name="userid" required="true">
</td>
	</tr>
	<tr>
<td><font face = "cambria">Password</font></td>
<td><input type="password" required="true" name= "pwd"></td>
 <!--   minimum of five char username/pwd-min of 5-10 length/pnly 10digits only numbers -->
	</tr>
	<tr>
<td colspan="2" align ="center"> <input type="Submit" value= "Submit"></td>
	</tr>
	</table>
</form>
</body>
</html>