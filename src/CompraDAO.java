// default package

import hibernate.BaseHibernateDAO;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 	* A data access object (DAO) providing persistence and search support for Compra entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Compra
  * @author MyEclipse Persistence Tools 
 */

public class CompraDAO extends BaseHibernateDAO  {
    private static final Log log = LogFactory.getLog(CompraDAO.class);
	//property constants



    
    public void save(Compra transientInstance) {
        log.debug("saving Compra instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Compra persistentInstance) {
        log.debug("deleting Compra instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Compra findById( CompraId id) {
        log.debug("getting Compra instance with id: " + id);
        try {
            Compra instance = (Compra) getSession()
                    .get("Compra", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    @SuppressWarnings("unchecked")
	public List findByExample(Compra instance) {
        log.debug("finding Compra instance by example");
        try {
            List results = getSession()
                    .createCriteria("Compra")
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
      log.debug("finding Compra instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Compra as model where model." 
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
	public List findAll() {
		log.debug("finding all Compra instances");
		try {
			String queryString = "from Compra";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Compra merge(Compra detachedInstance) {
        log.debug("merging Compra instance");
        try {
            Compra result = (Compra) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Compra instance) {
        log.debug("attaching dirty Compra instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Compra instance) {
        log.debug("attaching clean Compra instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}