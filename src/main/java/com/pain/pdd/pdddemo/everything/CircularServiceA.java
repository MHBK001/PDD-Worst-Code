package com.pain.pdd.pdddemo.everything;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CircularServiceA {

    private final CircularServiceB circularServiceB;

    public CircularServiceA(@Lazy CircularServiceB circularServiceB) {
        this.circularServiceB = circularServiceB;
    }

    public String getServiceAResponse() {
        return "Service A appelle " + circularServiceB.getServiceBResponse();
    }
}
