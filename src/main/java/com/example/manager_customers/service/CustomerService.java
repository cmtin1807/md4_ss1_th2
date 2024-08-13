package com.example.manager_customers.service;

import com.example.manager_customers.model.Customer;
import com.example.manager_customers.repository.CustomerRepository;
import com.example.manager_customers.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }
}
