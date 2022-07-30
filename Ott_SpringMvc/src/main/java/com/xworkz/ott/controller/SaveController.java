package com.xworkz.ott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ott.dto.OttDTO;
import com.xworkz.ott.service.OttService;

@Component
@RequestMapping("/")
public class SaveController {
	@Autowired
	private OttService service;

	public SaveController() {
		System.out.println("save controller Constructor from SaveController Class");
	}

	@PostMapping("/save.do")
	public String onSave(OttDTO dto) {
		System.out.println("onSave method from from SaveController Class");

		boolean save = service.validateAndSave(dto);
		System.out.println(save);

		return "index.html";
	}
}
