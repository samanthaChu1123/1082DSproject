<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*,google.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>GoogleSearch</title>
	</head>
	<body>
		<%
			//String[][] orderList = (String[][])  request.getAttribute("query");
			
			ArrayList<WebTree> orderList =  (ArrayList<WebTree>) request.getAttribute("query");
			for(WebTree t:orderList)
			{
			%>
				<a href='<%= t.root.webPage.url %>'>
					<%= t.root.webPage.name%>
				</a>
				<br>
					<h style="font-size:15px ;">
						<%= t.root.webPage.url%>
					</h>
				<br>
				<br>
			<%
			}
			
		%>
	</body>
</html>