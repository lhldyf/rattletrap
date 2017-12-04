package com.lhldyf.rattletrap.dao;

import com.lhldyf.rattletrap.entity.DomainDmo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DomainRepository extends CrudRepository<DomainDmo, Long> {

	List<DomainDmo> findByNameLike(String name);

}
