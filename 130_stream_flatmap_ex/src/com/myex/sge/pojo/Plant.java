package com.myex.sge.pojo;

import java.io.Serializable;

public class Plant implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;

	private String plantName;
	
	private String plantDescription;

	public Plant() {
	}

	public Plant(Integer id, String plantName, String plantDescription) {
		this.id = id;
		this.plantName = plantName;
		this.plantDescription = plantDescription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public String getPlantDescription() {
		return plantDescription;
	}

	public void setPlantDescription(String plantDescription) {
		this.plantDescription = plantDescription;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Plant [id=" + id + ", plantName=" + plantName + ", plantDescription=" + plantDescription + "]";
	}
	
}
