package com.demousers.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path =  "/")
public class indexController {

	@GetMapping()
	public String Index() {
		return "Api succes";
	}

}
