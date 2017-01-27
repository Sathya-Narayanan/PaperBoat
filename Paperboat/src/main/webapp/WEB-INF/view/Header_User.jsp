<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header_User</title>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="Index"><font face="Cambria">Paperboat</font></a>
    </div>
       <ul class="nav navbar-nav">
    
      <li><a href="">Releases</a></li>
      
    </ul>
    <ul class="nav navbar-nav">
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Genre
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#"><font face="Cambria">Literature</font></a></li>
          <li><a href="#"><font face="Cambria">Fantasy</font></a></li>
          <li><a href="#"><font face="Cambria">Non fiction</font></a></li>
        </ul>
      </li>
  </ul>
      <form class="navbar-form navbar-left">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Go on Matey!">
      </div>
      </form>
    <ul class="nav navbar-nav navbar-right">
      <li class="navbar-right"><a href="Index"><span class="glyphicon glyphicon-user-add"></span>Logout</a></li>
      <li class="navbar-right"><a href="#">Welcome Sathya</a></li>
      <li class="navbar-right"><a href="Aboutus">Self bragging</a></li>
    </ul>
      </div>
 </nav> 		
<script src="<c:url value='/resource/js/bootstrap.min.js'/> "/></script>
 		
 		



</body>
</html>