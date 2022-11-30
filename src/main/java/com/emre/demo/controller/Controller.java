package com.emre.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller { 
	
	@GetMapping("/verial")
	public String veriAl() {
		return "Veri alındı";
	}
	 
	@PostMapping("/veriyaz")
	public String veriYaz() {
		return "Veri yazıldı";
	}
	
	@DeleteMapping("/verisil")
	public String veriSil() {
		return "Veri silindi";
	}
	
	@GetMapping("/mesaj/{m}")
	public String mesajYaz(@PathVariable String m) {
		return "Mesajınız : " + m ;
	}
	
}
