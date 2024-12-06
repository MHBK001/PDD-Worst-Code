package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;

@Service
public class PainEnhancerService {

    private final SomeServiceThatDoesNothing someService;

    public PainEnhancerService(SomeServiceThatDoesNothing someService) {
        this.someService = someService;
    }

    public String enhancePain() {
        String baseMessage = someService.doAbsolutelyNothing();
        return baseMessage + " Maintenant avec encore plus de douleur.";
    }

    public String reverseListItems() {
        return String.join(", ", someService.getSomeList())
                .replaceAll("\\s", "")
                .toUpperCase();
    }
}
