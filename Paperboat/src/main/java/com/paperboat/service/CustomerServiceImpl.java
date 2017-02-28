package com.paperboat.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paperboat.dao.CustomerDao;
import com.paperboat.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
private CustomerDao customerDao;
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

}
