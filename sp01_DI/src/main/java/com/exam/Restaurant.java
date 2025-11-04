package com.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	// Chef chef = new Chef 로 하면 바꿀 수가 없다.
	@Autowired
	Chef chef;
	
	public void order() {
		chef.cook();
	}
	
}
