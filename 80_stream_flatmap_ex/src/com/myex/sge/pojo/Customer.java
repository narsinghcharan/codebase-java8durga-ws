package com.myex.sge.pojo;

import java.util.List;

public class Customer {

	private Integer id;
	private String name;
	private Integer age;
	private List<Site> sites;
	
	public Customer() {
		
	}
	
	public Customer(Integer id, String name, Integer age, List<Site> sites) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sites = sites;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	public List<Site> getSites() {
		return sites;
	}

	public void setSites(List<Site> sites) {
		this.sites = sites;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", sites=" + sites + "]";
	}

}
