package com.example.manager_customers.repository;

import com.example.manager_customers.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer(1, "Nguyen Khac Nhat", "nhat@codegym.com", "Ha Noi"));
        customers.add(new Customer(2, "Dang Huy Hoa", "hoa@codegym.com", "Da Nang"));
        customers.add(new Customer(3, "Le Thi Chau", "chau@codegym.com", "Hung Yen"));
        customers.add(new Customer(4, "Nguyen Thuy Duong", "duong@codegym.com", "Nam Dinh"));
        customers.add(new Customer(5,"Codegym","codegym@codegym.com","Việt Nam"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        for (Customer customer1 : customers) {
            if (customer1.getId() == id) {
                customer = customer1;
            }
        }
        return customer;
    }

}
