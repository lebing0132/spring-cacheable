package com.example.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cache.entity.TestPrint;

@RestController
public class CacheableTestController {
	
	@Autowired
	private TestPrint testPrint;
	
	@GetMapping("/cache/{user}")
	@Cacheable(value = "aacache",key = "#user")
	public String cacheFun(@PathVariable("user") String user) {
		System.out.println("rush cache******"+user);
		//testPrint.getResult();
		return "ok";
	}

}
