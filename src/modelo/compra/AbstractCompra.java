package modelo.compra;

// default package



/**
 * AbstractCompra entity provides the base persistence definition of the Compra entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCompra  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 2659159782761690152L;
	private CompraId id;
	private String direccion;
	private String formaPago;
	private String numTarjeta;


    // Constructors

	/** default constructor */
	public AbstractCompra() {
	}

	/** minimal constructor */
	public AbstractCompra(CompraId id, String formaPago) {
		this.id = id;
		this.formaPago = formaPago;
	}

	/** full constructor */
	public AbstractCompra(CompraId id, String direccion, String formaPago,
			String numTarjeta) {
		this.id = id;
		this.direccion = direccion;
		this.formaPago = formaPago;
		this.numTarjeta = numTarjeta;
	}


	public CompraId getId() {
        return this.id;
    }
    
    public void setId(CompraId id) {
        this.id = id;
    }
    
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public String getNumTarjeta() {
		return this.numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
   








}