<%@include file="Header.jsp" %>
<html>
<head>
<link rel="shortcut icon" href="C:\Users\Sathya\workspace\E commerce\favicon.ico"/>
<title>Index</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="<c:url value='/resource/css/bootstrap.min.css'/> "/>
  <link rel="stylesheet" href="<c:url value='/resource/mycss/Index.css'/> "/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  
</head>
<style>
.carousel-inner > .item > img,
.carousel-inner > .item > a > img
	{
	width: 100%;
	height: 100%;
	margin: 0;
	}	
</style>


<body data-spy="scroll" data-target=".nav-bar" data-offset="50">


<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <div class="carousel-inner" role="listbox">
    <div class="item active">
    <p>Sail across worlds through Paperboat</p>
    <img src="<c:url value='/resource/Images/Book.jpg"  alt="Book"'/> "/>
      
      
    </div>

    <div class="item">
      <img src="<c:url value='/resource/Images/Books.jpg"  alt="Books"'/> "/>
    </div>

    <div class="item">
      <img src="<c:url value='/resource/Images/Books1.jpg"  alt="Books1"'/> "/>
    </div>
<!-- Image not displaying within exact position - used the size accurately  -->
   
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

</body>
</html>


<%@include file="footer.jsp" %>