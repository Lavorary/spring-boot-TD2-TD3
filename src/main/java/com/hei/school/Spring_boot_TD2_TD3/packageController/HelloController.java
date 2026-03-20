package com.hei.school.Spring_boot_TD2_TD3.packageController;

import com.hei.school.Spring_boot_TD2_TD3.packageService.ClasseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ClasseService classeService;

    public HelloController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return classeService.getHelloMessage();
    }
}