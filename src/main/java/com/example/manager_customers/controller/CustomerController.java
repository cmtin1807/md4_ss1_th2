package com.example.manager_customers.controller;

import com.example.manager_customers.model.Customer;
import com.example.manager_customers.service.CustomerService;

import com.example.manager_customers.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer")
    public String customerFindAll(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        System.out.println(customers);
        return "customers";
    }

    @GetMapping("/customer/{id}")
    public String customerById(@PathVariable int id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        System.out.println(customer);
        return "customer";
    }
    }

