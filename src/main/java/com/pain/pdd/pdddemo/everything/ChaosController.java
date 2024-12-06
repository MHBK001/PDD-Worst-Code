package com.pain.pdd.pdddemo.everything;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/chaos-controller")
public class ChaosController {

    @GetMapping("/doThis")
    public String doThis() {
        return "Je fais ceci, mais pas vraiment.";
    }

    @GetMapping("/orMaybeThat")
    public String orMaybeThat() {
        int randomValue = new Random().nextInt(100);
        if (randomValue > 50) {
            return "On fait ça.";
        } else {
            return "Finalement, non.";
        }
    }

    @GetMapping("/iDontKnow")
    public String iDontKnow() {
        return "Personne ne sait pourquoi ce endpoint existe.";
    }
}
