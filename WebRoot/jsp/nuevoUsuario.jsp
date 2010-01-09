<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>Alta de usuario</title>

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
 <html:form action="editarUsuario.do?do=nuevoUsuarioSave">
<%-- print out the form data --%>
<table border="1">
<tbody>
<tr><td>Usuario:</td><td><html:text property="idUsuario" /></td></tr>
<tr><td>Password:</td><td><html:text property="password" /></td></tr>
<tr><td>Nombre:</td><td><html:text property="nombre" /></td></tr>
<tr><td>Apellidos:</td><td><html:text property="apellidos" /></td></tr>
<tr><td>Email:</td><td><html:text property="email" /></td></tr>
<tr><td>Teléfono:</td><td><html:text property="telefono" /></td></tr>
<!-- Aquí se puede poner un checkbox para controlar el tipo -->
<tr><td>Tipo:</td><td><html:text property="tipo" /></td></tr>
<tr>
<td><html:submit>Guardar</html:submit></td>
<td><html:button property="back" onclick="location.href='listaUsuarios.do'">Cancelar</html:button></td>
</tr>
</html:form> 
  </body>
</html:html>
