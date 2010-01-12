package controlador;

import hibernate.HibernateSessionFactory;

//import org.hibernate.Criteria;
import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import java.util.*;
import modelo.compra.*;
import modelo.pelicula.*;
//import modelo.usuario.*;
//import modelo.reparto.*;

@SuppressWarnings("unused")
public class Pruebas {
	
	public Pruebas(){}
	
	@SuppressWarnings({ "unchecked" })
	public void testLecturaBD() {
		
		try{
		List resultado = null;
		CompraDAO cdao = new CompraDAO();
		resultado = cdao.findAll();
		Iterator ite =((java.util.List) resultado).iterator();
		
		/* se coge el contexto. Ojo a la linea añadida en hibernate.cfg.xml */
    	Session session = HibernateSessionFactory.getSession().getSessionFactory().getCurrentSession();
		
    	//iteramos sobre las compras realizadas...
		while (ite.hasNext()){
			Compra c = (Compra) ite.next();
			System.out.println("Pelicula: " + c.getId().getPelicula() + " Comprado por: " + c.getId().getUsuario());
		}
		
		/* comienzo transaccion bbdd */
		session.beginTransaction();
		/* prueba de salvado. ok */
		//anterior diseño bbdd: 
		//CompraId ci = new CompraId("Eva83", "A, B, C... Manhattan", new Date(2001,11, 03));
		//Compra b = new Compra(ci);
		//cdao.save(b); /* salvar objetos desde session!!! muy importante */
		//session.save(b);
		
		/* más de una transaccion. Metemos una peli */
		//PeliculaDAO pdao = new PeliculaDAO();
		//Pelicula p = new Pelicula("pruebas", "p", "p", "spanish",1.00, 1.00, 12, "nulo" );
		// idem. no funciona. pdao.save(p);
		//session.save(p);
		session.getTransaction().commit();
		// no hace falta. session.close(); aqui
		
		
		} catch (Exception e){
			System.err.print(e.toString());
			HibernateSessionFactory.getSession().getSessionFactory().getCurrentSession().getTransaction().rollback();
		} finally {
			HibernateSessionFactory.getSession().getSessionFactory().getCurrentSession().close();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pruebas p = new Pruebas();
		p.testLecturaBD();
	}

}
