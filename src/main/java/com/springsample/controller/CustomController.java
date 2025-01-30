package com.springsample.controller;

import com.springsample.config.CustomConfig;
import com.springsample.service.CustomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class CustomController {
    private final CustomService customService;


    @GetMapping("/custom")
    public CustomConfig getCustom() {
        return customService.getCustomConfig();
    }

    @GetMapping("/ha")
    public ResponseEntity<String> healthCheckOk() {
        return ResponseEntity.ok(HttpStatus.OK.name());
    }
}
