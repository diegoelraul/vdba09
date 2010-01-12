package controlador;

import hibernate.HibernateSessionFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Date;

import modelo.*;
import modelo.usuario.*;
import modelo.compra.*;
import modelo.pelicula.*;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;

import java.text.SimpleDateFormat;


public class TestModelo {
	private Session session;
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			TestModelo libraryTest=new TestModelo();
			libraryTest.setSession(HibernateSessionFactory.getSession());
			//libraryTest.crearUsuario();
			//libraryTest.eliminarUsuario("Karl2");
			//libraryTest.listarUsuarios();
			//libraryTest.getUsuario("Karl");
			//libraryTest.crearPelicula("ABAJO EL GORILA","Swapanglish","Jardemor","Condemor",10,5.999,2.000,"vacio");
			//libraryTest.getPelicula("Abajo el telon");
			//libraryTest.eliminarPelicula("Abajo el gorila");
			//libraryTest.listarPeliculas();
			//libraryTest.listarReparto("Abajo el telon");
			//libraryTest.getReparto("Abajo el Telon","Mario","Moreno");
			libraryTest.listarCompras();
			//libraryTest.createCustomer();
			//libraryTest.createRelation();
			//libraryTest.deleteCustomer();
			//libraryTest.listBooks();
			//libraryTest.getSession().close();
		}catch(HibernateException e){
			e.printStackTrace();
		}
		
	}
// ----------------------------
// Gestión de datos de Usuarios
// ----------------------------
	public Boolean crearUsuario(String idUsuario, String password, String email,
			String tipo, String nombre, String apellidos, String telefono,
			Date fecAcceso){
		System.out.println("create user");
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			UsuarioDAO usuarioDAO=new UsuarioDAO();
			usuarioDAO.save(new Usuario(idUsuario.trim(),  password,  email,
					 tipo,  nombre,  apellidos,  telefono,
						fecAcceso));
			
			 
			//session.save(usuario);
			tx.commit();
			return true;
		}catch(HibernateException e){
			System.out.println("El usuario que quiere crear ya existe.");
			rollback(tx);
			e.printStackTrace();
		}
		return false;
	}
	
	public Boolean eliminarUsuario(String idUsuario){
		System.out.println("eliminar usuario");
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		
		try{
			UsuarioDAO usuarioDAO=new UsuarioDAO();
			Usuario tofind=(Usuario)session.get(Usuario.class,idUsuario);
			if(tofind==null)System.out.println("El usuario especificado no existe");
			else{
				usuarioDAO.delete(tofind);
				tx.commit();
				System.out.println("El usuario ha sido eliminado");
				return true;
			}
			
		}catch(HibernateException e){
			System.out.println("El usuario especificado no existe");
			rollback(tx);
			e.printStackTrace();
		}
		
		return false;
	}
	
	public Usuario[] listarUsuarios(){
		System.out.println("listar usuarios");
		List usuarios=new ArrayList();
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			UsuarioDAO usuarioDAO=new UsuarioDAO();
			usuarios=usuarioDAO.findAll();
			for(Iterator iter=usuarios.iterator();iter.hasNext();){
				System.out.println(((Usuario)iter.next()).getIdUsuario());
			}
			tx.commit();
		}catch(HibernateException e){
			System.out.println("No se ha podido obtener info de usuarios");
			rollback(tx);
			e.printStackTrace();
		}
		return (Usuario[])usuarios.toArray(new Usuario[0]);
	}
	
	public Usuario getUsuario(String usuarioId){
		System.out.println("getUsuario:"+usuarioId);
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			Usuario tofind=(Usuario)session.get(Usuario.class,usuarioId);
			if(tofind==null)
				System.out.println("El usuario especificado no existe");
			else{
				System.out.println(tofind);
				tx.commit();
				return tofind;
			}
		}catch(HibernateException e){
			rollback(tx);
			e.printStackTrace();
		}
		return null;
	}
	
	public Boolean modificarUsuario(String idUsuario, Usuario newUser){
		Usuario old=getUsuario(idUsuario);
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			old.setIdUsuario(newUser.getIdUsuario());
			old.setPassword(newUser.getPassword());
			old.setFecAcceso(newUser.getFecAcceso());
			tx.commit();
		}catch(HibernateException e){
			rollback(tx);
			e.printStackTrace();
			return false;
		}
		return true;
	}

