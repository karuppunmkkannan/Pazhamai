package com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.model.Product;

@Transactional
@Repository("commonDao")
public class CommonDaoImpl implements CommonDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public String saveProduct(Product prod) {
		String result="";
		Session session = null;
		Transaction tx=null;
		try {
			session = this.sessionFactory.openSession();
			System.out.println("dao====="+prod.toString());
			session.save(prod);
			result="success";
			System.out.println("sucess");
		} catch (HibernateException e) {
			e.printStackTrace();	        
		} catch (Exception e) {
			e.printStackTrace();
		} finally {		    
			session.close();
		}
		return result;
		
	}

	public List<Product> getProduct() {
		 return  sessionFactory.getCurrentSession().createQuery(" FROM  Product").list();     
		   
	}

}
