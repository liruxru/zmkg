package com.zmkg.dao;

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zmkg.entity.Jinmei;



/**
 	* A data access object (DAO) providing persistence and search support for Jinmei entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.oracle.entity.Jinmei
  * @author MyEclipse Persistence Tools 
 */
@Transactional
@Repository
public class JinmeiDAO  {
	     private static final Logger log = LoggerFactory.getLogger(JinmeiDAO.class);
		//property constants
	public static final String NAME = "name";
	public static final String HUI = "hui";
	public static final String LIU = "liu";
	public static final String HUIFA = "huifa";
	public static final String ZHISHU = "zhishu";


	@Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
       this.sessionFactory = sessionFactory;
    }

    private Session getCurrentSession(){
     return sessionFactory.getCurrentSession(); 
    }
	protected void initDao() {
		//do nothing
	}
    
    public void save(Jinmei transientInstance) {
        log.debug("saving Jinmei instance");
        try {
            getCurrentSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jinmei persistentInstance) {
        log.debug("deleting Jinmei instance");
        try {
            getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jinmei findById( java.lang.Integer id) {
        log.debug("getting Jinmei instance with id: " + id);
        try {
            Jinmei instance = (Jinmei) getCurrentSession()
                    .get("com.oracle.entity.Jinmei", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<Jinmei> findByExample(Jinmei instance) {
        log.debug("finding Jinmei instance by example");
        try {
            List<Jinmei> results = (List<Jinmei>) getCurrentSession() .createCriteria("com.oracle.entity.Jinmei").add( create(instance) ).list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Jinmei instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jinmei as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getCurrentSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List<Jinmei> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<Jinmei> findByHui(Object hui
	) {
		return findByProperty(HUI, hui
		);
	}
	
	public List<Jinmei> findByLiu(Object liu
	) {
		return findByProperty(LIU, liu
		);
	}
	
	public List<Jinmei> findByHuifa(Object huifa
	) {
		return findByProperty(HUIFA, huifa
		);
	}
	
	public List<Jinmei> findByZhishu(Object zhishu
	) {
		return findByProperty(ZHISHU, zhishu
		);
	}
	

	public List findAll() {
		log.debug("finding all Jinmei instances");
		try {
			String queryString = "from Jinmei";
	         Query queryObject = getCurrentSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jinmei merge(Jinmei detachedInstance) {
        log.debug("merging Jinmei instance");
        try {
            Jinmei result = (Jinmei) getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jinmei instance) {
        log.debug("attaching dirty Jinmei instance");
        try {
            getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jinmei instance) {
        log.debug("attaching clean Jinmei instance");
        try {
                      	getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static JinmeiDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (JinmeiDAO) ctx.getBean("JinmeiDAO");
	}
}