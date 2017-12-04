package com.lhldyf.rattletrap.test.controller;

import com.lhldyf.rattletrap.entity.DomainDmo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DomainControllerTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void save() {
		DomainDmo insertDmo = new DomainDmo();
		insertDmo.setDescription("desc");
		insertDmo.setName("name");
		insertDmo.setProtocol("dubbo");
		this.restTemplate.getForObject("/", String.class);
		ResponseEntity<String> responseEntity= this.restTemplate.postForEntity("/domain/save", insertDmo, String.class);
		assertThat(responseEntity.getBody()).isEqualTo("OK");
	}

	@Test
	public void list() {

	}
}
