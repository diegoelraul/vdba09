<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>FILMS 2010</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="./css/estilo.css">
  </head>
  
<body>
		<center>
		<div id="cuerpo">
		<%@include file="/inc/menu.jsp"%>
		
			<div id="content" style="float:left;">
			
			<!-- SI SE HA SELECCIONADO ALGUNA PELICULA EN EL CARRITO -->
				<table border=1 >
					<tr style="text-align:center;">
						<td colspan=3><h2>Compras</h2></td>
					</tr>
					<tr >
						<td style="width:400px"><b>Peliculas</b></td>
						<td style="text-align:right;width:200px;"><b>Precio (euros)</b></td>
						<td></td>
					</tr>
					<tr>
						<td>Pelicula 1</td>
						<td style="text-align:right;">2,00</td>
						<td><a href=""><img src="./images/delete.png" border=0/></a></td>
					</tr>
					<tr>
						<td>Pelicula 2</td>
						<td style="text-align:right;">2,00</td>
						<td><a href=""><img src="./images/delete.png" border=0/></a></td>
					</tr>
					<tr>
						<td>Pelicula 3</td>
						<td style="text-align:right;">2,00</td>
						<td><a href=""><img src="./images/delete.png" border=0/></a></td>
					</tr>
					<tr>
						<td>Total</td>
						<td style="text-align:right;">6,00</td>
						<td></td>
					</tr>
				</table>
				<br/>
				<table border=1>
					<tr style="text-align:center;">
						<td colspan=4><h3>Datos de Pago</h3></td>
					</tr>
					<tr>
						<td>Num. Cuenta</td>
						<td colspan=3>
							<input type="text" size=5/>
							<input type="text" size=5/>
							<input type="text" size=5/>
							<input type="text" size=5/></td>
					</tr>
					<tr>
						<td>Caducidad (mm/aaaa)</td>
						<td>
							<input type="text" size=3/>
							<input type="text" size=5/></td>
						<td>CVV2</td>
						<td style="text-align:right;"><input type="text" size=5/></td>
					</tr>
					<tr>
						<td colspan=4 style="text-align:right">
							<input type="submit" value="Realizar Compra"/>
						</td>
					</tr>
				</table>
			
			<!-- SI NO SE HA SELECCIONADO NINGUNA PELICULA EN EL CARRITO -->
			
			No ha seleccionado ninguna pel&iacute;cula. El carrito est&aacute; vac&iacute;o.
			
			<!-- SI SE ACABA DE REALIZAR LA COMPRA -->
			
			La compra se ha realizado con &eacute;xito.<br/>
			<%
					out.println("<a href=\""+request.getScheme()+"://"+request.getServerName()+":"+
								request.getServerPort()+request.getContextPath()+"/factura.jsp\" "+
								"target=\"new\">Ver factura.</a>");
			%> 
			<br/>
			<br/>
			<%
					out.println("<input type=\"submit\" value=\"Volver\" "); 
					out.println("onclick=\"window.location='"+request.getScheme()+"://"+request.getServerName()+":"+
								request.getServerPort()+request.getContextPath()+"/index.jsp'\"/>");
			%>
			</div>
		</div>
		</center>
	</body>
</html>
