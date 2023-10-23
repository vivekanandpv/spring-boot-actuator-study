package com.vivekanandpv.springbootactuatorstudy.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class AppHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health
                .down()
                .withDetail("response_code", "500")
                .withDetail("response_message", "demonstration")
                .build();
    }
}
