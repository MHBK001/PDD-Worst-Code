package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;

@Service
public class VowelCounterService {

    public int countVowels(String input) {
        if (input == null) return 0;
        return (int) input.chars()
                .filter(c -> "AEIOUaeiou".indexOf(c) >= 0)
                .count();
    }
    public String getSampleText() {
        return "Pain Driven Development is the best!";
    }
}
