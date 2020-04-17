package com.iphayao.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

@RestController
@SpringBootApplication
public class DemoOauth2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOauth2ServerApplication.class, args);
	}

	@GetMapping("/userinfo")
	public Map<String, Object> userInfo(Principal principal) {
		return Collections.singletonMap("userId", principal.getName());
	}

}
