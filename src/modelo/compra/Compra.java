package modelo.compra;

// default package

/**
 * Compra entity. @author MyEclipse Persistence Tools
 */
public class Compra extends AbstractCompra implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = -9145593327511505698L;


	/** default constructor */
	public Compra() {
	}

	/** minimal constructor */
	public Compra(CompraId id, String formaPago) {
		super(id, formaPago);
	}

	/** full constructor */
	public Compra(CompraId id, String direccion, String formaPago,
			String numTarjeta) {
		super(id, direccion, formaPago, numTarjeta);
	}
   
}
