package com.pain.pdd.pdddemo.everything;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/circular-dependency")
public class CircularDependencyController {

    private final CircularServiceA circularServiceA;

    @Autowired
    public CircularDependencyController(CircularServiceA circularServiceA) {
        this.circularServiceA = circularServiceA;
    }

    @GetMapping("/test")
    public String testCircularDependency() {
        return circularServiceA.getServiceAResponse();
    }
}
