package com.lambdaexpressions.example.dto;

/**
 * 
 * @author ravi.thapa
 *
 */


public class FirstDTO {
	private int id;
	private String name;
	private Boolean status;
	
	public FirstDTO(int id, String name, Boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
}//end of the class
