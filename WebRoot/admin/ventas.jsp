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
			<%@include file="/inc/menuAdm.jsp"%>
			
			<form id="usuarios">
				<table>
					<tr>
						<td>Fecha de la compra</td>
						<td>Importe Total (euros)</td>
						<td>Id. Usuario</td>
						<td>Listado Peliculas</td>
					</tr>
					<tr>
						<td>dd/mm/aaaa</td>
						<td>3,00</td>
						<td>Usuario 1</td>
						<td><p id="listado">
							Pelicula 1<br/>
							Pelicula 4<br/>
							</p>
						</td>
					</tr>
					<tr>
						<td>dd/mm/aaaa</td>
						<td>3,00</td>
						<td>Usuario 1</td>
						<td><p id="listado">
							Pelicula 1<br/>
							Pelicula 4<br/>
							</p>
						</td>
					</tr>
					<tr>
						<td>dd/mm/aaaa</td>
						<td>3,00</td>
						<td>Usuario 1</td>
						<td><p id="listado">
							Pelicula 1<br/>
							Pelicula 4<br/>
							</p>
						</td>
					</tr>
					<tr>
						<td colspan=4><b>Total</b></td>
					</tr>
					<tr>
						<td>N compras</td>
						<td>6,00</td>
						<td></td>
						<td>
						</td>
					</tr>
					
				</table>
			
			</form>
			
			
			</div>
			<div id="user" style="float:right;">
			<%
			if (estaLoggeado()) { %>
        		Bienvenido,         		
			<%
				out.println(obtenerNombreUsuario() + "<br />");
			} else { %>
        		<%@include file="/inc/login.jsp"%>
			<%  } %>
			</div>
			<div id="config" style="float:right;">
       			<%@include file="/inc/configVentas.jsp"%>
			</div>
       	
			
			
		</div>
		</center>
	</body>
</html>
