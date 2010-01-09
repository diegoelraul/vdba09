<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
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
			<form id="usuarios">
				<table cellspacing=0 class="fondo" width="620px">
					<tr class="cabecera">
						<td colspan=4>Usuarios</td>
					</tr>
					<tr class="subCabecera">
						<td>Id. Usuario</td>
						<td width="30px"></td>
						<td>Visualizar</td>
						<td>Eliminar</td>
					</tr>
					<tr>
						<td class="fondo">Usuario 1</td>
						<td class="fondo">&nbsp;</td>
						<td class="fondo"><a href=""><img src="./images/view.png" border=0/></a></td>
						<td class="fondo"><a href=""><img src="./images/delete.png" border=0/></a></td>
					</tr>
					<tr>
						<td class="fondo">Usuario 2</td>
						<td class="fondo">&nbsp;</td>
						<td class="fondo"><a href=""><img src="./images/view.png" border=0/></a></td>
						<td class="fondo"><a href=""><img src="./images/delete.png" border=0/></a></td>
					</tr>
					<tr>
						<td class="fondo">Usuario 3</td>
						<td class="fondo">&nbsp;</td>
						<td class="fondo"><a href=""><img src="./images/view.png" border=0/></a></td>
						<td class="fondo"><a href=""><img src="./images/delete.png" border=0/></a></td>
					</tr>					
				</table>
			
			</form>
			
			</div>
			
		</div>
		</center>
	</body>
</html>
