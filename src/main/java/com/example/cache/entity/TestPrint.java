package com.example.cache.entity;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
@Cacheable(value = "incache")
public class TestPrint {
	
	
	public String getResult() {
		System.out.println("rush getResult******");
		return "ok";
	}

}
