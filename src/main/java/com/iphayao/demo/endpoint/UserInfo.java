package com.iphayao.demo.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
public class UserInfo {

    @GetMapping("/userinfo")
    public Map<String, Object> userInfo(Principal principal) {
        if(principal != null) {
            return Map.of(
                    "userId", principal.getName(),
                    "principalInfo", principal
            );
        }

        return null;
    }

}
