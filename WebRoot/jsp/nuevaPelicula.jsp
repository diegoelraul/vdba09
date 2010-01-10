<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    
    <title>Alta de Pelicula</title>

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
			
			<div id="menuAdm" style="float:left;">
				<%@include file="/inc/menuAdm.jsp"%>
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
			<div id="content">

	<br/>
	<html:form action="editarPelicula.do?do=nuevaPeliculaSave">
	<%-- print out the form data --%>
		<table class="fondo">
			<tbody>
				<tr class="cabecera">
					<td colspan=8>Nueva Pel&iacute;cula / Editar Pel&iacute;cula</td>							
				</tr>
				<tr>
					<td width="10px"></td>
					<td rowspan=7><img src="./images/cinta3.jpg" width="150px" border=1/></td>
					<td width="10px"></td>
					<td>T&iacute;tulo:</td>
					<td colspan=3><html:text property="titulo" size="50"/></td>
					<td width="10px"></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td>Director:</td>
					<td><html:text property="nombreDirector"/></td>
					<td colspan=2><html:text property="apellidosDirector"/></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td>Idioma:</td>
					<td ><html:text property="idioma"/></td>
					<td>A&ntilde;o:</td>
					<td colspan=3><html:text property="coste" size="5"/></td>
				</tr>					
				<tr>
					<td></td>
					<td></td>
					<td>Coste:</td>
					<td><html:text property="coste" size="5"/> &euro;</td>
					<td>Precio:</td>
					<td><html:text property="precio" size="5"/> &euro;</td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td>Disponibilidad:</td>
					<td colspan=3><html:text property="disponibilidad" size="5"/> unidades</td>
				</tr>					
				<tr>
					<td></td>
					<td></td>
					<td>Imagen:</td>
					<td colspan=3><html:text property="pathImagen" size="50"/></td>
				</tr>					
				<tr>
					<td></td>
					<td></td>
					<td>Reparto:</td>
					<td colspan=3><textarea rows=2 cols=44></textarea></td>
				</tr>					
				<tr>
					<td></td>
					<td>Sipnosis:</td>
				</tr>
				<tr>
					<td></td>
					<td colspan=6><textarea rows=4 cols=79></textarea></td>
				</tr>
				<tr>
					<td></td>							
					<td colspan=6 style="text-align:right;">
						<html:submit>Guardar</html:submit>
						<html:button property="back" onclick="location.href='listaPeliculas.do'">Cancelar</html:button></td>
					<td></td>
				</tr>		
			</tbody>
		</table>
	</html:form>
	</div>
	</div>
	</center>
  </body>
</html:html>
