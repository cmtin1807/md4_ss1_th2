package com.example.manager_customers.repository;

import com.example.manager_customers.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    Customer findById(int id);

}
