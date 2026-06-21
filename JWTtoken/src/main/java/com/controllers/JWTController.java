package com.controllers;

import java.security.Key;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@RestController
public class JWTController {

	private static final String SECRET = "test123StringForgenneratingtoken";
    private static final Key KEY = Keys.hmacShaKeyFor(SECRET.getBytes());

	@GetMapping("/getToken")
	public String getToken() {
		 long nowMillis = System.currentTimeMillis();
	     long ttlMillis = 5*60*1000; // 5min expiration
	     
	     return Jwts.builder()
	                .subject("test") // Claim: Subject
	                .issuedAt(new Date(nowMillis)) // Claim: Issued Time
	                .expiration(new Date(nowMillis + ttlMillis))
	                // Claim: Expiration
	                .signWith(KEY) // Sign token digitally
	                .compact();
		
	}
	
	@PostMapping("/getToken")
	public String getTokenForUserName(@RequestBody String username) {
		 long nowMillis = System.currentTimeMillis();
	     long ttlMillis = 5*60*1000; // 5min expiration
	     
	     return Jwts.builder()
	                .subject(username) // Claim: Subject
	                .issuedAt(new Date(nowMillis)) // Claim: Issued Time
	                .expiration(new Date(nowMillis + ttlMillis))
	                // Claim: Expiration
	                .signWith(KEY) // Sign token digitally
	                .compact();
		
	}
}
