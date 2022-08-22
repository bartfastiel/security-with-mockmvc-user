package com.example.securitydeprecatedwithmockuser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MyController {

    @GetMapping(path="pub")
    void pub() {

    }

    @GetMapping(path="secret")
    void secret() {

    }
}
