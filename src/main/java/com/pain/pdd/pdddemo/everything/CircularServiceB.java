package com.pain.pdd.pdddemo.everything;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CircularServiceB {

    private final CircularServiceA circularServiceA;

    public CircularServiceB(@Lazy CircularServiceA circularServiceA) {
        this.circularServiceA = circularServiceA;
    }

    public String getServiceBResponse() {
        return "Service B appelle " + circularServiceA.getServiceAResponse();
    }
}
