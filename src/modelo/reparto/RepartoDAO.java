package modelo.reparto;
// default package

import hibernate.BaseHibernateDAO;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 	* A data access object (DAO) providing persistence and search support for Reparto entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Reparto
  * @author MyEclipse Persistence Tools 
 */

public class RepartoDAO extends BaseHibernateDAO  {
    private static final Log log = LogFactory.getLog(RepartoDAO.class);
	//property constants
	public static final String PERSONAJE = "personaje";



    
    public void save(Reparto transientInstance) {
        log.debug("saving Reparto instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Reparto persistentInstance) {
        log.debug("deleting Reparto instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Reparto findById( RepartoId id) {
        log.debug("getting Reparto instance with id: " + id);
        try {
            Reparto instance = (Reparto) getSession()
                    .get("Reparto", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    @SuppressWarnings("unchecked")
	public List findByExample(Reparto instance) {
        log.debug("finding Reparto instance by example");
        try {
            List results = getSession()
                    .createCriteria("Reparto")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    @SuppressWarnings("unchecked")
	public List findByProperty(String propertyName, Object value) {
      log.debug("finding Reparto instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Reparto as model where model." 
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
	public List findByPersonaje(Object personaje
	) {
		return findByProperty(PERSONAJE, personaje
		);
	}
	

	@SuppressWarnings("unchecked")
	public List findAll() {
		log.debug("finding all Reparto instances");
		try {
			String queryString = "from Reparto";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Reparto merge(Reparto detachedInstance) {
        log.debug("merging Reparto instance");
        try {
            Reparto result = (Reparto) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Reparto instance) {
        log.debug("attaching dirty Reparto instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Reparto instance) {
        log.debug("attaching clean Reparto instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}