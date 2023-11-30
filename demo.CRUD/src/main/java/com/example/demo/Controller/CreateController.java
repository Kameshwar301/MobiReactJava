package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CreateModel;
import com.example.demo.Model.Response;
import com.example.demo.Service.CreateService;

@CrossOrigin("*")
@RestController
@RequestMapping("/auth")
public class CreateController {
	@Autowired
	private CreateService service;
	
	@PostMapping("/create")
	public ResponseEntity<Response>createAccount(@RequestBody CreateModel datas){
		return ResponseEntity.ok(service.createAccount(datas));
	}
	@PutMapping("/update")
	public ResponseEntity<Response>updateAccount(@RequestBody CreateModel datas){
		return ResponseEntity.ok(service.updateAccount(datas));
	}
	@GetMapping("/view")
	public ResponseEntity<Response>viewAllUser(){
		return ResponseEntity.ok(service.viewAllUser());
	}
}
