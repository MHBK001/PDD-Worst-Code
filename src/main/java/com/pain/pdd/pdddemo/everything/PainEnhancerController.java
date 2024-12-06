package com.pain.pdd.pdddemo.everything;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pain-enhancer")
public class PainEnhancerController {

    private final PainEnhancerService painEnhancerService;

    @Autowired
    public PainEnhancerController(PainEnhancerService painEnhancerService) {
        this.painEnhancerService = painEnhancerService;
    }

    @GetMapping("/enhance")
    public String enhancePain() {
        return painEnhancerService.enhancePain();
    }

    @GetMapping("/reverse")
    public String reverseItems() {
        return painEnhancerService.reverseListItems();
    }
    @GetMapping("/force-error")
    public String forceError() {
        throw new RuntimeException("Erreur simulée pour aucune bonne raison.");
    }

}
