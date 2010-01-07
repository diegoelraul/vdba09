package modelo.pelicula;
// default package



/**
 * AbstractPelicula entity provides the base persistence definition of the Pelicula entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPelicula  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 50246923212504610L;
	private String titulo;
    private String nombreDirector;
    private String apellidosDirector;
    private String idioma;
    private double coste;
    private double precio;
    private Integer disponibilidad;
    private String pathImagen;
	private String anyo;
	private String sipnosis;

	// Constructors

	/** default constructor */
	public AbstractPelicula() {
	}

	/** minimal constructor */
	public AbstractPelicula(String titulo, double coste, double precio,
			Integer disponibilidad) {
		this.titulo = titulo;
		this.coste = coste;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
	}

	/** full constructor */
	public AbstractPelicula(String titulo, String nombreDirector,
			String apellidosDirector, String idioma, double coste,
			double precio, Integer disponibilidad, String pathImagen,
			String anyo, String sipnosis) {
		this.titulo = titulo;
		this.nombreDirector = nombreDirector;
		this.apellidosDirector = apellidosDirector;
		this.idioma = idioma;
		this.coste = coste;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		this.pathImagen = pathImagen;
		this.anyo = anyo;
		this.sipnosis = sipnosis;
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

	public String getAnyo() {
		return this.anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public String getSipnosis() {
		return this.sipnosis;
	}

	public void setSipnosis(String sipnosis) {
		this.sipnosis = sipnosis;
	}

    public String toString(){
    	return ("titulo: " + titulo +";Director: " + nombreDirector + " " + apellidosDirector);
    }
    








}