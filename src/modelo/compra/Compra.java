package modelo.compra;
// default package

/**
 * Compra entity. @author MyEclipse Persistence Tools
 */

public class Compra implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7192086200661594089L;
	private CompraId id;

	// Constructors

	/** default constructor */
	public Compra() {
	}

	/** full constructor */
	public Compra(CompraId id) {
		this.id = id;
	}

	// Property accessors

	public CompraId getId() {
		return this.id;
	}

	public void setId(CompraId id) {
		this.id = id;
	}

}