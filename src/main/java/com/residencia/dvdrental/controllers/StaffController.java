package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Staff;
import com.residencia.dvdrental.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Staff")
public class StaffController {
	@Autowired
	private StaffService staffService;

	@GetMapping("/{id}")
	public ResponseEntity<Staff> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(staffService.findById(id), headers, HttpStatus.OK);
	}

}