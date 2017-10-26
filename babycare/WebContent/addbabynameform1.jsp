<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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

</body>
</html>