package com.example.pwcspringMVC;

import java.util.Base64;

//import org.springframework.context.annotation.Bean;

import com.security.JWTUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JWTTest {
private static String secret_key="abc@123";
public static void main(String[] args) {
	String token=JWTUtil.generateToken("Token1", secret_key);
	System.out.println("---------------TOKEN------------");
	System.out.println(token);
	System.out.println();
	System.out.println("------claims------");
	
	Claims claims=Jwts.parser()
			.setSigningKey(Base64.getEncoder().encode(secret_key.getBytes()))
			.parseClaimsJws(token)
			.getBody();
	System.out.println("Token_id "+claims.getId());
	System.out.println("Token subject "+claims.getSubject());
	System.out.println("Token_ISSUER "+claims.getIssuer());
	System.out.println("Token_Aud "+claims.getAudience());
			
	
}
}
