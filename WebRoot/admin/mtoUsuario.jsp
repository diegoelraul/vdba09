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
			
			<form id="mtoPelicula">
			<!-- si se pasa codigo usuario, CONSULTA, si no se pasa codigo, INSERT -->
				<table class="fondo">
					<tr class="cabecera">
						<td colspan=8>Nuevo Usuario / Visualizar Usuario</td>							
					</tr>
					<tr>
						<td width="10px"></td>
						<td>Id. Usuario:</td>
						<td colspan=3><input type="text"/></td>
						<td width="10px"></td>
					</tr>
					<tr>
						<td></td>
						<td>Contrase&ntilde;a:</td>
						<td><input type="text"/></td>
					</tr>
					<tr>
						<td></td>
						<td>Nombre:</td>
						<td><input type="text"/></td>
						<td>Apellidos:</td>
						<td><input type="text"/></td>
					</tr>
					<tr>
						<td></td>
						<td>Correo electr&oacute;nico:</td>
						<td colspan=3><input type="text" size=40/></td>
					</tr>
					<tr>
						<td></td>
						<td>Tel&eacute;fono:</td>
						<td><input type="text"/></td>
					</tr>
					<tr>
						<td></td>
						<td>Tipo de Usuario:</td>
						<td><input type="radio" value="Cliente" checked/>Cliente
							<input type="radio" value="Administrador"/>Administrador</td>
					</tr>
					
					<!-- solo si es CONSULTA -->
					<tr>
						<td></td>
						<td>Fecha &uacute;ltimo acceso:</td>
						<td colspan=3><input type="text"/></td>
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
									<td class="fondo">dd/mm/aaaa</td>
									<td class="fondo">Pelicula 1</td>
									<td class="fondo" style="text-align:right;">2,00</td>
								</tr>
								<tr>
									<td class="fondo">dd/mm/aaaa</td>
									<td class="fondo">Pelicula 1</td>
									<td class="fondo" style="text-align:right;">2,00</td>
								</tr>
								<tr>
									<td class="fondo"><b>Total:</b></td>
									<td class="fondo" style="text-align:right;" colspan=2><b>4,00</b></td>
								</tr>
							</table>
						</td>
					</tr>					
					<tr>
						<td></td>							
						<td colspan=6 style="text-align:right;">
							<input type="submit" value="Volver"/></td>
						<td></td>
					</tr>						
					<!-- (FIN) solo si es CONSULTA -->
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
