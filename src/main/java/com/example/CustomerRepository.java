package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by noelaniekan on 12/22/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
