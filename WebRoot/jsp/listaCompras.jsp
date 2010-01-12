<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
 
<html> 
	<head>
		<title>JSP for ListaComprasForm form</title>
	</head>
	<body>
	<table border="1">
<tbody>
<%-- set the header --%>
<tr>
<td>usuario</td>
<td>pelicula</td>
<td>dirección</td>
<td>formaPago</td>
<td>numTarjeta</td>
<td>Fecha compra</td>
<td>Hora</td>
</tr>
<%-- start with an iterate over the collection books --%>
<logic:iterate name="listaComprasForm" property="compra" id="compra">
<tr>
<%-- book informations --%>
<td><bean:write name="compra" property="id.usuario" /></td>
<td><bean:write name="compra" property="id.pelicula" /></td>
<td><bean:write name="compra" property="direccion" /></td>
<td><bean:write name="compra" property="formaPago" /></td>
<td><bean:write name="compra" property="numTarjeta" /></td>
<td><bean:write name="compra" property="id.fecCompra" /></td>
<td><bean:write name="compra" property="id.hora" /></td>

</logic:iterate> 
<%-- end interate --%>

<%-- if books cannot be found display a text --%>
<logic:notPresent name="compra">
<tr>
<td colspan="5">No hay compras registradas.</td>
</tr>
</logic:notPresent> 

</tbody>
</table>
		<html:form action="/listaCompras">
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

