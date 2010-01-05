package modelo.pelicula;
// default package

/**
 * Pelicula entity. @author MyEclipse Persistence Tools
 */

public class Pelicula implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3140373405590068295L;
	private String titulo;
	private String nombreDirector;
	private String apellidosDirector;
	private String idioma;
	private double coste;
	private double precio;
	private Integer disponibilidad;
	private String pathImagen;

	// Constructors

	/** default constructor */
	public Pelicula() {
	}

	/** minimal constructor */
	public Pelicula(String titulo) {
		this.titulo = titulo;
	}

	/** full constructor */
	public Pelicula(String titulo, String nombreDirector,
			String apellidosDirector, String idioma, double coste,
			double precio, Integer disponibilidad, String pathImagen) {
		this.titulo = titulo;
		this.nombreDirector = nombreDirector;
		this.apellidosDirector = apellidosDirector;
		this.idioma = idioma;
		this.coste = coste;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		this.pathImagen = pathImagen;
	}

	// Property accessors

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombreDirector() {
		return this.nombreDirector;
	}

	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}

	public String getApellidosDirector() {
		return this.apellidosDirector;
	}

	public void setApellidosDirector(String apellidosDirector) {
		this.apellidosDirector = apellidosDirector;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public double getCoste() {
		return this.coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Integer getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(Integer disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getPathImagen() {
		return this.pathImagen;
	}

	public void setPathImagen(String pathImagen) {
		this.pathImagen = pathImagen;
	}

}