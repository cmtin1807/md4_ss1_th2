package com.example.manager_customers.service;

import com.example.manager_customers.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findById(int id);

}
