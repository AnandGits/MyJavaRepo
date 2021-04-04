package com.demo.springboot.controllers;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example")
public class ExampleController {

	@GetMapping("/hello-world")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hello World!, Here I come");
	}
	
	@GetMapping(path="/json-world", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> get1() {
	//public @ResponseBody String getJSON(){
		String s = "MyJSON, This is a test";
		return ResponseEntity.ok(s);
	}
}
