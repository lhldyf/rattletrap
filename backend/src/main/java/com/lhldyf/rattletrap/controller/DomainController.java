package com.lhldyf.rattletrap.controller;

import com.lhldyf.rattletrap.dao.DomainRepository;
import com.lhldyf.rattletrap.entity.DomainDmo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domain")
public class DomainController {

	private static final Logger log = LoggerFactory.getLogger(DomainController.class);

	@Autowired
	private DomainRepository repository;

	@PostMapping("/save")
	public String save(DomainDmo domainDmo) {
		repository.save(domainDmo);
		log.info("save success!");
		return "OK";
	}

	@PostMapping("/list")
	public Iterable<DomainDmo> list() {
		return repository.findAll();
	}

	@PostMapping("/delete")
	public String delete(Long id) {
		repository.delete(id);
		return "OK";
	}

}
