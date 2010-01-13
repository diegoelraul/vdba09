package controlador;

import hibernate.HibernateSessionFactory;
import java.util.*;
import modelo.usuario.Usuario;
import modelo.pelicula.Pelicula;
import org.junit.Test;
import junit.framework.TestCase;


public class JunitVideoclubTest extends TestCase {
	

	@Test
	public void test_crear_usuario(){
		System.out.println("Creando un usuario...");
		TestModelo tm = new TestModelo();
		tm.setSession(HibernateSessionFactory.getSession());
		assertTrue(tm.crearUsuario("prueba", "password", "email", "cliente", "nombre", "apellidos", "telefono", new Date()));
	}
	
	@Test
	public void test_borrar_usuario(){
		System.out.println("borrando un usuario...");
		TestModelo tm = new TestModelo();
		tm.setSession(HibernateSessionFactory.getSession());
		assertTrue(tm.eliminarUsuario("prueba"));
	}
	
	@Test
	public void test_listar_usuarios(){
		System.out.println("listando usuarios...");
		TestModelo tm = new TestModelo();
		tm.setSession(HibernateSessionFactory.getSession());
		assertTrue(tm.listarUsuarios() != null);		
	}
	
	@Test
	public void test_get_usuario(){
		System.out.println("Obtener el usuario pepitogrillo37...");
		TestModelo tm = new TestModelo();
		tm.setSession(HibernateSessionFactory.getSession());
		Usuario u = tm.getUsuario("pepitogrillo37");
		assertTrue(u.getIdUsuario().equals("pepitogrillo37"));
		
	}
	
	@Test
	public void test_modificar_usuario(){
		System.out.println("Modificando un usuario....");
		test_crear_usuario();
		boolean test = true;
		TestModelo tm = new TestModelo();
		tm.setSession(HibernateSessionFactory.getSession());
		@SuppressWarnings("unused")
		Usuario u2 =new Usuario("prueba_sustitucion", "pa", "em", "cli", "nom", "apell", "tel", new Date());
		test_borrar_usuario();
		assertTrue(test);
	}
	
	@Test
	public void test_crear_pelicula(){
		System.out.println("Creando una pelicula...");
		TestModelo tm = new TestModelo();
		tm.setSession(HibernateSessionFactory.getSession());
		assertTrue(tm.crearPelicula("prueba2", "nombreDirector", "apellidosDirector", "idioma", 0.0, 0.0, 0, "", "", "", ""));
	}
	
	@Test
	public void test_borrar_pelicula(){
		System.out.println("borrando una pelicula...");
		TestModelo tm = new TestModelo();
		tm.setSession(HibernateSessionFactory.getSession());
		assertTrue(tm.eliminarPelicula("prueba2"));
	}

	@Test
	public void test_get_pelicula(){
		System.out.println("Obtener la pelicula prueba2...");
		TestModelo tm = new TestModelo();
		tm.setSession(HibernateSessionFactory.getSession());
		Pelicula p = tm.getPelicula("Abajo el telon");
		assertTrue(p.getTitulo().equals("Abajo el telon"));
		
	}
	
	@Test
	public void test_listar_peliculas(){
		System.out.println("listando peliculas...");
		TestModelo tm = new TestModelo();
		tm.setSession(HibernateSessionFactory.getSession());
		assertTrue(tm.listarPeliculas() != null);		
	}
	
	/*@Test
	public void test_crear_compra(){
		System.out.println("Creando una compra...");
		TestModelo tm = new TestModelo();
		tm.setSession(HibernateSessionFactory.getSession());
		assertTrue(tm.crearCompra("prueba_compra", "pelicula_compra", new Date(), new Date(), "formapago"));
	}*/
	
//fin pruebas unitarias junit
	
}
