<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'factura.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<table border=0>
		<tr style="text-align:center;">
			<td colspan=3><h2>Compras</h2></td>
		</tr>
		<tr >
			<td style="width:400px"><b>Peliculas</b></td>
			<td style="text-align:right;width:200px;"><b>Precio (euros)</b></td>
		</tr>
		<tr>
			<td>Pelicula 1</td>
			<td style="text-align:right;">2,00</td>
		</tr>
		<tr>
			<td>Pelicula 2</td>
			<td style="text-align:right;">2,00</td>
		</tr>
		<tr>
			<td>Pelicula 3</td>
			<td style="text-align:right;">2,00</td>
		</tr>
		<tr>
		<td>Total</td>
			<td style="text-align:right;">6,00</td>
			<td></td>
		</tr>
	</table>
	<br/>
	<table border=0>
		<tr style="text-align:center;">
			<td colspan=4><h3>Datos de Pago</h3></td>
		</tr>
		<tr>
			<td>Num. Cuenta</td>
			<td colspan=3>XXXX XXXX XXXX XXXX</td>
		</tr>
		<tr>
			<td>Caducidad (mm/aaaa)</td>
			<td>YY/20YY</td>
			<td>CVV2</td>
			<td style="text-align:right;">ABC</td>
		</tr>
		<tr>
			<td>Fecha de Compra</td>
			<td colspan=3>DD/MM/AAAA</td>
		</tr>
	</table>
     

  </body>
</html>
