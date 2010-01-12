<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<html> 
	<head>
		<title>JSP para ListaPeliculas</title>
	</head>
	<body>
	Bienvenido <%=request.getSession().getAttribute("perfil") %>

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
<td>Año</td>
<td>Sinopsis</td>

</tr>
<%-- start with an iterate over the collection books --%>
<logic:iterate name="listaPeliculasForm" property="peliculas" id="pelicula">
<tr>
<%-- se depliega la información de las peliculas --%>
<td><bean:write name="pelicula" property="titulo" /></td>
<td><bean:write name="pelicula" property="nombreDirector" /></td>
<td><bean:write name="pelicula" property="apellidosDirector" /></td>
<td><bean:write name="pelicula" property="idioma" /></td>
<td><bean:write name="pelicula" property="precio" /></td>
<td><bean:write name="pelicula" property="coste" /></td>
<td><bean:write name="pelicula" property="pathImagen" /></td>
<td><bean:write name="pelicula" property="disponibilidad" /></td>
<td><bean:write name="pelicula" property="anyo" /></td>
<td><bean:write name="pelicula" property="sinopsis" /></td>

<td><form action="./servlet/AdminSession" method="POST">
    <input type="hidden" name="titulo" id="titulo"> 
    <button type="submit">Elegir</button>
    </form>
</td>

<td><html:link action="editarPelicula.do?do=verPelicula" 
paramName="pelicula" 
paramProperty="titulo" 
paramId="titulo">Ver detalles</html:link>
</td>
<td><html:link action="editarPelicula.do?do=eliminarPelicula" 
paramName="pelicula" 
paramProperty="titulo" 
paramId="titulo">Eliminar pelicula</html:link>
</td>
</tr>
</logic:iterate> 
<%-- end interate --%>

<%-- si no hay películas en el catálogo se despiega un mensaje --%>
<logic:notPresent name="pelicula">
<tr>
<td colspan="5">El catálogo está vacío.</td>
</tr>
</logic:notPresent> 

</tbody>
</table>

<br>
<%-- botones para añadir pelidula y volver al menu --%>
<html:button property="add" 
onclick="location.href='editarPelicula.do?do=nuevaPelicula'">Nueva pelicula
</html:button>
&nbsp;
<html:button property="back" 
onclick="location.href='administrador.do'">Volver al menu
</html:button>

    <form action="./servlet/AdminSession" method="POST">
    <input type="text" name="usuario"><br>
    <input type="password" name="password"> <br>
    <button type="submit">Login</button>
    </form>
    
	</body>
</html>

