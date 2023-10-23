package com.vivekanandpv.springbootactuatorstudy.apis;

import com.vivekanandpv.springbootactuatorstudy.services.FooService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {
    private final FooService service;

    public SampleApi(FooService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> getGreeting() throws InterruptedException {
        Map<String, String> map = Map.of("greeting", service.getMessage());
        return ResponseEntity.ok(map);
    }
}
