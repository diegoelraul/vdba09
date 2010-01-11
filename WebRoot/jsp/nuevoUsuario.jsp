<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    
    <title>Alta de usuario</title>

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
 <html:form action="editarUsuario.do?do=nuevoUsuarioSave">
 		
			
			<div id="content" style="float:left;">
 
			<%-- print out the form data --%>
			<table class="fondo">
				<tbody>
					<tr class="cabecera">
						<td colspan=8>Nuevo Usuario / Visualizar Usuario</td>							
					</tr>
					<tr>
						<td width="10px"></td>
						<td>Id. Usuario:</td>
						<td colspan=2><html:text property="idUsuario" /></td>
						<td rowspan="2" align="right"><img src="./images/usuario.png" width="50px"/></td>
						<td width="10px"></td>
					</tr>
					<tr>
						<td></td>
						<td>Contrase&ntilde;a:</td>
						<td><html:text property="password" /></td>
					</tr>
					<tr>
						<td></td>
						<td>Nombre:</td>
						<td><html:text property="nombre" /></td>
						<td>Apellidos:</td>
						<td><html:text property="apellidos" /></td>
						
					</tr>
					<tr>
						<td></td>
						<td>Correo electr&oacute;nico:</td>
						<td colspan=3><html:text property="email" /></td>
					</tr>
					<tr>
						<td></td>
						<td>Tel&eacute;fono:</td>
						<td><html:text property="telefono" /></td>
					</tr>
					<tr>
						<td></td>
						<td>Tipo de Usuario:</td>
						<td><html:radio property="tipo" value="Cliente"/>Cliente
							<html:radio property="tipo" value="Administrador"/>Administrador</td>
					</tr>
					<tr>
						<td></td>							
						<td colspan=6 style="text-align:right;">
							<html:submit>Guardar</html:submit>
							<html:button property="back" onclick="location.href='listaUsuarios.do'">Cancelar</html:button></td>
						<td></td>
					</tr>						
</tbody>
</table>

</div>

</html:form>
</div>
</center>
 
  </body>
</html:html>
