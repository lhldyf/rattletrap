package com.lhldyf.rattletrap.controller;

import com.lhldyf.rattletrap.dao.ParameterRepository;
import com.lhldyf.rattletrap.entity.ParameterDmo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parameter")
public class ParameterController {

	private static final Logger log = LoggerFactory.getLogger(ParameterController.class);

	@Autowired
	private ParameterRepository repository;

	@PostMapping("/save")
	public String save(ParameterDmo domainDmo) {
		repository.save(domainDmo);
		return "OK";
	}

	@PostMapping("/list")
	public Iterable<ParameterDmo> list() {
		return repository.findAll();
	}

	@PostMapping("/delete")
	public String delete(Long id) {
		repository.delete(id);
		return "OK";
	}
}
