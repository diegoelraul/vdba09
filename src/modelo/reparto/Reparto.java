package modelo.reparto;
// default package



/**
 * Reparto entity. @author MyEclipse Persistence Tools
 */
public class Reparto extends AbstractReparto implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2213246079460803192L;

	// Constructors

    /** default constructor */
    public Reparto() {
    }

	/** minimal constructor */
    public Reparto(RepartoId id) {
        super(id);        
    }
    
    /** full constructor */
    public Reparto(RepartoId id, String personaje) {
        super(id, personaje);        
    }
   
}
