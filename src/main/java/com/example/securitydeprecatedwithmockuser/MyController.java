package com.example.securitydeprecatedwithmockuser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/my")
public class MyController {

    @GetMapping
    void bla() {

    }

    @GetMapping(path = "secret")
    void blubb() {

    }
}
