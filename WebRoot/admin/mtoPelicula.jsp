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
			
			<form id="mtoPelicula">
			<!-- si se pasa codigo pelicula, EDIT, si no se pasa codigo, INSERT -->
				<table>
					<tr>
						<td>T&iacute;tulo:</td>
						<td colspan=3><input type="text"/></td>
					</tr>
					<tr>
						<td>Director:</td>
						<td><input type="text"/></td>
						<td colspan=2><input type="text"/></td>
					</tr>
					<tr>
						<td>Idioma:</td>
						<td colspan=3><input type="text"/></td>
					</tr>					
					<tr>
						<td>Coste:</td>
						<td><input type="text"/> euros</td>
						<td>Precio:</td>
						<td><input type="text"/> euros</td>
					</tr>
					<tr>
						<td>Disponibilidad:</td>
						<td colspan=3><input type="text"/></td>
					</tr>					
					<tr>
						<td>Imagen:</td>
						<td colspan=3><input type="text"/></td>
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
			
			
		</div>
		</center>
	</body>
</html>
