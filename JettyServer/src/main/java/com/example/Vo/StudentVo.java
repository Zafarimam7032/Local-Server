package com.example.Vo;

public class StudentVo {
	private int id;
	private String name;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public StudentVo(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public StudentVo() {
		super();
	}
	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

}
