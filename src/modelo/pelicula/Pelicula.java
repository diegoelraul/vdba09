package modelo.pelicula;
// default package



/**
 * Pelicula entity. @author MyEclipse Persistence Tools
 */
public class Pelicula extends AbstractPelicula implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1949961309151142106L;

	/** default constructor */
    public Pelicula() {
    }

	/** minimal constructor */
	public Pelicula(String titulo, double coste, double precio,
			Integer disponibilidad) {
		super(titulo, coste, precio, disponibilidad);
	}
    
    /** full constructor */
    public Pelicula(String titulo, String nombreDirector,
			String apellidosDirector, String idioma, double coste,
			double precio, Integer disponibilidad, String pathImagen,
			String anyo, String sipnosis,String reparto) {
        super(titulo, nombreDirector, apellidosDirector, idioma, coste, precio, disponibilidad, pathImagen,anyo,sipnosis,reparto);        
    }
   
}
