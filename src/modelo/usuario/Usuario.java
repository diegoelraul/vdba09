package modelo.usuario;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Usuario entity. @author MyEclipse Persistence Tools
 */
public class Usuario extends AbstractUsuario implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 8416823229638920868L;
	
	@SuppressWarnings("unchecked")
	private Set peliculas = new HashSet();

	/** default constructor */
	public Usuario() {
	}

	/** minimal constructor */
	public Usuario(String idUsuario, String password, String email,
			String tipo, Date fecAcceso) {
		super(idUsuario, password, email, tipo, fecAcceso);
	}

	/** full constructor */
	public Usuario(String idUsuario, String password, String email,
			String tipo, String nombre, String apellidos, String telefono,
			Date fecAcceso) {
		super(idUsuario, password, email, tipo, nombre, apellidos, telefono,
				fecAcceso);
	}
	/** métodos set hibernate **/
	@SuppressWarnings("unchecked")
	public Set getPeliculas() {
		return peliculas;
	}
	
	@SuppressWarnings("unchecked")
	public void setPeliculas(Set peliculas){
		this.peliculas = peliculas;
	}
}
