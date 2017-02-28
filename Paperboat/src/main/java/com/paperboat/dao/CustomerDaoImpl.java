package com.paperboat.dao;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paperboat.model.Authorities;
import com.paperboat.model.Cart;
import com.paperboat.model.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
private SessionFactory sessionFactory;
	Logger logger=Logger.getLogger(CustomerDaoImpl.class);
	public void saveCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		logger.debug("===========================================================================");
		//child tables - Users, billingAddress,ShippingAddresss
		customer.getUsers().setEnabled(true);
		
		//Assignment
		String username=customer.getUsers().getUsername();
		String role="ROLE_USER";
		
		Authorities authorities=new Authorities();
		//set the values
		authorities.setUsername(username);
		authorities.setRole(role);
		
		session.save(authorities); 	 //insert into authorities values (?,?,'Role_USER');
		
		Cart cart=new Cart();
		customer.setCart(cart);
		
		cart.setCustomer(customer);		//update cart set customer_id=? , grand total=? where cart_id=?
		
		
		session.save(customer);
		
		logger.debug("==========================================================================");
		session.flush();
		session.close();		
	}

}