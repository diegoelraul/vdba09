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
			if (estaLoggeado()) { 
			  //if(request.getSession().getAttribute("username")%>
        		Bienvenido,         		
			<%
				//out.println(obtenerNombreUsuario() + "<br />");
				out.println(obtenerNombreUsuario() + "<br />");
			} else { %>
        		<%@include file="/inc/login.jsp"%>
			<%  } %>
			</div>
			
			<div id="content" style="float:left;">
			<br/>
			<table cellspacing=0  width="620px">
				<tbody>
				<%-- set the header --%>
					<tr class="cabecera">
						<td colspan=7>Peliculas</td>
					</tr>
					<tr class="subCabecera">
						<td></td>
						<td>T&iacute;tulo</td>
						<td>Director</td>
						<td>A&ntilde;o</td>
						<td>Uds.</td>
						<td width="60px" style="text-aling:center;">Ver</td>
						<td width="60px" style="text-aling:center;">Elegir</td>
						<td width="60px" style="text-aling:center;">Eliminar</td>
					</tr>
					<%-- start with an iterate over the collection books --%>
					<logic:iterate name="listaPeliculasForm" property="peliculas" id="pelicula">
					<tr>
						<%-- se depliega la información de las peliculas --%>
						<td class="fondo">
							<img src="<bean:write name="pelicula" property="pathImagen"/>" width="40px"/>
						</td>
						<td class="fondo"><bean:write name="pelicula" property="titulo" /></td>
						<td class="fondo"><bean:write name="pelicula" property="nombreDirector"/>
										  <bean:write name="pelicula" property="apellidosDirector"/></td>
						<td class="fondo"><bean:write name="pelicula" property="anyo" /></td>
						<td class="fondo" style="text-align:center;"><bean:write name="pelicula" property="disponibilidad" /></td>						
						<td class="fondo" style="text-align:center;">
							<html:link action="editarPelicula.do?do=verPelicula" 
								paramName="pelicula" 
								paramProperty="titulo" 
								paramId="titulo">
								<img src="./images/edit.png" border=0 alt="Ver detalles"/>
							</html:link>
						</td>
						<td class="fondo" style="text-align:center;">
							<html:link action="addCompra"
								paramName="pelicula"
								paramProperty="titulo"
								paramId="titulo">
								<img src="./images/edit.png" border=0 alt="Ver detalles"/>
							</html:link>
				
						</td>
						<td class="fondo" style="text-align:center;">
							<html:link action="editarPelicula.do?do=eliminarPelicula" 
								paramName="pelicula" 
								paramProperty="titulo" 
								paramId="titulo">
								<img src="./images/delete.png" border=0 alt="Eliminar película"/>
							</html:link>
						</td>
				
				
					</tr>
					</logic:iterate> 
					<%-- end interate --%>
			
					<%-- si no hay películas en el catálogo se despiega un mensaje --%>
					<logic:notPresent name="pelicula">
					<tr>
						<td class="fondo" colspan="7">El catálogo está vacío.</td>
					</tr>
					</logic:notPresent> 
			
				</tbody>
			</table>
			<p align="right">
				<%-- botones para añadir pelidula --%>
				<html:button property="add" 
						onclick="location.href='editarPelicula.do?do=nuevaPelicula'">Nueva pelicula
				</html:button>
			</p>
</div>
			
			
		</div>
		</center>
    <form action="./servlet/AdminSession" method="POST">
    <input type="text" name="usuario"><br>
    <input type="password" name="password"> <br>
    <button type="submit">Login</button>
    </form>
    
	</body>
</html>