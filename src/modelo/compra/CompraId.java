package modelo.compra;
// default package

import java.util.Date;

/**
 * CompraId entity. @author MyEclipse Persistence Tools
 */

public class CompraId implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -5504607767817645063L;
	private String usuario;
	private String pelicula;
	private Date fecCompra;

	// Constructors

	/** default constructor */
	public CompraId() {
	}

	/** full constructor */
	public CompraId(String usuario, String pelicula, Date fecCompra) {
		this.usuario = usuario;
		this.pelicula = pelicula;
		this.fecCompra = fecCompra;
	}

	// Property accessors

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPelicula() {
		return this.pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public Date getFecCompra() {
		return this.fecCompra;
	}

	public void setFecCompra(Date fecCompra) {
		this.fecCompra = fecCompra;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CompraId))
			return false;
		CompraId castOther = (CompraId) other;

		return ((this.getUsuario() == castOther.getUsuario()) || (this
				.getUsuario() != null
				&& castOther.getUsuario() != null && this.getUsuario().equals(
				castOther.getUsuario())))
				&& ((this.getPelicula() == castOther.getPelicula()) || (this
						.getPelicula() != null
						&& castOther.getPelicula() != null && this
						.getPelicula().equals(castOther.getPelicula())))
				&& ((this.getFecCompra() == castOther.getFecCompra()) || (this
						.getFecCompra() != null
						&& castOther.getFecCompra() != null && this
						.getFecCompra().equals(castOther.getFecCompra())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUsuario() == null ? 0 : this.getUsuario().hashCode());
		result = 37 * result
				+ (getPelicula() == null ? 0 : this.getPelicula().hashCode());
		result = 37 * result
				+ (getFecCompra() == null ? 0 : this.getFecCompra().hashCode());
		return result;
	}

}