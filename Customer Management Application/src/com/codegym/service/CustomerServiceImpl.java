package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer,Customer> customers;
    static{
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"Dung","dungdamdang@codegym.vn","Hue"));
        customers.put(2, new Customer(2,"Sang","sangsexy@codegym.vn","Dn"));
        customers.put(3,new Customer(3,"Van","vanvatva@codegym.vn","QuangNam"));
        customers.put(4, new Customer(4,"Son","sonyeuduoi@codegym.vn","ThaiBinMohoRoi"));
    }
    @Override
    public List<Customer> findAll() {

        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
