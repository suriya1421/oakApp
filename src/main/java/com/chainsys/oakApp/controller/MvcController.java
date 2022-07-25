package com.chainsys.oakApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {
	@GetMapping("/index")
	public String index() {
		return "index";
		
	}

}
