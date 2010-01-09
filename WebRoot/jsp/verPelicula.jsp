<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>verUsuario.jsp</title>

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
</table>
Reparto:
<table border="1">
<tr><td>Nombre</td><td>Apellidos</td><td>Personaje</td>

<logic:iterate name="editarPeliculaForm" property="reparto" id="reparto" indexId="idx">
<tr>
<td><bean:write name="reparto" property="id.nombre" /></td>
<td><bean:write name="reparto" property="id.apellidos" /></td>
<td><bean:write name="reparto" property="personaje" /></td>
<html:hidden name="editarPeliculaForm" property="titulo" />
<td><html:link action="editarPelicula.do?do=elimReparto" 
paramName="reparto"
paramProperty="personaje"
paramId="personaje"
>Eliminar personaje</html:link></td>
</tr>
</logic:iterate> 
<%-- end interate --%>

<%-- if books cannot be found display a text --%>
<logic:notPresent name="reparto">
<tr>
<td colspan="5">No hay información sobre el reparto.</td>
</tr>
</logic:notPresent>
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
