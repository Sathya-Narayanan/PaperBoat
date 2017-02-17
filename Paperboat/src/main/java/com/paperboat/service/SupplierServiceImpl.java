package com.paperboat.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paperboat.dao.SupplierDao;
import com.paperboat.model.Supplier;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService 
{
	@Autowired
	private SupplierDao supplierDao;

	
	public List<Supplier> getSuppliers() {
		// TODO Auto-generated method stub
		return supplierDao.getSuppliers();
	}

}
