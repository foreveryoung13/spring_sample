package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

import com.pluralsight.Repository.CustomerRepository;
import com.pluralsight.Repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
