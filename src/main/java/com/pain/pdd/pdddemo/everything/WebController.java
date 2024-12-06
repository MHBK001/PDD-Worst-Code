package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";  // Ce fichier HTML sera servi depuis src/main/resources/templates/
    }
}