// ----------------------------
// Gestión de datos de Peliculas
// ----------------------------
	public Boolean crearPelicula(String titulo, String nombreDirector,
			String apellidosDirector, String idioma, double coste,
			double precio, Integer disponibilidad, String pathImagen,
			String anyo, String sinopsis,String reparto){
		System.out.println("crear pelicula");
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			PeliculaDAO peliculaDAO=new PeliculaDAO();
			peliculaDAO.save(new Pelicula(titulo,nombreDirector,apellidosDirector,
					idioma,coste,precio,disponibilidad,pathImagen,anyo,sinopsis,reparto));
			tx.commit();
			return true;
		}catch(HibernateException e){
			rollback(tx);
			e.printStackTrace();
		}
		return false;
	}

	public Boolean eliminarPelicula(String titulo){
		System.out.println("eliminar pelicula");
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			PeliculaDAO peliculaDAO=new PeliculaDAO();
			Pelicula tofind=(Pelicula)session.get(Pelicula.class,titulo);
			if(tofind==null)System.out.println("La pelicula especificada no existe");
			else{
				peliculaDAO.delete(tofind);
				tx.commit();
				System.out.println("La pelicula ha sido eliminada");
				return true;
			}

		}catch(HibernateException e){
			System.out.println("La pelicula especificada no existe");
			rollback(tx);
			e.printStackTrace();
		}

		return false;
	}

	public Pelicula[] listarPeliculas(){
		System.out.println("listar peliculas");
		List peliculas=new ArrayList();
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			PeliculaDAO peliculaDAO=new PeliculaDAO();
			peliculas=peliculaDAO.findAll();
			for(Iterator iter=peliculas.iterator();iter.hasNext();){
				Pelicula aux=(Pelicula)iter.next();
				//System.out.println(aux.getTitulo()+" "+aux.getSinopsis());
			}
			tx.commit();
		}catch(HibernateException e){
			System.out.println("No se ha podido obtener info de peliculas");
			rollback(tx);
			e.printStackTrace();
		}
		return (Pelicula[])peliculas.toArray(new Pelicula[0]);
	}

	public Pelicula getPelicula(String titulo){
			System.out.println("getPelicula");
			setSession(HibernateSessionFactory.getSession());
			Transaction tx=session.beginTransaction();
			try{
				Pelicula tofind=(Pelicula)session.get(Pelicula.class,titulo);
				if(tofind==null)
					System.out.println("La pelicula especificada no existe");
				else{
					//System.out.println(tofind.getSinopsis());
					tx.commit();
					return tofind;
				}
			}catch(HibernateException e){
				rollback(tx);
				e.printStackTrace();
			}
			return null;
	}
	
	public Boolean modificarPelicula(String titulo, Pelicula newPeli){
		System.out.println("Se ha solicitado modificar la película: "+titulo);
		Pelicula old=getPelicula(titulo);
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			old.setTitulo(newPeli.getTitulo());
			old.setNombreDirector(newPeli.getNombreDirector());
			old.setApellidosDirector(newPeli.getApellidosDirector());
			old.setIdioma(newPeli.getIdioma());
			old.setCoste(newPeli.getCoste());
			old.setPrecio(newPeli.getPrecio());
			old.setPathImagen(newPeli.getPathImagen());
			old.setDisponibilidad(newPeli.getDisponibilidad());
			tx.commit();
		}catch(HibernateException e){
			rollback(tx);
			e.printStackTrace();
			return false;
		}
		return true;
	}
// ----------------------------
// Gestión de datos de Reparto
// ----------------------------
/*	public Boolean crearReparto(String titulo,String nombre,String apellidos,String personaje){
		System.out.println("crear reparto");
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			RepartoDAO repartoDAO=new RepartoDAO();
			// Esta parte puede eliminarse ya que la BBDD tiene configurada
			// la relación CASCADE UPDATE y DELETE, sólo es un control extra
			// para verificar que la película existe en BBDD.
			Pelicula target=(Pelicula)session.get(Pelicula.class,titulo);
			if(target==null)System.out.println("La pelicula a la que hace referencia no existe.");
			else{
				repartoDAO.save(new Reparto(new RepartoId(titulo,nombre,apellidos),personaje));
				tx.commit();
				return true;
			}
		}catch(HibernateException e){
			System.out.println("El registro ya existe en BBDD.");
			rollback(tx);
			e.printStackTrace();
		}
		return false;
	}

	public Boolean eliminarReparto(String titulo,String nombre,String apellidos){
		System.out.println("eliminar reparto");
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			RepartoDAO repartoDAO=new RepartoDAO();
			RepartoId tofindId=new RepartoId(titulo,nombre,apellidos);
			Reparto tofind=(Reparto)session.get(Reparto.class,tofindId);
			if(tofind==null)System.out.println("El registro no existe");
			else{
				repartoDAO.delete(tofind);
				tx.commit();
				System.out.println("Se ha eliminado el registro");
				return true;
			}

		}catch(HibernateException e){
			System.out.println("El registro no existe");
			rollback(tx);
			e.printStackTrace();
		}

		return false;
	}
	
	public void eliminarReparto(Reparto reparto){
		System.out.println("Se va a eliminar reparto");
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			RepartoDAO repartoDAO=new RepartoDAO();
			repartoDAO.delete(reparto);
		}catch(HibernateException e){
			System.out.println("El registro no existe");
			rollback(tx);
			e.printStackTrace();
		}
		
	}

	public Reparto[] listarReparto(String titulo){
		System.out.println("listar reparto de: "+titulo);
		List reparto=new ArrayList();
		List res=new ArrayList();
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			/*Criteria criterio=session.createCriteria(RepartoId.class).add(Expression.like("titulo",titulo,MatchMode.ANYWHERE));
					repartoId=criterio.list();
					System.out.println(repartoId.size());
					reparto=criterio.list();
					for(Iterator iter=repartoId.iterator();iter.hasNext();){
						reparto.add((Reparto)session.get(Reparto.class,(RepartoId)iter.next()));
					}*/
