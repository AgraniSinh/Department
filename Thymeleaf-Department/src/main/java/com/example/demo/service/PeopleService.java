package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PeopleDao;

import com.example.demo.entity.People;







@Service
public class PeopleService {
	
	@Autowired
	private PeopleDao dao;
	
	
	
public List<People> findAll(){
	return dao.findAll();
	
}
	public People findById(int id) {
		return dao.findById(id).get();
	
	
}
public void save(People p) {
	dao.save(p);
}

}
