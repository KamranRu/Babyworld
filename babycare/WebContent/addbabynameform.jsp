<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert list of babyname</title>
<link rel="stylesheet" href="resources/bootstrap.min.css"/>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index.jsp">BabyCare</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="index.jsp">Home</a></li>
        <li class="active"><a href="ViewBabyName">Baby Names</a></li>
        <li><a href="tips.jsp">Tips</a></li>
        <li><a href="food.jsp">Food</a></li>
        <li><a href="product.jsp">Product</a></li>
		<li><a href="Admin">Admin</a></li>
        </ul>

    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<div class="container">
  <h1>Add Baby Name</h1>

<form style="width:300px" action="AddBabyName" method="post">
  <div class="form-group">
    <label for="name1">Name:</label>
    <input type="text" name="name" class="form-control" id="name1" placeholder="Name"/>
  </div>
  <div class="form-group">
    <label for="meaning1">Meaning:</label>
    <input type="text" name="meaning" class="form-control" id="meaning1" placeholder="Meaning"/>
  </div>
  <div class="form-group">
    <label for="sex1">Sex:</label>
    <input type="radio" name="sex" value="boy" id="sex1"/>Male
    <input type="radio" name="sex" value="girl" id="sex1"/>Female
  </div>
  <div class="form-group">
    <label for="religion1">Religion:</label>
    <select name="religion" class="form-control" id="religion1">
    <option>Hindu</option>
    <option>Muslim</option>
    <option>Christian</option>
    <option>Sikh</option>
    <option>Jews</option>
    <option>Jain</option>
    <option>Buddhist</option>
    </select>
  </div>
  
  <button type="submit" class="btn btn-primary">Add Baby Name</button>
</form>
</div>

<script src="resources/jquery.min.js"></script>
  <script src="resources/bootstrap.min.js"></script>

</body>

</html>