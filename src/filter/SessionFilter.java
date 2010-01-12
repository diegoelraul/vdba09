package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		//System.out.println("Solicitado filtro");
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String url = request.getServletPath();
		//System.out.println("url solicitada:"+url);
		HttpSession session=request.getSession(true);
		if(session.getAttribute("perfil")==null){
			session.setAttribute("perfil","invitado");
			session.setAttribute("username","invitado");
		}

		if(url.equals("/index.jsp")){
			//HttpSession session=request.getSession(true);
			//System.out.println("Entrando en condiciones de filtro:\nsession!=null:"+session!=null);
			//System.out.println("session.getAttribute('perfil')!=null:"+session.getAttribute("perfil")!=null);
			if((session!=null)&&(session.getAttribute("perfil")!=null)){
				if(session.getAttribute("perfil").equals("administrador")){
					//response.sendRedirect("./administrador.do");
					response.sendRedirect("./listaPeliculas.do");
				}else{
					response.sendRedirect("./listaPeliculas.do");
				}
			}
			else{

//				request.getSession(true).setAttribute("perfil","invitado");
//				request.getSession().setAttribute("username","invitado");
				response.sendRedirect("./listaPeliculas.do");
				
			}
		}
		//System.out.println("session es: "+request.getSession(false));
		//System.out.println("username: "+(String)request.getSession().getAttribute("username")+" perfil: "+(String)request.getSession().getAttribute("perfil"));

		chain.doFilter(req, res);
	}

	public void init(FilterConfig config) throws ServletException {
//		config.getServletContext().setAttribute("perfil","invitado");
//		config.getServletContext().setAttribute("username","invitado");
//		
		System.out.println("Se ha inicializado el filtro");

	}
}