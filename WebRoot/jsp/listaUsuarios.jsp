<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
 
<html> 
	<head>
	
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
			<br/>

			<table cellspacing=0 class="fondo" width="620px">
				<tbody>
					<%-- set the header --%>
					<tr class="cabecera">
						<td colspan=5>Usuarios</td>
					</tr>
					<tr class="subCabecera">
						<td></td>
						<td>Id. Usuario</td>
						<td>Fc. Acceso</td>
						<td width="100px">Ver Detalles</td>
						<td width="60px">Eliminar</td>
					</tr>
					<%-- start with an iterate over the collection books --%>
					<logic:iterate name="listaUsuariosForm" property="usuarios" id="usuario">
					<tr>
					<%-- book informations --%>
						<td class="fondo"><img src="./images/usuario.png" width="25px"/></td>
						<td class="fondo"><bean:write name="usuario" property="idUsuario" /></td>
						<td class="fondo"><bean:write name="usuario" property="fecAcceso" /></td>
						<td class="fondo" style="text-align:center;">
							<html:link action="editarUsuario.do?do=verUsuario" 
								paramName="usuario" 
								paramProperty="idUsuario" 
								paramId="idUsuario">
								<img src="./images/view.png" border=0 alt="Ver detalles"/>
							</html:link>
						</td>
						<td class="fondo"  style="text-align:center;">
							<html:link action="editarUsuario.do?do=eliminarUsuario" 
								paramName="usuario" 
								paramProperty="idUsuario" 
								paramId="idUsuario">
								<img src="./images/delete.png" border=0 alt="Eliminar usuario"/>
							</html:link>
						</td>
					</tr>
					</logic:iterate> 
					<%-- end interate --%>
			
					<%-- if books cannot be found display a text --%>
					<logic:notPresent name="usuario">
					<tr>
						<td class="fondo" colspan="5">No hay usuarios registrados.</td>
						</tr>
					</logic:notPresent> 			
				</tbody>
			</table>

			<p align="right">
				<%-- add button --%>
				<html:button property="add" 
					onclick="location.href='editarUsuario.do?do=nuevoUsuario'">Nuevo usuario
				</html:button>
			</div>
			
		</div>
		</center>
	</body>
</html>

