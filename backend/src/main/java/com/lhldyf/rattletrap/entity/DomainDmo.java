package com.lhldyf.rattletrap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DomainDmo {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	private String name;

	private String description;

	private String protocol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Override
	public String toString() {
		return String.format(
				"Domain[id=%d, name='%s', description='%s', protocol='%s']",
				id, name, description, protocol);
	}
}
