<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import="model.NamePrice,java.util.*" %>

    <%
    List<NamePrice> namePriceList = (List<NamePrice>)request.getAttribute("namePriceList");
    List<NamePrice> namePriceList2 = (List<NamePrice>)request.getAttribute("namePriceList2");
    List<NamePrice> namePriceList3 = (List<NamePrice>)request.getAttribute("namePriceList3");
    Double quantity = (Double) request.getAttribute("quantity");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>結果ページ</h1>

<%-- ${a }<br>
${a.name }<br>
${a.price }<br> --%>

<table>
<tr>
<td>
<table>

<% for(NamePrice namePrice: namePriceList){ %>
<tr><td>銘柄:1株の値段</td></tr>
<tr><td>
	<%= namePrice.getName() %>:<%= namePrice.getPrice() %><br>
</td></tr>

<tr><td>${quantity}株の価格<%= namePrice.getPrice() * quantity %></td></tr>
<% } %>

</table>
</td>
<td>
<table>

<% for(NamePrice namePrice: namePriceList2){ %>
<tr><td>
	<%= namePrice.getName() %>:<%= namePrice.getPrice() %><br>

</td></tr>
<% } %>

</table>
</td>

<td>
<table>

<% for(NamePrice namePrice: namePriceList3){ %>
<tr><td>
	<%= namePrice.getName() %>:<%= namePrice.getPrice() %><br>

</td></tr>
<% } %>

</table>
</td>

</tr>



</table>
</body>
</html>