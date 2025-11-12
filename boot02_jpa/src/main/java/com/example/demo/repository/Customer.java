package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// ORM

//@DynamicUpdate
@NoArgsConstructor // 기본생성자
@Getter // '가져가라~'라는 의미
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	@Column(length = 20, nullable = false)
	private String name;

	String phone;

	String email;

	@Temporal(TemporalType.TIMESTAMP)
	LocalDateTime regdate;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	List<Address> address = new ArrayList<Address>();

	// namd, phone, email을 초기화하는 생성자
	@Builder
	public Customer(String name, String phone, String email, Address address) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address.add(address);
	}

	public void updateNameAndEmail(String name, String email) {
		this.name = name;
		this.email = email;
	}

}
