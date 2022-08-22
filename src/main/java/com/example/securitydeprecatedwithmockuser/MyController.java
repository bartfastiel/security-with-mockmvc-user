package com.example.securitydeprecatedwithmockuser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("a")
public class MyController {

    @GetMapping
    void blubb() {

    }
}
