package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import java.util.HashMap;
import java.util.regex.*;
/**
 * @author Guille
 *
 */
public class EmailValidationFilter implements Filter{
	
	/* Dani, como no s� como se llama la variable que especifique�s, lo dejo aqui en una constante. S�lo asegurante de
	 * que la constante tiene el mismo nombre que el par�metro de la password que recoge el filtro del ServletRequest req
	 */
	private final static String PARAM_EMAIL ="email"; //por ejemplo. no lo s�.
	/*
	 * y esta otra para que definas la p�gina de error si no se valida el email
	 */
	private final static String PAG_ERROR_EMAIL ="errorpassword.html"; //idem. no s� como esta hecho

	//private FilterConfig config;
	
	
	public void destroy() {
		//config = null;
	}
	
	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
				throws ServletException, IOException {
		
		String email = req.getParameter(PARAM_EMAIL);
		
		
		if (email != null && this.validateEmail(email)){
			
			chain.doFilter(req, resp); //ok, pasamos la pelota
		}
		else {
			
			RequestDispatcher reqDis = req.getRequestDispatcher(PAG_ERROR_EMAIL);
			reqDis.forward(req, resp);
		}
	}
	

	public void init(FilterConfig config) throws ServletException {
		//this.config = config;
	}
	
	/**
	 * validaci�n email por expresi�n regular
	 * @param email
	 * @return
	 */
	private  boolean validateEmail(String email) {
 
        Pattern p = Pattern.compile("[a-zA-Z0-9]+[.[a-zA-Z0-9_-]+]*@" +
        		"[a-z0-9][\\w\\.-]*[a-z0-9]\\.[a-z][a-z\\.]*[a-z]$");//me gusta esta
 
        Matcher m = p.matcher(email.trim());
        return m.matches();
    }

}
