<%@page import="modelo.usuario.Usuario"%>
<%!
	private Usuario usuario;

	private boolean estaLoggeado() {
		//return (usuario != null);
		return true;
	}
	
	private String obtenerNombreUsuario() {
		//return usuario.getIdUsuario();
		return "pepe";
	}

	private void comprobarLogin() throws NullPointerException {
		if (!estaLoggeado()) {
			throw (new NullPointerException(
					"No puede acceder a esta página sin iniciar sesión previamente"));
		}
	}%>

<%
	usuario = (Usuario) session.getAttribute("usuario");
%>
  <div style="float:left;width:25%;text-align:left;">
    <img src="./images/cinta4.jpg"/>
  </div>
  <div style="float:left;width:50%;">
    <center>
      <h1>· · · FILMS 2010 · · ·</h1>   
    </center>
  </div>
  <div style="float:right;">
    <img src="./images/cinta1.jpg" />
  </div>
  <div style="clear:both;">
    <table cellspacing=0 cellpadding=0 width="100%">
      <tr>
        <td class="logomenu" width="50px">&nbsp;</td>
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
			if (estaLoggeado()) { 
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

