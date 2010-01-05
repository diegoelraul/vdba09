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


    // Constructors

    /** default constructor */
    public AbstractCompra() {
    }

    
    /** full constructor */
    /*
    public AbstractCompra(CompraId id) {
        this.id = id;
    }
    */

   
    // Property accessors

    public AbstractCompra(CompraId id2) {
		// TODO Auto-generated constructor stub
    	this.id = id2;
	}


	public CompraId getId() {
        return this.id;
    }
    
    public void setId(CompraId id) {
        this.id = id;
    }
   








}