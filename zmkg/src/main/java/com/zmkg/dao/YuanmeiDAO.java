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

import com.zmkg.entity.Yuanmei;


/**
 * A data access object (DAO) providing persistence and search support for
 * Yuanmei entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zmkg.entity.Yuanmei
 * @author MyEclipse Persistence Tools
 */
@Transactional
@Repository
public class YuanmeiDAO {
	private static final Logger log = LoggerFactory.getLogger(YuanmeiDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String HUI = "hui";
	public static final String LIU = "liu";
	public static final String HUIFA = "huifa";
	public static final String ZHUSHU = "zhushu";
	public static final String HUISHOU = "huishou";
	public static final String CHENGBEN = "chengben";
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Yuanmei transientInstance) {
		log.debug("saving Yuanmei instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Yuanmei persistentInstance) {
		log.debug("deleting Yuanmei instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Yuanmei findById(java.lang.Integer id) {
		log.debug("getting Yuanmei instance with id: " + id);
		try {
			Yuanmei instance = (Yuanmei) getCurrentSession().get(
					"com.zmkg.entity.Yuanmei", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Yuanmei> findByExample(Yuanmei instance) {
		log.debug("finding Yuanmei instance by example");
		try {
			List<Yuanmei> results = (List<Yuanmei>) getCurrentSession()
					.createCriteria("com.zmkg.entity.Yuanmei")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Yuanmei instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Yuanmei as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Yuanmei> findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List<Yuanmei> findByHui(Object hui) {
		return findByProperty(HUI, hui);
	}

	public List<Yuanmei> findByLiu(Object liu) {
		return findByProperty(LIU, liu);
	}

	public List<Yuanmei> findByHuifa(Object huifa) {
		return findByProperty(HUIFA, huifa);
	}

	public List<Yuanmei> findByZhushu(Object zhushu) {
		return findByProperty(ZHUSHU, zhushu);
	}

	public List<Yuanmei> findByHuishou(Object huishou) {
		return findByProperty(HUISHOU, huishou);
	}

	public List<Yuanmei> findByChengben(Object chengben) {
		return findByProperty(CHENGBEN, chengben);
	}

	public List findAll() {
		log.debug("finding all Yuanmei instances");
		try {
			String queryString = "from Yuanmei";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Yuanmei merge(Yuanmei detachedInstance) {
		log.debug("merging Yuanmei instance");
		try {
			Yuanmei result = (Yuanmei) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Yuanmei instance) {
		log.debug("attaching dirty Yuanmei instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Yuanmei instance) {
		log.debug("attaching clean Yuanmei instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static YuanmeiDAO getFromApplicationContext(ApplicationContext ctx) {
		return (YuanmeiDAO) ctx.getBean("YuanmeiDAO");
	}

	public List<Yuanmei> getYuanMeiByIds(Integer[] ids) {
		String hql="from Yuanmei  where id in (:ids)";
		List<Yuanmei> list = getCurrentSession().createQuery(hql).setParameterList("ids", ids).list();
		return list;
	}

	public List<Yuanmei> findByStatus(int id) {
		String hql="from Yuanmei  where id = (:id)";
		List<Yuanmei> list = getCurrentSession().createQuery(hql).setInteger("id", id).list();
		return list;
	}

	public List<Yuanmei> findAllUse() {
		String hql="from Yuanmei  where id !=0";
		List<Yuanmei> list = getCurrentSession().createQuery(hql).list();
		return list;
	}
}