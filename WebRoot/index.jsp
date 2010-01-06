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
			
			<!-- SI NO HAY PELICULA SELECCIONADA -->
				<h2>
					Listado de pel&iacute;culas
				</h2>
				<p id="listado">
				<a href="">Pelicula 1</a><br/>
				<a href="">Pelicula 2</a><br/>
				<a href="">Pelicula 3</a><br/>
				<a href="">Pelicula 4</a><br/>
				</p>
			
			<!-- SI HAY PELICULA SELECCIONADA -->	
				<h2>
					#TITULO#
				</h2>
				<div style="float:left; margin-right:10px;">
				<img src="./images/cinta3.jpg" border=1 width="100px"/>
				</div>
				<b>Director: </b>#NOM_DIRECTOR# #APELLIDOS_DIRECTOR#<br/>
				<b>Idioma: </b>#IDIOMA#<br/>
				<b>Coste: </b>#COSTE# euros<br/>
				<b>Disponibilidad: </b>#DISPONIBILIDAD#<br/>
				<!-- Si usuario logueado -->
				<p align="right">
					<input type="submit" value="Comprar"/>
					<input type="submit" value="Volver al &iacute;ndice"/>
				</p>
				
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
			<%
			if (estaLoggeado()) { %>
        		<div id="config" style="float:right;">
        			<%@include file="/inc/config.jsp"%>
				</div>
        	<% } %>
		
		</div>
		</center>
	</body>
</html>
