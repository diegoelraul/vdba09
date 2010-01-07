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
			<div id="content">
				<form id="mtoPelicula">
				<br/>
				<!-- si se pasa codigo pelicula, EDIT, si no se pasa codigo, INSERT -->
					<table class="fondo">
						<tr class="cabecera">
							<td colspan=7>Nueva Pel&iacute;cula / Editar Pel&iacute;cula</td>							
						</tr>
						<tr>
							<td width="10px"></td>
							<td rowspan=7><img src="./images/cinta3.jpg" width="150px" border=1/></td>
							<td width="10px"></td>
							<td>T&iacute;tulo:</td>
							<td colspan=3><input type="text" size=50/></td>
							<td width="10px"></td>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td>Director:</td>
							<td><input type="text"/></td>
							<td colspan=2><input type="text"/></td>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td>Idioma:</td>
							<td colspan=3><input type="text"/></td>
						</tr>					
						<tr>
							<td></td>
							<td></td>
							<td>Coste:</td>
							<td><input type="text" size=5/> &euro;</td>
							<td>Precio:</td>
							<td><input type="text" size=5/> &euro;</td>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td>Disponibilidad:</td>
							<td colspan=3><input type="text" size=5/> unidades.</td>
						</tr>					
						<tr>
							<td></td>
							<td></td>
							<td>Imagen:</td>
							<td colspan=3><input type="text" size=50/></td>
						</tr>					
						<tr>
							<td></td>
							<td></td>
							<td>Reparto:</td>
							<td colspan=3><textarea rows=2 cols=44></textarea></td>
						</tr>					
						<tr>
							<td></td>
							<td>Sipnosis:</td>
						</tr>
						<tr>
							<td></td>
							<td colspan=6><textarea rows=4 cols=79></textarea></td>
						</tr>
						<tr>
							<td></td>							
							<td colspan=6 style="text-align:right;">
								<input type="submit" value="Aceptar"/>
								<input type="submit" value="Cancelar"/></td>
							<td></td>
						</tr>						
					</table>
				
				</form>
			</div>

			
			
		</div>
		</center>
	</body>
</html>
