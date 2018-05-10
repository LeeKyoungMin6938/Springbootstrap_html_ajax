package com.javasampleapproach.jquerybootstrap.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
	private Long id;
	private String name;
	private Integer age;
	private Address address;
}
