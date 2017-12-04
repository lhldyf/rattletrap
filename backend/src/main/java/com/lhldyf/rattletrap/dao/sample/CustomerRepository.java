package com.lhldyf.rattletrap.dao.sample;

import java.util.List;

import com.lhldyf.rattletrap.entity.sample.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
}
