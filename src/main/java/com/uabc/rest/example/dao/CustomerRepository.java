package com.uabc.rest.example.dao;

import com.uabc.rest.example.dao.entity.CustomerModel;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerModel,Long> {
}
