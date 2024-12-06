package com.pain.pdd.pdddemo.everything;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vowel-counter")
public class VowelCounterController {

    private final VowelCounterService vowelCounterService;

    @Autowired
    public VowelCounterController(VowelCounterService vowelCounterService) {
        this.vowelCounterService = vowelCounterService;
    }

    @GetMapping("/count")
    public String countVowelsInSampleText() {
        String sampleText = vowelCounterService.getSampleText();
        int vowelCount = vowelCounterService.countVowels(sampleText);
        return "Sample text: \"" + sampleText + "\" contains " + vowelCount + " vowels.";
    }
}
