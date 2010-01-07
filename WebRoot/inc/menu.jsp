<%@page import="modelo.usuario.Usuario"%>
<%!
	private Usuario usuario;

	private boolean estaLoggeado() {
		//return (usuario != null);
		//EMHA - PARA PRUEBAS!! 
		return false;
	}
	
	private boolean esAdministrador() {
		if (!estaLoggeado()) {
			return false;
		}else
			return obtenerNombreUsuario() == "root"; /*EMHA: constante de configuracion*/
	}
	
	private String obtenerNombreUsuario() {
		if (!estaLoggeado()) {
			return "";
		}else
			//return usuario.getIdUsuario();
			//EMHA - PARA PRUEBAS!! 
			return "root";
	}

	//EMHA. NO SE ESTA UTILIZANDO. RESTRINGIR ACCESO POR URL
	private void comprobarLogin() throws NullPointerException {
		if (!estaLoggeado()) {
			throw (new NullPointerException(
					"No puede acceder a esta página sin iniciar sesión previamente"));
		}
	}%>

<%
	usuario = (Usuario) session.getAttribute("usuario");
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
        <td class="menu" width="50px">&nbsp;</td>
        <td class="menu"  width="100px">
        	<a href="./index.jsp">Home</a>
        </td>
        <!-- USUARIOS REGISTRADOS -->
        <%
			if (estaLoggeado()) { 
			%>
        		<td class="menu" width="150px">
        			<a href="./compras.jsp">Mis compras</a>
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

        <td class="menu" width="auto"></td>
      </tr>
    </table>
  </div>

