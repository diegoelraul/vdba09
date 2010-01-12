package hibernate.struts.action;

import hibernate.struts.form.EditarPeliculaForm;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.struts.action.Action;
import controlador.TestModelo;
import java.util.Date;
import modelo.pelicula.Pelicula;

/** 
 * MyEclipse Struts
 * Creation date: 01-07-2010
 * 
 * XDoclet definition:
 * @struts.action path="/editarUsuario" name="editarUsuarioForm" parameter="do" scope="request" validate="true"
 * @struts.action-forward name="eliminarUsuario" path="/jsp/eliminarUsuario.jsp"
 * @struts.action-forward name="modificarUsuario" path="/jsp/modificarUsuario.jsp"
 * @struts.action-forward name="nuevoUsuario" path="/jsp/nuevoUsuario.jsp"
 */
public class EditarPeliculaAction extends DispatchAction {
	
	
	public ActionForward eliminarPelicula(
			             ActionMapping mapping,
			             ActionForm form,
			             HttpServletRequest request,
			             HttpServletResponse response){
		System.out.print("eliminar pelicula: ");
		EditarPeliculaForm editarPeliculaForm=(EditarPeliculaForm)form;
		TestModelo admin=new TestModelo();
		editarPeliculaForm.setPelicula(admin.getPelicula(request.getParameter("titulo")));
		return mapping.findForward("eliminarPelicula");
	}
	
	public ActionForward elimPeliculaConf(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response){
		TestModelo admin=new TestModelo();
		admin.eliminarPelicula(request.getParameter("titulo"));
		System.out.println("Eliminada la película");
		return mapping.findForward("elimPeliculaConf");
	}
	
	public ActionForward verPelicula(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response){
		EditarPeliculaForm editarPeliculaForm=(EditarPeliculaForm)form;
		TestModelo admin=new TestModelo();
		System.out.println("Se ha solicitado ver detalle de película:"+request.getParameter("titulo"));
		System.out.println(editarPeliculaForm);
		editarPeliculaForm.setPelicula(admin.getPelicula(request.getParameter("titulo")));
		//editarPeliculaForm.setReparto(admin.listarReparto(request.getParameter("titulo")));
//		response.setAttribute("pel",admin.getPelicula(request.getParameter("titulo")));
		return mapping.findForward("verPelicula");
	}
	
	public ActionForward elimReparto(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response){
		EditarPeliculaForm editarPeliculaForm=(EditarPeliculaForm)form;
		TestModelo admin=new TestModelo();
		System.out.println("Se ha solicitado eliminar de la peli:"+editarPeliculaForm.getPelicula().getTitulo());
		System.out.println("El personaje:"+request.getParameter("personaje"));
		
		//admin.eliminarReparto(request.getParameter("id"));)
		return mapping.findForward("elimReparto");
	}
	
	public ActionForward nuevaPelicula(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response){
		System.out.println("Se ha solicitado crear una peli");
		return mapping.findForward("nuevaPelicula");
	}
	
	public ActionForward modifPelicula(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response){
		System.out.println("Se ha solicitado modif una peli");
		
		EditarPeliculaForm editarPeliculaForm=(EditarPeliculaForm)form;
		System.out.println("Form apellidosDirector:"+editarPeliculaForm.getApellidosDirector());
		String titulo=request.getParameter("titulo");
		System.out.println("titulo:"+titulo);
		String apellidosDirector=request.getParameter("apellidosDirector");
		System.out.println("apellidosDirector: "+apellidosDirector);
		System.out.println(request.getParameter("coste"));
		/*Double coste=new Double(request.getParameter("coste"));
		Integer disponibilidad=new Integer(request.getParameter("disponibilidad"));
		String idioma=request.getParameter("idioma");
		String nombreDirector=request.getParameter("nombreDirector");
		String pathImagen=request.getParameter("pathImagen");
		Double precio=new Double(request.getParameter("precio"));
		Pelicula newPeli=new Pelicula(titulo,idioma,
				apellidosDirector,nombreDirector,
				precio,coste,disponibilidad,pathImagen);*/
		TestModelo admin=new TestModelo();
		//admin.modificarPelicula(request.getParameter("titulo"),newPeli);*/
		editarPeliculaForm.setPelicula(admin.getPelicula(request.getParameter("titulo")));
		return mapping.findForward("modifPelicula");
	}
	
	public ActionForward modifPeliculaSave(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response){
		System.out.println("Se ha solicitado guardar la modif de una peli");
		EditarPeliculaForm editarPeliculaForm=(EditarPeliculaForm)form;
		System.out.println("Form apellidosDirector:"+editarPeliculaForm.getApellidosDirector());
		String titulo=request.getParameter("titulo");
		System.out.println("titulo:"+titulo);
		String apellidosDirector=request.getParameter("apellidosDirector");
		System.out.println("apellidosDirector: "+apellidosDirector);
		System.out.println(request.getParameter("coste"));
		Double coste=new Double(request.getParameter("coste"));
		Integer disponibilidad=new Integer(request.getParameter("disponibilidad"));
		String idioma=request.getParameter("idioma");
		String nombreDirector=request.getParameter("nombreDirector");
		String pathImagen=request.getParameter("pathImagen");
		Double precio=new Double(request.getParameter("precio"));
		String anyo=request.getParameter("anyo");
		String sinopsis=request.getParameter("sinopsis");
		String reparto=request.getParameter("reparto");
		Pelicula newPeli=new Pelicula(titulo,nombreDirector,apellidosDirector,
				idioma,coste,precio,disponibilidad,pathImagen,anyo,sinopsis,reparto);
		TestModelo admin=new TestModelo();
		admin.modificarPelicula(titulo,newPeli);
		return mapping.findForward("modifPeliculaSave");
	}
	
	public ActionForward nuevaPeliculaSave(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response){
		String titulo=request.getParameter("titulo");
		String apellidosDirector=request.getParameter("apellidosDirector");
		Double coste=new Double(request.getParameter("coste"));
		Integer disponibilidad=new Integer(request.getParameter("disponibilidad"));
		String idioma=request.getParameter("idioma");
		String nombreDirector=request.getParameter("nombreDirector");
		String pathImagen=request.getParameter("pathImagen");
		Double precio=new Double(request.getParameter("coste"));
		String anyo=request.getParameter("anyo");
		String sinopsis=request.getParameter("sinopsis");
		String reparto=request.getParameter("reparto");
		System.out.println(titulo+" "+apellidosDirector+" "+nombreDirector+" "+coste+" "+disponibilidad);
		
		Date fecAcceso=new Date();
		TestModelo admin=new TestModelo();
		admin.crearPelicula(titulo,nombreDirector,apellidosDirector,
				idioma,coste,precio,disponibilidad,pathImagen,anyo,sinopsis,reparto);
		System.out.println("La pelicula se ha creado");
		return mapping.findForward("nuevaPeliculaSave");
	}
}