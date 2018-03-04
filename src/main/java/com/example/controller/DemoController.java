package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DemoController {
	@RequestMapping(value = "/id")
	String getIdByValue(@RequestParam("id") String personId) {
		System.out.println("ID is " + personId);
		return "Get ID from query string of URL with value element";
	}

	@RequestMapping(value = "/personId")
	String getId(@RequestParam String personId) {
		System.out.println("ID is " + personId);
		return "Get ID from query string of URL without value element";
	}
}
