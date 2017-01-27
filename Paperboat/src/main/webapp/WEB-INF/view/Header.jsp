<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link rel="shortcut icon" href="C:\Users\Sathya\workspace\E commerce\favicon.ico" />
<title>Header</title>

   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <link rel="stylesheet" href="<c:url value='/resource/css/bootstrap.min.css'/> "/>
  <link rel="stylesheet" href="<c:url value='/resource/mycss/Index.css'/>" />
  
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top" >
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
      <li class="navbar-right"><a href="Register"><span class="glyphicon glyphicon-user-add"></span> Sign Up</a></li>
      <li class="navbar-right"><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      <li class="navbar-right"><a href="Aboutus">Self bragging</a></li>
    </ul>
      </div>
 </nav> 		
<script src="<c:url value='/resource/js/bootstrap.min.js'/> "/></script>
 		
 		
</body>
 </html>