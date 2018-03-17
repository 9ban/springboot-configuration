package com.example.config.demo;

import java.time.Duration;
import java.time.Instant;

public class DurationTester {

    public static void main(String[] args) {
        Instant startTime = Instant.now();
        Instant endTime = startTime.plus(Duration.ofDays(1));
        System.out.println(startTime);
        System.out.println(endTime);
    }
}
