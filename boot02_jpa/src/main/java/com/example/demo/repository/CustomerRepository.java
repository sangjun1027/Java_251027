package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CustomerRepository extends JpaRepository<Customer, Long> { 
		
	// 이름으로 조회
	List<Customer> findByName(String name);
	
	// 이름으로 Like 조회
	List<Customer> findByNameLike(String name);
	
	// emil조회 (특정단어가 포함 된 이메일 조회 )
	List<Customer> findByEmail(String email);
	
	// 특정단어가 이름 또는 이메일에 포함된 경우 (OR)
	
	// 네이티브 쿼리 
	//@Query(value = "SELECT * FROM customer WHERE phone = ?1 or ?2", nativeQuery = true)
	@Query(value = "SELECT * FROM customer WHERE phone = :phone or name = :name", nativeQuery = true)
	List<Object[]> findAllNative(@Param("phone") String phone, @Param("name") String name);
	
	@Query(value = "SELECT * FROM customer WHERE phone = :phone or name = :name", nativeQuery = true)
	List<CustomerNative> findAllNativeVO(@Param("phone") String phone, @Param("name") String name);
	
	
	//JPQL
	@Query("SELECT c FROM Customer c ORDER BY id DESC")
	List<Customer> findAllQuery();
	
}	// end of interface
