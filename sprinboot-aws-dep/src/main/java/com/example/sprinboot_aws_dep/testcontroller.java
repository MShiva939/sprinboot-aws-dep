package com.example.sprinboot_aws_dep;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/demo")

public class testcontroller {
    @GetMapping("/data")
    public String getData() {
        return "First msg from aws ecs";
    }
}
