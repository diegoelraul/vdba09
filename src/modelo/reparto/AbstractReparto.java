package modelo.reparto;
// default package



/**
 * AbstractReparto entity provides the base persistence definition of the Reparto entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractReparto  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 7618607538996924113L;
	private RepartoId id;
     private String personaje;


    // Constructors

    /** default constructor */
    public AbstractReparto() {
    }

	/** minimal constructor */
    public AbstractReparto(RepartoId id) {
        this.id = id;
    }
    
    /** full constructor */
    public AbstractReparto(RepartoId id, String personaje) {
        this.id = id;
        this.personaje = personaje;
    }

   
    // Property accessors

    public RepartoId getId() {
        return this.id;
    }
    
    public void setId(RepartoId id) {
        this.id = id;
    }

    public String getPersonaje() {
        return this.personaje;
    }
    
    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
    
    public String toString(){
    	return (this.getId().getNombre() + " " + this.getId().getNombre() +" -> personaje: " + this.getPersonaje());
    }
   








}