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
	
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
	

  </head>
  
  <body style="background-color:#ffffff;">
  <div align="center">
  <br/>
  <br/>
	<table class="fondo">
		<tr style="text-align:center;" class="subCabecera">
			<td colspan=3><h2>Compras</h2></td>
		</tr>
		<tr>
			<td class="fondo" style="width:400px"><b>Peliculas</b></td>
			<td class="fondo" style="text-align:right;width:200px;"><b>Precio (euros)</b></td>
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
	<table class="fondo">
		<tr style="text-align:center;">
			<td colspan=4  class="subCabecera"><h3>Datos de Pago</h3></td>
		</tr>
		<tr>
			<td><b>Num. Cuenta</b></td>
			<td colspan=3>XXXX XXXX XXXX XXXX</td>
		</tr>
		<tr>
			<td><b>Caducidad (mm/aaaa)</b></td>
			<td>YY/20YY</td>
			<td><b>CVV2</b></td>
			<td style="text-align:right;">ABC</td>
		</tr>
		<tr>
			<td><b>Fecha de Compra</b></td>
			<td colspan=3>DD/MM/AAAA</td>
		</tr>
	</table>
   </div>

  </body>
</html>
