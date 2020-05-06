package com.hoanglinh.service;

import com.hoanglinh.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService  {
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
    Customer addCustomer(Customer customer);
    void save(Customer customer);
    Customer findOne(Long id);
    void delete (Long id);
}
