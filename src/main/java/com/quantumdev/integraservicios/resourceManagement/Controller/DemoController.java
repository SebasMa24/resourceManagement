package com.quantumdev.integraservicios.resourceManagement.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/v1/resource")
public class DemoController {
    @PostMapping("/public")
    public String welcome1()
    {
        return "Welcome to a public endpoint at resourceManagement microservice";
    }
    @PostMapping("/demo")
    public String welcome()
    {
        return "Welcome from secure endpoint at resourceManagement microservice";
    }
}
