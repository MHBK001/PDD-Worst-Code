package com.pain.pdd.pdddemo.everything;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/everything")
public class EverythingController {

    @Autowired
    private SomeServiceThatDoesNothing someService;

    @GetMapping("/list-all")
    public String listEverything() {
        List<String> list = someService.getSomeList();
        return String.join(", ", list);
    }
}
