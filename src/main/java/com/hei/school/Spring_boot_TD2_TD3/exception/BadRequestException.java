package com.hei.school.Spring_boot_TD2_TD3.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}