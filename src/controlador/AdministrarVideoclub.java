package controlador;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import hibernate.HibernateSessionFactory;
import java.util.*;

import modelo.compra.*;
import modelo.pelicula.*;
import modelo.reparto.*;
import modelo.usuario.*;

/*
 * 1.Listar las pel�culas del cat�logo de la tienda.
 * 		-> tb. listar reparto para una peli concreta
 * 2.Visualizar los datos de las pel�culas que deseen comprar o consultar. ok. Misma que 1.
 *  extra: verificar disponibilidad
 *  	   reducir disponibles *tras compra. duda
 *  	   
 * Para el caso de los usuarios de tipo administrador
 * 1.Dar de alta nuevas pel�culas en el cat�logo de la tienda.
 *  -> tb. dar de alta reparto
 * 2.Dar de alta nuevos usuarios.
 *  -> tb. dar de alta compra
 * 3.Dar de baja usuarios.
 * 4.Modificar los datos de las pel�culas que temporalmente no est�n disponibles en el almac�n de la tienda.
 * 5.Modificar cualquier informaci�n sobre las pel�culas del cat�logo: T�tulo, Director, Idioma, Reparto, Precio y Disponibilidad.
 * 6.Visualizar los datos de los usuarios registrados: Identificador de usuario, fecha del �ltimo acceso, listado de productos comprados.
 * 7.Recuperar el informe de las ventas realizadas en el d�a y en la �ltima semana, as� como de las correspondientes ganancias.
 * 
 * 
 * a) obtener pel�cula por t�tulo
 * b) a�adir compra
 * c) obtener usuarios 
 * d)Listado pel�culas adquiridas
 * e)ganancia
 * 
 * PENDIENTE DE MODIFICAR O AMPLIAR 
 * 
 */

@SuppressWarnings("unused")
public class AdministrarVideoclub {
	
	
	private Session session;
		
	
	public AdministrarVideoclub () {}
	
	/**
	 * 	 listar reparto para una peli concreta
	 * @return
	 * @throws VideoclubException 
	 */
	@SuppressWarnings("unchecked")
	public Collection<Pelicula> getPeliculasCatalogo() throws VideoclubException{
		
		Collection<Pelicula> ret = null;
		Iterator ite = null;
		//session = HibernateSessionFactory.getSession().getSessionFactory().getCurrentSession();
		
		try{
			ret = new ArrayList<Pelicula>();
			PeliculaDAO pelidao= new PeliculaDAO();
			ite = pelidao.findAll().iterator();
			
			while (ite.hasNext()){
				ret.add((Pelicula) ite.next());
			}
	
		} catch (Exception e){
			throw new VideoclubException(e.getLocalizedMessage());
		}		
		return ret;
	}
	
	/**
	 * 
	 * @param tituloPeli
	 * @return
	 * @throws VideoclubException
	 */
	@SuppressWarnings("unchecked")
	public Collection<Reparto> getReparto(String tituloPeli) throws VideoclubException{
		
		Collection<Reparto> ret = null;
		Iterator ite = null;
		Reparto temp = null;
		session = HibernateSessionFactory.getSession().getSessionFactory().getCurrentSession();
		
		try{
			ret = new ArrayList<Reparto>();
			RepartoDAO redao= new RepartoDAO();
			ite = redao.findAll().iterator();
			//ite = session.createQuery("SELECT * from REPARTO where Titulo = '" + tituloPeli.trim() +"'").iterate();

			while (ite.hasNext()){
				temp = (Reparto) ite.next();
				if (temp.getId().getTitulo().equals(tituloPeli.trim()))
					ret.add(temp);
			}
	
		} catch (Exception e){
			throw new VideoclubException(e.getLocalizedMessage());
		}		
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	public Collection<RepartoId> getReparto2(String tituloPeli) throws VideoclubException{
		
		ArrayList<RepartoId> ret = null;
		Iterator ite = null;
		Reparto temp = null;
		session = HibernateSessionFactory.getSession().getSessionFactory().getCurrentSession();
		session.getTransaction().begin();
		Criteria c =session.createCriteria(RepartoId.class).add(Restrictions.eq("titulo",tituloPeli.trim()));
		ite = c.list().iterator();
		session.getTransaction().commit();
		ret = new ArrayList<RepartoId>();
		while (ite.hasNext())
			ret.add( ((RepartoId) ite.next()));
		
			
		return ret;
	}
		
	/**
	 * 
	 * @param c
	 */
	private void mostrarColeccion(Collection<?> c){
		Iterator<?> ite = c.iterator();
		while(ite.hasNext()) System.out.println(ite.next().toString());		
	}
	
	public static void main (String[] pepe) throws VideoclubException{
		
		AdministrarVideoclub av = new AdministrarVideoclub();
		
		av.mostrarColeccion(av.getPeliculasCatalogo());
		System.out.println("Reparto de la peli Abajo el Telon:");
		av.mostrarColeccion(av.getReparto("Abajo el Telon"));
	}
	
	

}
