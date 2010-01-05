package modelo.compra;

import modelo.compra.AbstractCompra;
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

    
    /** full constructor */
    public Compra(CompraId id) {
        super(id);        
    }
   
}
