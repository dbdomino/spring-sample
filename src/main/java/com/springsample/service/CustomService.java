package com.springsample.service;

import com.springsample.config.CustomConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomService {
    private final CustomConfig customConfig;

    public CustomConfig getCustomConfig() {
        return customConfig;
    }
}
