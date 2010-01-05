package modelo.reparto;
// default package



/**
 * AbstractRepartoId entity provides the base persistence definition of the RepartoId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRepartoId  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 197544057335120847L;
	private String titulo;
     private String nombre;
     private String apellidos;


    // Constructors

    /** default constructor */
    public AbstractRepartoId() {
    }

    
    /** full constructor */
    public AbstractRepartoId(String titulo, String nombre, String apellidos) {
        this.titulo = titulo;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

   
    // Property accessors

    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractRepartoId) ) return false;
		 AbstractRepartoId castOther = ( AbstractRepartoId ) other; 
         
		 return ( (this.getTitulo()==castOther.getTitulo()) || ( this.getTitulo()!=null && castOther.getTitulo()!=null && this.getTitulo().equals(castOther.getTitulo()) ) )
 && ( (this.getNombre()==castOther.getNombre()) || ( this.getNombre()!=null && castOther.getNombre()!=null && this.getNombre().equals(castOther.getNombre()) ) )
 && ( (this.getApellidos()==castOther.getApellidos()) || ( this.getApellidos()!=null && castOther.getApellidos()!=null && this.getApellidos().equals(castOther.getApellidos()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTitulo() == null ? 0 : this.getTitulo().hashCode() );
         result = 37 * result + ( getNombre() == null ? 0 : this.getNombre().hashCode() );
         result = 37 * result + ( getApellidos() == null ? 0 : this.getApellidos().hashCode() );
         return result;
   }   





}