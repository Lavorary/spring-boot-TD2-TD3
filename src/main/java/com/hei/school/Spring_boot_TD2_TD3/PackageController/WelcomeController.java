package com.hei.school.Spring_boot_TD2_TD3.PackageController;

import com.hei.school.Spring_boot_TD2_TD3.PackageService.WelcomeService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Data
@RequiredArgsConstructor
@RestController
public class WelcomeController {
    private final WelcomeService welcomeService;

    @GetMapping("/welcome")
    public String welcome(@RequestParam String name) {
        if (name == null) {
            return "name required";
        }
        return welcomeService.welcome(name);
    }
}