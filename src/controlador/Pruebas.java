package controlador;

//import hibernate.HibernateSessionFactory;

//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import java.util.*;
import modelo.compra.*;
//import modelo.pelicula.*;
//import modelo.usuario.*;
//import modelo.reparto.*;

public class Pruebas {
	
	//private static SessionFactory sessionFactory;
	//@SuppressWarnings("unused")
	//private HibernateSessionFactory hibernateSessionFactory;
	
	@SuppressWarnings("unchecked")
	public static void testLecturaBD() {
		
		List resultado = null;
		CompraDAO cdao = new CompraDAO();
		resultado = cdao.findAll();
		Iterator ite =((java.util.List) resultado).iterator();
		
		Compra c = null; //(Compra) resultado.get(0);
		
		/* POR FIN!!!! */
		//System.out.println(c.getId().getPelicula());
		
		while (ite.hasNext()){
			c = (Compra) ite.next();
			System.out.println("Pelicula: " + c.getId().getPelicula() + " Comprado por: " + c.getId().getUsuario());
		}
		
		
		
		
		
		/* A tomar por saco. Ahora se hace de manera distinta. */
		/*
		Criteria criterio = null;
		
		
		try {
			sessionFactory = HibernateSessionFactory.getSession().getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			CompraDAO cdao = new CompraDAO();
			
			resultado = cdao.findAll();
			
			
			criterio = session.createCriteria(Compra.class);
			resultado = criterio.list();
			tx.commit();
			
			for (Iterator iterator =((java.util.List) resultado).iterator(); iterator.hasNext();){
				Compra c = (Compra) iterator.next();
				
				//System.out.println("compra realizada por " + compra.);
			}
			
			
			
		} catch (Exception e){}
		
		*/
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testLecturaBD();
	}

}
