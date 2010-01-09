<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>Modificar película</title>

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
  
  <html:form action="editarPelicula.do?do=modifPeliculaSave">
<%-- print out the form data --%>
<table border="1">
<tbody>
<tr><td>Titulo:</td><td><html:text property="titulo" /></td></tr>
<tr><td>Nombre director:</td><td><html:text property="nombreDirector" /></td></tr>
<tr><td>Apellidos director:</td><td><html:text property="apellidosDirector" /></td></tr>
<tr><td>Idioma:</td><td><html:text property="idioma" /></td></tr>
<tr><td>Precio:</td><td><html:text property="precio" /></td></tr>
<tr><td>Coste:</td><td><html:text property="coste" /></td></tr>
<tr><td>Imagen:</td><td><html:text property="pathImagen" /></td></tr>
<tr><td>Disponibilidad:</td><td><html:text property="disponibilidad" /></td></tr>
<tr><td>Titulo:</td><td><html:text property="titulo" /></td></tr>
<tr><td><html:submit>Guardar</html:submit></td><td><html:button property="back" 
onclick="location.href='listaPeliculas.do'">Cancelar</html:button>
</td>
</tr>
</html:form> 
   
  </body>
</html:html>
