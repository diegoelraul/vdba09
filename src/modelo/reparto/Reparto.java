package modelo.reparto;
// default package

/**
 * Reparto entity. @author MyEclipse Persistence Tools
 */

public class Reparto implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -4403158191001188884L;
	private RepartoId id;
	private String personaje;

	// Constructors

	/** default constructor */
	public Reparto() {
	}

	/** minimal constructor */
	public Reparto(RepartoId id) {
		this.id = id;
	}

	/** full constructor */
	public Reparto(RepartoId id, String personaje) {
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

}