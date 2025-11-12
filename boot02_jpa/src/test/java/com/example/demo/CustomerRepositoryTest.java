package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.Address;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.Customer;
import com.example.demo.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j // log
@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AddressRepository addressRepository;

	@Disabled
	@Test
	public void 고객_조회() {
		// given : 초기데이터 저장
		String name = "홍길동";
		String phone = "011";
		Customer customer = Customer.builder().name(name).phone(phone).build();

		customerRepository.save(customer);

		// when
		List<Customer> customerList = (List<Customer>) customerRepository.findAll();

		// then
		assertEquals(customerList.get(0).getName(), name);
		log.info("조회된	고객	이름: {}", customerList.get(0).getName());
	} // end of 고객조회

	@Disabled
	@Test
	public void 고객_수정() {
		// given - 초기 데이터 저장
		String name = "홍길동";
		String phone = "011";
		Customer saved = customerRepository.save(Customer.builder().name(name).phone(phone).build());

		// when - 고객 정보 수정
		Customer customer = customerRepository.findById(saved.getId()).orElse(new Customer());
		customer.updateNameAndEmail("둘리", "duly@a.a");
		Customer updated = customerRepository.save(customer);

		customer.updateNameAndEmail("둘리", "hoy@a.a");
		updated = customerRepository.save(customer);

		// then
		assertEquals(updated.getName(), customer.getName());
		log.info("수정된	고객	이름:	{}", updated.getName());
	} // end of 고객수정

	@Disabled
	@Test
	public void 이름_조회() {
		// given
		String name = "둘리";

		// when
		List<Customer> list = customerRepository.findByName(name);
		List<Customer> list2 = customerRepository.findByNameLike("%" + name + "%");
		list2.stream().forEach(cust -> System.out.println(cust.getName()));

		// then
		assertEquals(list.get(0).getName(), name);
	}

	@Disabled
	@Test
	public void jpql_test() {
		List<Customer> list = customerRepository.findAllQuery();
		list.stream().forEach(cust -> {
			System.out.println(cust.getId() + " : " + cust.getEmail());
		});
	}

	@Disabled
	@Test
	public void 이메일_조회() {
		// given
		String email = "@";

		// when
		List<Customer> list = customerRepository.findByEmail(email);
		list.stream().forEach(custE -> System.out.println(custE.getEmail()));
	}

	@Disabled
	@Test
	public void 네이트브_쿼리_전체조회() {
		List<Object[]> list = customerRepository.findAllNative("011", "둘리");
		// 이름, 폰 번호 출력
		// then
		list.stream().forEach(x -> {
			for (Object cust : x) {
				System.out.println(cust);
			}
		});

		// List<VO> 결과받기
//		List<CustomerNative> list2 = customerRepository.findAllNativeVO("011","둘리");
	}

	@Test
	public void 일대일() {
		// given(준비)

		Customer customerentity = Customer.builder()
				.name("길동").phone("010").email("c@c.c").build();
		Customer saved = customerRepository.save(customerentity);
		
		// 주소등록
		addressRepository.save(Address.builder()
						 .zipcode("01000")
						 .address("서울")
						 .customer(customerentity)
						 .build());
		
		addressRepository.save(Address.builder()
						 .zipcode("04411")
						 .address("대구")
						 .customer(customerentity)
						 .build());

		// when(실행)
		// Optional => get()
		// 고객조회(주소록 조회)
		Customer customer = customerRepository.findById(saved.getId()).get();
		customer.getAddress().forEach(addr -> System.out.println(
				addr.getZipcode() + ":"+ addr.getAddress()));

		// then(검증)
		assertEquals("04411", customer.getAddress().get(1).getZipcode());

	}

}