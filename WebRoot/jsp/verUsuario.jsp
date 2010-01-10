<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    
    <title>verUsuario.jsp</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="./css/estilo.css"/>

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
			
			<div id="content" style="float:left;">
			
			<table class="fondo">
				<tbody>
					<tr class="cabecera">
						<td colspan=8>Nuevo Usuario / Visualizar Usuario</td>							
					</tr>
					<tr>
						<td width="10px"></td>
						<td>Id. Usuario:</td>
						<td colspan=2><input type="text" value="<bean:write name="editarUsuarioForm" property="idUsuario" />" readonly /></td>
						<td rowspan="2" align="right"><img src="./images/usuario.png" width="50px"/></td>
						<td width="5px"></td>
					</tr>
					<tr>
						<td></td>
						<td>Contrase&ntilde;a:</td>
						<td><input type="text" value="<bean:write name="editarUsuarioForm" property="password" />" readonly/></td>
					</tr>
					<tr>
						<td width="10px"></td>
						<td >Nombre:</td>
						<td><input type="text" value="<bean:write name="editarUsuarioForm" property="nombre" />" readonly/></td>
						<td>Apellidos:</td>
						<td><input type="text" value="<bean:write name="editarUsuarioForm" property="apellidos" />" readonly/></td>
					</tr>
					<tr>
						<td></td>
						<td>Correo electr&oacute;nico:</td>
						<td colspan=3><input type="text" size=40 value="<bean:write name="editarUsuarioForm" property="email" />" readonly/></td>
					</tr>
					<tr>
						<td></td>
						<td>Tel&eacute;fono:</td>
						<td><input type="text" value="<bean:write name="editarUsuarioForm" property="telefono" />" readonly/></td>
					</tr>
					<tr>
						<td></td>
						<td>Tipo de Usuario:</td>
						<td><bean:write name="editarUsuarioForm" property="tipo" />
						<td>&Uacute;lt. Acceso:</td>
						<td colspan=3><input type="text" value="<bean:write name="editarUsuarioForm" property="fecAcceso" />" readonly size="10"/></td>
					</tr>
					<tr>
						<td></td>
						<td colspan=2>Compras:</td>
					</tr>
					<tr>
						<td></td>
						<td colspan=6>
							<table cellspacing=0 cellpadding=0 width="80%" style="margin-left:10px;">
								<tr class="subCabecera">
									<td class="fondo"><b>Fecha</b></td>
									<td class="fondo"><b>Pel&iacute;cula</b></td>
									<td class="fondo" style="text-align:right;"><b>Precio (&euro;)</b></td>
								</tr>
								<tr>
									<td class="fondo">#FECHA#</td>
									<td class="fondo">#TITULO#</td>
									<td class="fondo" style="text-align:right;">#PRECIO#</td>
								</tr>
								<tr>
									<td class="fondo"><b>Total:</b></td>
									<td class="fondo" style="text-align:right;" colspan=2><b>#SUMA PRECIO#</b></td>
								</tr>
							</table>
						</td>
					</tr>					
					<tr>						
						<td colspan=6 style="text-align:right;">
							<%--<html:link action="editarUsuario.do?do=eliminarUsuario" 
								paramName="editarUsuarioForm" 
								paramProperty="idUsuario" 
								paramId="idUsuario">Eliminar usuario</html:link>--%>							
							<html:button property="back" onclick="location.href='listaUsuarios.do'">Cancelar</html:button></td>
						<td></td>
					</tr>	
				</tbody>
			</table>
  <table border="1">
<tbody>
</table>

</div>
</div>
</center>
  </body>
</html:html>
