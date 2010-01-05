package modelo.usuario;
// default package

import java.util.Date;

/**
 * Usuario entity. @author MyEclipse Persistence Tools
 */

public class Usuario implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 6092596147799824756L;
	private String idUsuario;
	private String password;
	private Date fecAcceso;

	// Constructors

	/** default constructor */
	public Usuario() {
	}

	/** minimal constructor */
	public Usuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	/** full constructor */
	public Usuario(String idUsuario, String password, Date fecAcceso) {
		this.idUsuario = idUsuario;
		this.password = password;
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

	public Date getFecAcceso() {
		return this.fecAcceso;
	}

	public void setFecAcceso(Date fecAcceso) {
		this.fecAcceso = fecAcceso;
	}

}