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
		
			<div id="content" style="float:left;">
			
			<!-- SI SE HA SELECCIONADO ALGUNA PELICULA EN EL CARRITO -->
			<p>
			Estas son las películas que ha seleccionado.
			</p>
				<table class="fondo" cellspacing=0 cellpadding=0 width="100%">
					<tr style="text-align:center;">
						<td colspan=3 class="cabecera">Compras</td>
					</tr>
					<tr>
						<td class="subCabecera" style="width:400px">Peliculas</td>
						<td class="subCabecera" style="text-align:right;width:200px;">Precio (euros)</td>
						<td class="subCabecera" style="text-align:right;width:40px">&nbsp;</td>
					</tr>
					<tr>
						<td class="fondo" >Pelicula 1</td>
						<td class="fondo" style="text-align:right;">2,00</td>
						<td class="fondo" style="text-align:right;width:40px"><a href=""><img src="./images/delete.png" border=0/></a></td>
					</tr>
					<tr>
						<td class="fondo">Pelicula 2</td>
						<td class="fondo" style="text-align:right;">2,00</td>
						<td class="fondo" style="text-align:right;width:40px"><a href=""><img src="./images/delete.png" border=0/></a></td>
					</tr>
					<tr>
						<td class="fondo">Pelicula 3</td>
						<td class="fondo" style="text-align:right;">2,00</td>
						<td class="fondo" style="text-align:right;width:40px"><a href=""><img src="./images/delete.png" border=0/></a></td>
					</tr>
					<tr>
						<td class="fondo"><b>Total</b></td>
						<td class="fondo" style="text-align:right;"><b>6,00</b></td>
						<td class="fondo"></td>
					</tr>
				</table>
				<p>
				Si es correcto, introduzca los datos de pago.
				</p>
				<table class="fondo" width="100%">
					<tr style="text-align:center;" class="cabecera">
						<td colspan=4>Datos de Pago</td>
					</tr>
					<tr>
						<td class="fondo">Num. Cuenta</td>
						<td class="fondo" colspan=3>
							<input type="text" size=5/>
							<input type="text" size=5/>
							<input type="text" size=5/>
							<input type="text" size=5/></td>
					</tr>
					<tr>
						<td class="fondo">Caducidad (mm/aaaa)</td>
						<td class="fondo">
							<input type="text" size=3/>
							<input type="text" size=5/></td>
						<td class="fondo">CVV2</td>
						<td class="fondo" style="text-align:right;"><input type="text" size=5/></td>
					</tr>
					<tr>
						<td class="fondo" colspan=4 style="text-align:right">
							<input type="submit" value="Realizar Compra"/>
						</td>
					</tr>
				</table>
			
			<!-- SI NO SE HA SELECCIONADO NINGUNA PELICULA EN EL CARRITO -->
			<p>
			No ha seleccionado ninguna pel&iacute;cula. El carrito est&aacute; vac&iacute;o.
			</p>
			<!-- SI SE ACABA DE REALIZAR LA COMPRA -->
			<p>
			La compra se ha realizado con &eacute;xito.<br/>
			<%
					out.println("<a href=\""+request.getScheme()+"://"+request.getServerName()+":"+
								request.getServerPort()+request.getContextPath()+"/factura.jsp\" "+
								"target=\"new\">Ver factura.</a>");
			%> 
			<br/>
			<br/>
			<%
					out.println("<input type=\"submit\" value=\"Volver\" "); 
					out.println("onclick=\"window.location='"+request.getScheme()+"://"+request.getServerName()+":"+
								request.getServerPort()+request.getContextPath()+"/index.jsp'\"/>");
			%>
			</p>
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
			
		</div>
		</center>
	</body>
</html>
