
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
<h2>Product Discount Calculator</h2>
<form method="post" action="/caculate">
<label>Product Description:</label><br>
  <input type="text" name="pd" placeholder="Product Description" ><br>
  <label>List Price</label><br>
  <input type="text" name="lp" placeholder="List Price"><br>
  <label>Discount Percent</label><br>
  <input type="text" name="dp" placeholder="Discount Percent"><br><br>
  <input type="submit" name="submit" value="Calculate Discount">

</form>

  </body>
</html>
