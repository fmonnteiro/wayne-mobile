package com.wayne.mobile.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wayne.mobile.dto.CdrRequestDto;
import com.wayne.mobile.dto.CdrResponseDto;

@RequestMapping("/wayne-mobile/api")
@RestController
public class WayneMobileController {

	@PostMapping("/cdr")
	public ResponseEntity<CdrResponseDto> create(@RequestBody CdrRequestDto request) {
		//metodo que salva
		return ResponseEntity.ok().body(new CdrResponseDto());
	}
	
	@DeleteMapping("/cdr/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
		//metodo que deleta
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/internet/saldo")
	public ResponseEntity<String> saldo(){
		
		return ResponseEntity.ok().body("110.00");
	} 
	
	
	
}
