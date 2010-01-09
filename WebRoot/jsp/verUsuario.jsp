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
<td>Usuario</td>
<td>Contraseña</td>
<td>Nombre</td>
<td>Apellidos</td>
<td>Último acceso</td>
<td>Email</td>
<td>Teléfono</td>
<td>Perfil</td>

</tr>
<%-- start with an iterate over the collection books --%>
<tr>
<%-- book informations --%>
<td><bean:write name="editarUsuarioForm" property="idUsuario" /></td>
<td><bean:write name="editarUsuarioForm" property="password" /></td>
<td><bean:write name="editarUsuarioForm" property="nombre" /></td>
<td><bean:write name="editarUsuarioForm" property="apellidos" /></td>
<td><bean:write name="editarUsuarioForm" property="fecAcceso" /></td>
<td><bean:write name="editarUsuarioForm" property="email" /></td>
<td><bean:write name="editarUsuarioForm" property="telefono" /></td>
<td><bean:write name="editarUsuarioForm" property="tipo" /></td>
</table>

<html:link action="editarUsuario.do?do=eliminarUsuario" 
paramName="editarUsuarioForm" 
paramProperty="idUsuario" 
paramId="idUsuario">Eliminar usuario</html:link>
<html:link action="listaUsuarios.do">Volver al menu</html:link>
  </body>
</html:html>
