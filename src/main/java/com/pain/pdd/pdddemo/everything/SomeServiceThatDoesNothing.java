package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SomeServiceThatDoesNothing {

    public String doAbsolutelyNothing() {
        return "Je fais semblant d'être utile, mais en fait, je ne suis qu'une perte de temps.";
    }

    public String overlyComplicatedLogic() {
        return "Si a = b et b = c, alors pourquoi pas ?";
    }

    public List<String> getSomeList() {
        List<String> baseList = Arrays.asList("Pain", "Driven", "Development", "Rules");
        List<String> newList = new ArrayList<>();
        for (String word : baseList) {
            for (int i = 0; i < 3; i++) { // Répéter chaque mot 3 fois
                newList.add(word + " " + i);
            }
        }
        return newList;
    }

}

