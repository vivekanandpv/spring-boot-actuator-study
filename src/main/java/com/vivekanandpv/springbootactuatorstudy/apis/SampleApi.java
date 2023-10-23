package com.vivekanandpv.springbootactuatorstudy.apis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {
    @GetMapping
    public ResponseEntity<?> getGreeting() {
        Map<String, String> map = Map.of("greeting", "Hello there!");
        return ResponseEntity.ok(map);
    }
}
