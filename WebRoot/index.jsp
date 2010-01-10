<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
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
			<br/>
			<!-- SI NO HAY PELICULA SELECCIONADA -->
				<table class="fondo" cellspacing="0" cellpadding="0" width="550px">
					<tr class="cabecera">
						<td style="text-align:center" valign="middle">
							Listado de pel&iacute;culas
						</td>
					</tr>
					<tr>
						<td  style="text-align:left">
							<ul id="listado" type="circle">
								<li><a href="">Pelicula 1 con un nombre largo super largo pero que muy muy largo</a></li>
								<li><a href="">Pelicula 2</a></li>
								<li><a href="">Pelicula 3</a></li>
								<li><a href="">Pelicula 4</a></li>
							</ul>
						</td>
					</tr>
					
					</table>
			
			<!-- SI HAY PELICULA SELECCIONADA -->	
				<div class="fondo">
				<h2 class="cabecera">
					#TITULO#
				</h2>
				<div style="float:left; margin-right:10px;" >
				<img src="./images/cinta3.jpg" border=1 width="100px"/>
				</div>
				<b>Director: </b>#NOM_DIRECTOR# #APELLIDOS_DIRECTOR#<br/>
				<b>Idioma: </b>#IDIOMA# <b>Año: </b>#AÑO#<br/>
				<b>Precio: </b>#PRECIO# &euro;<br/>
				<b>Reparto: </b>#REPARTO#<br/>
				<b>Sipnosis: </b> #SIPNOSIS#<br/> 
				<p align="right">
				<b>Disponibilidad: </b>#DISPONIBILIDAD# unidades<br/>
				</p>
				<!-- Si usuario logueado -->
				<p align="right">
					<input type="submit" value="Comprar"/>
					<%
					out.println("<input type=\"submit\" value=\"Volver\" "); 
					out.println("onclick=\"window.location='"+request.getScheme()+"://"+request.getServerName()+":"+
								request.getServerPort()+request.getContextPath()+"/index.jsp'\"/>");
					%>					 
				</p>
				</div>
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
</html:html>

