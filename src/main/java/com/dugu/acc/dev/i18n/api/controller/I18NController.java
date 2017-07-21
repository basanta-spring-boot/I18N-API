package com.dugu.acc.dev.i18n.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class I18NController {
	@GetMapping("/international")
	public String getInternationalPage() {
		return "international";
	}
}
