package modelo.reparto;
// default package



/**
 * RepartoId entity. @author MyEclipse Persistence Tools
 */
public class RepartoId extends AbstractRepartoId implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2968823121555458467L;


	// Constructors

    /** default constructor */
    public RepartoId() {
    }

    
    /** full constructor */
    public RepartoId(String titulo, String nombre, String apellidos) {
        super(titulo, nombre, apellidos);        
    }
   
}
