<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>入力ページ</h1>

<form action="WelcomeServlet" method="post">

<table>

<tr>
<td>株の銘柄A</td>
<td><input type="text" name="nameA"></td>
</tr>
<tr>
<td>株の価格A</td>
<td><input type="text" name="priceA"></td>
</tr>
<tr>
<td></td>
<td></td>
</tr>


<tr>
<td>株の銘柄B</td>
<td><input type="text" name="nameB"></td>
</tr>
<tr>
<td>株の価格B</td>
<td><input type="text" name="priceB"></td>
</tr>
<tr>
<td></td>
<td></td>
</tr>

<tr>
<td>株の銘柄C</td>
<td><input type="text" name="nameC"></td>
</tr>
<tr>
<td>株の価格C</td>
<td><input type="text" name="priceC"></td>
</tr>
<tr>
<td></td>
<td></td>
</tr>

<tr>
<td>株の銘柄D</td>
<td><input type="text" name="nameD"></td>
</tr>
<tr>
<td>株の価格D</td>
<td><input type="text" name="priceD"></td>
</tr>
<tr>
<td></td>
<td></td>
</tr>

<tr>
<td>株の銘柄E</td>
<td><input type="text" name="nameE"></td>
</tr>
<tr>
<td>株の価格E</td>
<td><input type="text" name="priceE"></td>
</tr>
<tr>
<td></td>
<td></td>
</tr>

<tr>
<td>
<select name="quantity">
<option value="5">5株</option>
<option value="10">10株</option>


</select>
</td>
<td>
<input type="submit" value="送信">
<input type="reset" value="取消">

</td>
</tr>



</table>
</form>

</body>
</html>