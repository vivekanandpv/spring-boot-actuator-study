package com.vivekanandpv.springbootactuatorstudy.services;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class FooServiceImplementation implements FooService {
    private final Timer timer;

    public FooServiceImplementation(MeterRegistry registry) {
        //  custom name for the timer
        this.timer = registry.timer("long.running.service.timer");
    }

    @Override
    public String getMessage() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        String value = "Hello, world!";
        long end = System.currentTimeMillis();
        timer.record(end - start, TimeUnit.MILLISECONDS);
        return value;
    }
}
