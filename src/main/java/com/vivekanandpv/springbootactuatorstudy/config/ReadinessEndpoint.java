package com.vivekanandpv.springbootactuatorstudy.config;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//  this endpoint needs to be exposed in application.properties
@Component
@Endpoint(id = "app.readiness")
public class ReadinessEndpoint {
    private String status = "NOT_READY";

    @ReadOperation
    public String getStatus() {
        return status;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void setStatus() {
        this.status = "READY";
    }
}
