<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>Pelicula</title>

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
  
  <table border="1">
<tbody>
<%-- set the header --%>


<tr>
<td>Titulo</td>
<td>Nombre director</td>
<td>Apellidos director</td>
<td>Idioma</td>
<td>Precio</td>
<td>Coste</td>
<td>Imagen</td>
<td>Disponibilidad</td>

</tr>
<%-- start with an iterate over the collection books --%>
<tr>
<%-- book informations --%>
<td><bean:write name="editarPeliculaForm" property="titulo" /></td>
<td><bean:write name="editarPeliculaForm" property="nombreDirector" /></td>
<td><bean:write name="editarPeliculaForm" property="apellidosDirector" /></td>
<td><bean:write name="editarPeliculaForm" property="idioma" /></td>
<td><bean:write name="editarPeliculaForm" property="precio" /></td>
<td><bean:write name="editarPeliculaForm" property="coste" /></td>
<td><bean:write name="editarPeliculaForm" property="pathImagen" /></td>
<td><bean:write name="editarPeliculaForm" property="disponibilidad" /></td>
</tr></tbody></table>
Reparto:
<table>
<td><bean:write name="editarPeliculaForm" property="reparto" /></td>
</table>

<html:link action="editarPelicula.do?do=modifPelicula" 
paramName="editarPeliculaForm" 
paramProperty="titulo" 
paramId="titulo">Modificar película</html:link>
<html:link action="editarPelicula.do?do=eliminarPelicula" 
paramName="editarPeliculaForm" 
paramProperty="titulo" 
paramId="titulo">Eliminar película</html:link>
<html:link action="listaPeliculas.do">Volver al menu</html:link>
  </body>
</html:html>
