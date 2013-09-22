package com.craigew.service;


import com.craigew.entity.Customer;
import junit.framework.Assert;
import org.junit.Test;

public class TestClientManagement {

    @Test
    public void should_persist_a_customer() {
        Customer customer = new Customer("John", "Doe", "123456", 36);
        long id=new CustomerManagementService().createCustomer(customer);
        Assert.assertEquals("Id is not was expected",5,id);
    }

    @Test
    public void should_return_a_customer() {
        Customer customer = new CustomerManagementService().findCustomerByPrimaryKey(1);
        Assert.assertEquals("Name is not equal","Jane",customer.getName());
        Assert.assertEquals("Surname is not equal","Doe",customer.getSurname());
        Assert.assertEquals("Identity number is not equal","654321",customer.getIdentity_number());
        Assert.assertEquals("Age number is not equal",36,customer.getAge());
    }

    @Test
    public void should_update_a_customer() {
        Customer customer = new CustomerManagementService().findCustomerByPrimaryKey(1);
        customer.setAge(37);
        new CustomerManagementService().updateCustomer(customer);

        customer = new CustomerManagementService().findCustomerByPrimaryKey(1);
        Assert.assertEquals("Age is not updated",37,customer.getAge());
    }


}
