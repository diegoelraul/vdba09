package modelo.usuario;
// default package

import java.util.Date;


/**
 * AbstractUsuario entity provides the base persistence definition of the Usuario entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsuario  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -8034712049743081531L;
	private String idUsuario;
     private String password;
     private Date fecAcceso;


    // Constructors

    /** default constructor */
    public AbstractUsuario() {
    }

	/** minimal constructor */
    public AbstractUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    /** full constructor */
    public AbstractUsuario(String idUsuario, String password, Date fecAcceso) {
        this.idUsuario = idUsuario;
        this.password = password;
        this.fecAcceso = fecAcceso;
    }

   
    // Property accessors

    public String getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFecAcceso() {
        return this.fecAcceso;
    }
    
    public void setFecAcceso(Date fecAcceso) {
        this.fecAcceso = fecAcceso;
    }
   








}