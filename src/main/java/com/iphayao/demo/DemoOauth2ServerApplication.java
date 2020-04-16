package com.iphayao.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

@RestController
@SpringBootApplication
@EnableAuthorizationServer
public class DemoOauth2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOauth2ServerApplication.class, args);
	}

	@GetMapping("/profile")
	public Map<String, Object> profiles(Principal principal) {
		return Collections.singletonMap("userId", principal.getName());
	}

}
