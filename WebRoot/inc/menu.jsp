<%@page import="modelo.usuario.Usuario"%>
<%!
	private Usuario usuario;

	private boolean estaLoggeado() {
		return (usuario != null);
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
        <td class="menu"  width="100px">Home</td>
        <!-- USUARIOS REGISTRADOS -->
        <%
			if (estaLoggeado()) { 
        		out.println("<td class=\"menu\" width=\"150px\">Mis compras</td>");
        	}
        %>
        
        <!-- ADMINISTRADORES -->
        <%
			if (estaLoggeado()) { 
        		out.println("<td class=\"menu\" width=\"150px\">Administraci&oacute;n</td>");
        	}
        %>

        <td class="menu" width="auto"></td>
      </tr>
    </table>
  </div>

