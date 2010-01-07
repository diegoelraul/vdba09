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

public class CuentaValidationFilter implements Filter{
	
	/* Dani, como no sé como se llama la variable que especifiqueís....
	 */
	private final static String PARAM_NUM_CUENTA ="numCuenta"; //por ejemplo. no lo sé.
	/*
	 * y esta otra para que definas la página de error si no se valida el email
	 */
	private final static String PAG_ERROR_NUM_CUENTA ="errornumcuenta.html"; //idem. no sé como esta hecho

	//private FilterConfig config;
	
	
	public void destroy() {
		//config = null;
	}
	
	//no lo he probado
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
				throws ServletException, IOException{
		
		String string_num_cuenta = req.getParameter(PARAM_NUM_CUENTA);
		
		try {
			Integer.parseInt( (string_num_cuenta=string_num_cuenta.trim().replaceAll("-", "").replaceAll("-", "")) );
			//.replaceAll("\\s-", ""); no lo he probado. en teoria esto quitaria todo
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			RequestDispatcher reqDis = req.getRequestDispatcher(PAG_ERROR_NUM_CUENTA);
			reqDis.forward(req, resp);
		}
		
		if (string_num_cuenta.length() != 16){
			RequestDispatcher reqDis = req.getRequestDispatcher(PAG_ERROR_NUM_CUENTA);
			reqDis.forward(req, resp);
		}
		else
			chain.doFilter(req, resp); //ok, pasamos la pelota
		
	}
	

	public void init(FilterConfig config) throws ServletException {
		//this.config = config;
	}

	

}
