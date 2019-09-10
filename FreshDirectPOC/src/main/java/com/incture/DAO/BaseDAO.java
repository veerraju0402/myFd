package com.incture.DAO;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
@Transactional
public class BaseDAO {

	@Autowired  
	private SessionFactory sessionFactory;
	/*Session session = null;

	public Session getSession() {
		Session currentSession = null;
		if (!(this.session == null)) {
			currentSession = this.session;
		} else {
			currentSession = sessionFactory.getCurrentSession();
		}
		return currentSession;}*/

	Session session;
	public Session getSession() {
		try {
			return sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			System.err.println("[BaseDao] " + e.getMessage());
			return sessionFactory.openSession();
		}
	}
}
