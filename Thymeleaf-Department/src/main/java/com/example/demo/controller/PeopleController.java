package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.entity.People;

import com.example.demo.service.PeopleService;

@Controller
@RequestMapping("/peoples")
public class PeopleController {
	@Autowired
	 PeopleService service;
	@GetMapping("/p")
	public String display(Model model) {
		List<People> f=service.findAll();
	model.addAttribute("peoplesdetails", f);
		return "/login";
		
	
	}
@GetMapping("/{id}")
public People findById(@PathVariable("id")int id) {
	return service.findById(id);
	

}}
