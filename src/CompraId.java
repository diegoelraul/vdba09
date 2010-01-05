// default package

import java.util.Date;
import modelo.compra.AbstractCompraId;


/**
 * CompraId entity. @author MyEclipse Persistence Tools
 */
public class CompraId extends AbstractCompraId implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1184003658952421530L;


	// Constructors

    /** default constructor */
    public CompraId() {
    }

    
    /** full constructor */
    public CompraId(String usuario, String pelicula, Date fecCompra) {
        super(usuario, pelicula, fecCompra);        
    }
   
}
