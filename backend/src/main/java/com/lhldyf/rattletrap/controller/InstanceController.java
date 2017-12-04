package com.lhldyf.rattletrap.controller;

import com.lhldyf.rattletrap.dao.InstanceRepository;
import com.lhldyf.rattletrap.entity.InstanceDmo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instance")
public class InstanceController {

	private static final Logger log = LoggerFactory.getLogger(InstanceController.class);

	@Autowired
	private InstanceRepository repository;

	@PostMapping("/save")
	public String save(InstanceDmo domainDmo) {
		repository.save(domainDmo);
		return "OK";
	}

	@PostMapping("/list")
	public Iterable<InstanceDmo> list() {
		return repository.findAll();
	}

	@PostMapping("/delete")
	public String delete(Long id) {
		repository.delete(id);
		return "OK";
	}
}
