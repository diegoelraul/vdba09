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
    public Pelicula(String titulo) {
        super(titulo);        
    }
    
    /** full constructor */
    public Pelicula(String titulo, String nombreDirector, String apellidosDirector, String idioma, double coste, double precio, Integer disponibilidad, String pathImagen) {
        super(titulo, nombreDirector, apellidosDirector, idioma, coste, precio, disponibilidad, pathImagen);        
    }
   
}
