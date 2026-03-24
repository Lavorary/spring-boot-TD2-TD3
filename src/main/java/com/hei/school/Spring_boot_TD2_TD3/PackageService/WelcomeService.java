package com.hei.school.Spring_boot_TD2_TD3.PackageService;

import org.springframework.stereotype.Service;


@Service
public class WelcomeService {
    public String welcome(String name) {
        return "Welcome " + name;
    }
}
