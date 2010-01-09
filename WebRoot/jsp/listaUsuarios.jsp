<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
 
<html> 
	<head>
		<title>JSP para ListaUsuarios</title>
	</head>
	<body>

		<table border="1">
<tbody>
<%-- set the header --%>
<tr>
<td>idUsuario</td>
<td>fecAcceso</td>
</tr>
<%-- start with an iterate over the collection books --%>
<logic:iterate name="listaUsuariosForm" property="usuarios" id="usuario">
<tr>
<%-- book informations --%>
<td><bean:write name="usuario" property="idUsuario" /></td>
<td><bean:write name="usuario" property="fecAcceso" /></td>
<td><html:link action="editarUsuario.do?do=verUsuario" 
paramName="usuario" 
paramProperty="idUsuario" 
paramId="idUsuario">Ver detalles</html:link>
</td>
<td><html:link action="editarUsuario.do?do=eliminarUsuario" 
paramName="usuario" 
paramProperty="idUsuario" 
paramId="idUsuario">Eliminar usuario</html:link>
</td>
</tr>
</logic:iterate> 
<%-- end interate --%>

<%-- if books cannot be found display a text --%>
<logic:notPresent name="usuario">
<tr>
<td colspan="5">No hay usuarios registrados.</td>
</tr>
</logic:notPresent> 

</tbody>
</table>

<br>
<%-- add and back to menu button --%>
<html:button property="add" 
onclick="location.href='editarUsuario.do?do=nuevoUsuario'">Nuevo usuario
</html:button>
&nbsp;
<html:button property="back" 
onclick="location.href='administrador.do'">Volver al menu
</html:button>
	</body>
</html>

