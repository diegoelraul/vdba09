package modelo.usuario;
// default package

import java.util.Date;


/**
 * AbstractUsuario entity provides the base persistence definition of the Usuario entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsuario  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -8034712049743081531L;
	private String idUsuario;
	private String password;
	private String email;
	private String tipo;
	private String nombre;
	private String apellidos;
	private String telefono;
	private Date fecAcceso;


    // Constructors

    /** default constructor */
    public AbstractUsuario() {
    }

	/** minimal constructor */
	public AbstractUsuario(String idUsuario, String password, String email,
			String tipo, Date fecAcceso) {
		this.idUsuario = idUsuario;
		this.password = password;
		this.email = email;
		this.tipo = tipo;
		this.fecAcceso = fecAcceso;
	}

	/** full constructor */
	public AbstractUsuario(String idUsuario, String password, String email,
			String tipo, String nombre, String apellidos, String telefono,
			Date fecAcceso) {
		this.idUsuario = idUsuario;
		this.password = password;
		this.email = email;
		this.tipo = tipo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fecAcceso = fecAcceso;
	}

	// Property accessors

	public String getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecAcceso() {
		return this.fecAcceso;
	}

	public void setFecAcceso(Date fecAcceso) {
		this.fecAcceso = fecAcceso;
	}


}