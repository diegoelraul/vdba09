package modelo.compra;
// default package

import java.util.Date;


/**
 * AbstractCompraId entity provides the base persistence definition of the CompraId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCompraId  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -5126328569002189498L;
	private String usuario;
    private String pelicula;
    private Date fecCompra;
 	private Date hora;


    // Constructors

    /** default constructor */
    public AbstractCompraId() {
    }

    
    /** full constructor */
	/** full constructor */
	public AbstractCompraId(String usuario, String pelicula, Date fecCompra,
			Date hora) {
		this.usuario = usuario;
		this.pelicula = pelicula;
		this.fecCompra = fecCompra;
		this.hora = hora;
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
   
	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}


	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCompraId))
			return false;
		AbstractCompraId castOther = (AbstractCompraId) other;

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
						.getFecCompra().equals(castOther.getFecCompra())))
				&& ((this.getHora() == castOther.getHora()) || (this.getHora() != null
						&& castOther.getHora() != null && this.getHora()
						.equals(castOther.getHora())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUsuario() == null ? 0 : this.getUsuario().hashCode());
		result = 37 * result
				+ (getPelicula() == null ? 0 : this.getPelicula().hashCode());
		result = 37 * result
				+ (getFecCompra() == null ? 0 : this.getFecCompra().hashCode());
		result = 37 * result
				+ (getHora() == null ? 0 : this.getHora().hashCode());
		return result;
	}   





}