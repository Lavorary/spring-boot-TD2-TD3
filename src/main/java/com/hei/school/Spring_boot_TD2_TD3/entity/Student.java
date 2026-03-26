package com.hei.school.Spring_boot_TD2_TD3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String reference;
    private String firstName;
    private String lastName;
    private int age;
}