/*			RepartoDAO repartoDAO=new RepartoDAO();
			reparto=repartoDAO.findAll();
			for(Iterator iter=reparto.iterator();iter.hasNext();){
				Reparto aux=(Reparto)iter.next();
				System.out.println(aux.getId().getTitulo());
				if(aux.getId().getTitulo().trim().toUpperCase().equals(titulo.trim().toUpperCase())){
					res.add(aux);
					System.out.println(aux.getPersonaje());
				}
			}
			tx.commit();
		}catch(HibernateException e){
			System.out.println("No se ha podido obtener info de reparto");
			rollback(tx);
			e.printStackTrace();
		}
		return (Reparto[])res.toArray(new Reparto[0]);

	}

	public Reparto getReparto(String titulo,String nombre,String apellidos){
		System.out.println("getReparto");
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			Reparto tofind=(Reparto)session.get(Reparto.class,new RepartoId(titulo.trim(),nombre.trim(),apellidos.trim()));
			if(tofind==null)
				System.out.println("El registro especificado no existe");
			else{
				System.out.println(tofind.getPersonaje());
				tx.commit();
				return tofind;
			}
		}catch(HibernateException e){
			rollback(tx);
			e.printStackTrace();
		}
		return null;
	}
*/
// ----------------------------
// Gestión de datos de Compra
// ----------------------------
	public Boolean crearCompra(String usuario,String pelicula,Date fecha,Date hora,String formapago){
		System.out.println("crear Compra");
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			CompraDAO compraDAO=new CompraDAO();
			CompraId compraID=new CompraId(usuario,pelicula,fecha,hora);
			compraDAO.save(new Compra(compraID,formapago));
			tx.commit();
			return true;
		
		}catch(HibernateException e){
			System.out.println("El registro ya existe en BBDD.");
			rollback(tx);
			e.printStackTrace();
		}
		return false;
	}

	public Compra[] listarCompras(){
		System.out.println("listar compras");
		List compra=new ArrayList();
		List res=new ArrayList();
		setSession(HibernateSessionFactory.getSession());
		Transaction tx=session.beginTransaction();
		try{
			CompraDAO compraDAO=new CompraDAO();
			compra=compraDAO.findAll();
			for(Iterator iter=compra.iterator();iter.hasNext();){
				Compra aux=(Compra)iter.next();
				res.add(aux);
				System.out.println(aux.getId().getUsuario()+" "+aux.getId().getPelicula());
			}
			tx.commit();
		}catch(HibernateException e){
			System.out.println("No se ha podido obtener info de compra");
			rollback(tx);
			e.printStackTrace();
		}
		return (Compra[])res.toArray(new Compra[0]);
	}
	
	public String validatePassword(String usuario,String password){
		System.out.println("Se ha solicitado verificar al usuario: "+usuario);
		try{
			Usuario user=getUsuario(usuario);//(new UsuarioDAO()).findById(usuario);
			if(user==null)return "NE";
			if(user.getPassword().equals(password))return "OK";
			
		}catch(HibernateException e){
			System.out.println("No se han podido verificar los datos de usuario");
			e.printStackTrace();
		}return "PW";
	}
	public String getPerfil(String usuario){
		try{
			return getUsuario(usuario).getTipo();
		}catch(HibernateException e){
			System.out.println("No se podido obtener el perfil del usuario");
			e.printStackTrace();
		}
		return "guest";
	}
/*
	public Compra getCompra(String titulo,String nombre,String apellidos){
		System.out.println("getCompra");
		Transaction tx=session.beginTransaction();
		try{
			Compra tofind=(Compra)session.get(Compra.class,new CompraId(titulo.trim(),nombre.trim(),apellidos.trim()));
			if(tofind==null)
				System.out.println("El registro especificado no existe");
			else{
				System.out.println(tofind.getPersonaje());
				tx.commit();
				return tofind;
			}
		}catch(HibernateException e){
			rollback(tx);
			e.printStackTrace();
		}
		return null;
	}

	
*/
// --------------------------------------------------
// Realiza un Rollback de Transaction de forma segura
// --------------------------------------------------
	public void rollback(Transaction t){
		if(t!=null){
			try{
				t.rollback();
			}catch(Exception e){
				System.out.println("No se ha podido realizar tx.rollback()");
				e.printStackTrace();
			}
		}
	}
	
	public Session getSession(){
		return session;
	}
	
	public void setSession(Session s){
		this.session=s;
	}
	
}