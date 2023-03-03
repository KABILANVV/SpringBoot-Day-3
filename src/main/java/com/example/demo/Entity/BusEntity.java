//package com.example.demo.Entity;	
//
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="BusDetails")
//public class BusEntity {
//	@Id
//	@Column(name="id")
//	private int id;
//	@Column(name="name")
//	private String name;
//	@Column(name="destination")
//	private String destination;
//	@Column(name="cost")
//	private int cost;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDestination() {
//		return destination;
//	}
//	public void setDestination(String destination) {
//		this.destination = destination;
//	}
//	public int getCost() {
//		return cost;
//	}
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
//	public BusEntity(int id, String name, String destination, int cost) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.destination = destination;
//		this.cost = cost;
//	}
//}