package com.example;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by noelaniekan on 12/22/16.
 */
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
}
