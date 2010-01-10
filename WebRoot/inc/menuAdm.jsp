<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<br/>
  <div style="clear:both;">
    <table cellspacing=0 cellpadding=0>
      <tr>
   		<td class="menuLateral">
     		Pel&iacute;culas
        </td>
        <td>
        	<img src="./images/cabfin.gif"/>
        </td>
      </tr>
      <tr>
        <td class="subMenuLateral">
        	<html:link action="editarPelicula.do?do=nuevaPelicula" property="add">Nueva Pel&iacute;cula</html:link>
        </td>
      </tr>
      <tr>
   		<td class="subMenuLateral">
     		<html:link action="listaPeliculas">Listado</html:link>
        </td>
      </tr>  
      <tr>
   		<td class="menuLateral">
     		Usuarios
        </td>
        <td>
        	<img src="./images/cabfin.gif"/>
        </td>
      </tr>
      <tr>
   		<td class="subMenuLateral">
     		<html:link action="editarUsuario.do?do=nuevoUsuario" property="add">Nuevo Usuario</html:link>
        </td>
      </tr>
      <tr>
   		<td class="subMenuLateral">
     		<html:link action="listaUsuarios">Listado</html:link>
        </td>
      </tr>
      <tr>
        <td class="menuLateral">
        	Actividad
        </td> 
        <td>
        	<img src="./images/cabfin.gif"/>
        </td>
	  </tr>
	  <tr>
   		<td class="subMenuLateral, subCabeceraMenu">
     		Hoy
        </td>
      </tr>
      <tr>
   		<td class="subMenuLateral">
     		<a href="./admin/ventas.jsp">Consultar Ventas</a>
        </td>
      </tr><tr>
   		<td class="subMenuLateral">
     		<a href="./admin/ganancias.jsp">Consultar Ganancias</a>
        </td>
      </tr>
      <tr>
   		<td class="subMenuLateral, subCabeceraMenu">
     		<b>&Uacute;ltima Semana</b>
        </td>
      </tr>
      <tr>
   		<td class="subMenuLateral">
     		<a href="./admin/ventas.jsp">Consultar Ventas</a>
        </td>
      </tr><tr>
   		<td class="subMenuLateral">
     		<a href="./admin/ganancias.jsp">Consultar Ganancias</a>
        </td>
      </tr>
    </table>
  </div>

