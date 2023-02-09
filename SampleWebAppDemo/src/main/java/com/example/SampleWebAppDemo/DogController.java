package com.example.SampleWebAppDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DogController {

	@RequestMapping("dogHome")
	public String dogHome() {
		return "dogHome.html";
	}

	@RequestMapping("dogTreatment")
	public String dogTreatment() {
		return "dogTreatment.jsp";
	}

	@RequestMapping("dogPlay")
	public String dogPlay() {
		return "dogPlay.html";
	}

	@RequestMapping("dogSchool")
	public String dogSchool() {
		return "dogSchool.html";
	}

	@RequestMapping("dogFood")
	public String dogFood() {
		return "dogFood.html";
	}
}
