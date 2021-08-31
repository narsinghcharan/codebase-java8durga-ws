package com.myex.sge.pojo;

import java.io.Serializable;
import java.util.List;


public class Site implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private String address;
	
	private List<Plant> plants;
	
	public Site() {
		super();
	}
	
	public Site(Integer id, String name, String address, List<Plant> plants) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.plants = plants;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Plant> getPlants() {
		return plants;
	}

	public void setPlants(List<Plant> plants) {
		this.plants = plants;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Site [id=" + id + ", name=" + name + ", address=" + address + ", plants=" + plants + "]";
	}
	
}
