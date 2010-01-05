package modelo.usuario;
// default package

import java.util.Date;


/**
 * Usuario entity. @author MyEclipse Persistence Tools
 */
public class Usuario extends AbstractUsuario implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 8416823229638920868L;

	/** default constructor */
    public Usuario() {
    }

	/** minimal constructor */
    public Usuario(String idUsuario) {
        super(idUsuario);        
    }
    
    /** full constructor */
    public Usuario(String idUsuario, String password, Date fecAcceso) {
        super(idUsuario, password, fecAcceso);        
    }
   
}
