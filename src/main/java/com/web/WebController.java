package com.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping(value="/webtask")
	public String webtask() {
		return "Vanakkam Chennai";
	}

}
