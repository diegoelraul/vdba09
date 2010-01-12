/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package hibernate.struts.action;

import javassist.bytecode.Descriptor.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpSession;

import java.util.List;
import java.util.ArrayList;

/** 
 * MyEclipse Struts
 * Creation date: 01-12-2010
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class AddCompraAction extends Action {
	/* 
	 * Generated Methods
	 */
	List<String> compras=new ArrayList<String>();
	HttpSession session;
	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		session=request.getSession();
		compras=(List)session.getAttribute(session.getId());
		//verificamos que el usuario no tenga ya una lista de la compra:
		String title=request.getParameter("titulo");
		if(compras==null){
			//si no existe, creamos una
			compras=new ArrayList<String>();
			request.getSession().setAttribute(session.getId(),compras);
			System.out.println("No exist�a lista de compra, se ha creado una");
		}
		
		compras.add(title);
		session.setAttribute(session.getId(),compras);
		System.out.println("Ahora la lista contiene:");
		//for(Iterator iter=compras.iterator();iter.hasNext();){
			System.out.println(compras);
			System.out.println("Y lo guardado en session es:"+(List)session.getAttribute(session.getId()));
			
		//}compras.
		//request.getSession().setAttribute("lista",compras);
		
		
		//System.out.println("Se ha llamado a esta mierda!!!");
		System.out.println("El usuario:"+request.getSession().getAttribute("username"));
		System.out.println("quiere comprar la peli:"+request.getParameter("titulo"));
		return mapping.findForward("showlist");
	}
}