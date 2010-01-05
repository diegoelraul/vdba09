package modelo.pelicula;
// default package

import hibernate.BaseHibernateDAO;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Pelicula entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see .Pelicula
 * @author MyEclipse Persistence Tools
 */

public class PeliculaDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PeliculaDAO.class);
	// property constants
	public static final String NOMBRE_DIRECTOR = "nombreDirector";
	public static final String APELLIDOS_DIRECTOR = "apellidosDirector";
	public static final String IDIOMA = "idioma";
	public static final String COSTE = "coste";
	public static final String PRECIO = "precio";
	public static final String DISPONIBILIDAD = "disponibilidad";
	public static final String PATH_IMAGEN = "pathImagen";

	public void save(Pelicula transientInstance) {
		log.debug("saving Pelicula instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Pelicula persistentInstance) {
		log.debug("deleting Pelicula instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Pelicula findById(java.lang.String id) {
		log.debug("getting Pelicula instance with id: " + id);
		try {
			Pelicula instance = (Pelicula) getSession().get("Pelicula", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List findByExample(Pelicula instance) {
		log.debug("finding Pelicula instance by example");
		try {
			List results = getSession().createCriteria("Pelicula").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Pelicula instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Pelicula as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List findByNombreDirector(Object nombreDirector) {
		return findByProperty(NOMBRE_DIRECTOR, nombreDirector);
	}

	@SuppressWarnings("unchecked")
	public List findByApellidosDirector(Object apellidosDirector) {
		return findByProperty(APELLIDOS_DIRECTOR, apellidosDirector);
	}

	@SuppressWarnings("unchecked")
	public List findByIdioma(Object idioma) {
		return findByProperty(IDIOMA, idioma);
	}

	@SuppressWarnings("unchecked")
	public List findByCoste(Object coste) {
		return findByProperty(COSTE, coste);
	}

	@SuppressWarnings("unchecked")
	public List findByPrecio(Object precio) {
		return findByProperty(PRECIO, precio);
	}

	@SuppressWarnings("unchecked")
	public List findByDisponibilidad(Object disponibilidad) {
		return findByProperty(DISPONIBILIDAD, disponibilidad);
	}

	@SuppressWarnings("unchecked")
	public List findByPathImagen(Object pathImagen) {
		return findByProperty(PATH_IMAGEN, pathImagen);
	}

	@SuppressWarnings("unchecked")
	public List findAll() {
		log.debug("finding all Pelicula instances");
		try {
			String queryString = "from Pelicula";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Pelicula merge(Pelicula detachedInstance) {
		log.debug("merging Pelicula instance");
		try {
			Pelicula result = (Pelicula) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Pelicula instance) {
		log.debug("attaching dirty Pelicula instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Pelicula instance) {
		log.debug("attaching clean Pelicula instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}