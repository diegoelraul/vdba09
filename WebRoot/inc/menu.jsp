<%@page import="modelo.usuario.Usuario"%>
<%!
	//private Usuario usuario;
	private String username="invitado";
	private String perfil="invitado";
	private boolean estaLogg; 
	private boolean esAdmin;

	private boolean estaLoggeado() {
	return estaLogg;
	}

	private boolean esAdministrador() {
		if (!estaLoggeado()) {
			return false;
		}else
			return esAdmin;
	}

	private String obtenerNombreUsuario() {
		if (!estaLoggeado()) {
			return "";
		}else
			return username;
	}

	private void comprobarLogin() throws NullPointerException {
		if (!estaLoggeado()) {
			throw (new NullPointerException(
					"No puede acceder a esta página sin iniciar sesión previamente"));
		}
	}
	%>

<%  System.out.println("Finalmente entramos en la aplicación");
	username = (String)session.getAttribute("username");
	System.out.println("Initvalues: \n username: "+username);
	perfil=(String)session.getAttribute("perfil");
	System.out.println("Initvalues: \n perfil: "+perfil);
	estaLogg=!username.equals("invitado");
	//System.out.println("Initvalues: \n estaLoggeado: "+estaLoggeado);
	esAdmin=perfil.equals("administrador");
	System.out.println("Es administrador?"+esAdministrador());
	//System.out.println("Initvalues: \n esAdministrador: "+esAdministrador);
	//System.out.println("Initvalues: \n username: "+username+"\nperfil: "+perfil+"\n\r estaLoggeado: "+estaLoggeado+"\nesadministrador:"+esAdministrador);
	
%>
  <div style="float:left;width:208px;text-align:left;">
    <img src="./images/cinta4.jpg"/>
  </div>
  <div style="float:left;width:208px;">
    <center>
      <img src="./images/letras.gif" alt="· · · FILMS 2010 · · ·"/>   
    </center>
  </div>
  <div style="float:right;width:208px">
    <img src="./images/cinta1.jpg" />
  </div>
  <div style="clear:both;">
    <table cellspacing=0 cellpadding=0 width="100%">
      <tr>
        <td class="menu" width="20px">&nbsp;</td>
        <td class="menu"  width="100px">
        	<a href="./index.jsp">Home</a>
        </td>
        <!-- USUARIOS REGISTRADOS -->
        <%
			if (estaLoggeado()) { 
			%>
        		<td class="menu" width="150px">
        			<a href="./privado/compras.jsp">Mis compras</a>
        		</td>
        	<%
        	}
        %>
        
        <!-- ADMINISTRADORES -->
        <%
			if (esAdministrador()) { 
			%>
        		<td class="menu" width="150px">
        			<a href="./admin/administracion.jsp">Administraci&oacute;n</a>
        		</td>
        	<%
        	}
        %>

        <td class="menu" width="auto" style="text-align:right;"><a href="./about.jsp">About Us</a></td>
      </tr>
    </table>
  </div>

