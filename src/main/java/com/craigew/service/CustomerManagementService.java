package com.craigew.service;

import com.craigew.entity.Customer;

public class CustomerManagementService extends DataAccess<Customer> {

    public long createCustomer(Customer customer) {
        return add(customer);
    }

    public boolean updateCustomer(Customer customer) {
        update(customer);
        return true;
    }

    public Customer findCustomerByPrimaryKey(int id) {
        setEntityClass(Customer.class);
        return findByPrimaryKey(id);
    }
}
