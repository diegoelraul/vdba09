package controlador;

import hibernate.HibernateSessionFactory;

//import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.*;
import modelo.compra.*;
import modelo.pelicula.*;
//import modelo.usuario.*;
//import modelo.reparto.*;

public class Pruebas {
	
	
	
	//private static SessionFactory sessionFactory;
	private HibernateSessionFactory hibernateSessionFactory;
	
	public Pruebas(){}
	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public void testLecturaBD() {
		
		try{
		List resultado = null;
		CompraDAO cdao = new CompraDAO();
		resultado = cdao.findAll();
		Iterator ite =((java.util.List) resultado).iterator();
		
		
    	Session session = HibernateSessionFactory.getSession().getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
		
		Compra c = null; //(Compra) resultado.get(0);
		
		while (ite.hasNext()){
			c = (Compra) ite.next();
			System.out.println("Pelicula: " + c.getId().getPelicula() + " Comprado por: " + c.getId().getUsuario());
		}
		
		/* prueba de salvado. ok */
		cdao = new CompraDAO();
		CompraId ci = new CompraId("Eva83", "A, B, C... Manhattan", new Date(2001,11, 03));
		Compra b = new Compra(ci);
		
		cdao.save(b);
		HibernateSessionFactory.getSession().flush();
		/*
		cdao = new CompraDAO();
		ci = new CompraId("Eva83", "Nabonga, el gorila", new Date(2001,11, 03));
		b = new Compra(ci);
		
		cdao.save(b);
		*/
		PeliculaDAO pdao = new PeliculaDAO();
		
		Pelicula p = new Pelicula("pruebas", "p", "p", "spanish",1.00, 1.00, 12, "nulo" );
		pdao.save(p);
		
		
		//super(titulo, nombreDirector, apellidosDirector, idioma, coste, precio, disponibilidad, pathImagen); 
		
		tx.commit();
		HibernateSessionFactory.closeSession();
		//session.close()
		} catch (Exception e){
			System.out.println(e.toString());
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
