package com.educandoweb.course.entities;

import java.time.Instant;

public class Order {
	private Long id;
	private Instant moment;
	private User client;
	public Order() {
		
	}
	public Order(Long id, Instant moment, User client) {
		//super();
		this.id = id;
		this.moment = moment;
		this.client = client;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getMoment() {
		return moment;
	}
	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
	
	

}
