/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package hibernate.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import modelo.usuario.*;
/** 
 * MyEclipse Struts
 * Creation date: 01-07-2010
 * 
 * XDoclet definition:
 * @struts.form name="listaUsuariosForm"
 */
public class ListaUsuariosForm extends ActionForm {
	
	private Usuario[] usuarios=new Usuario[0];
	
	public Usuario[] getUsuarios(){
		return usuarios;
	}
	
	public void setUsuarios(Usuario[] listusuarios){
		this.usuarios=listusuarios;
	}
	/*
	 * Generated Methods
	 */

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		usuarios=new Usuario[0];
	}
}