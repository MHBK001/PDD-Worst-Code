package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomResponseService {

    private final String[] responses = {
            "Le pain est la base de tout.",
            "Le développement est un voyage.",
            "Il n'y a pas de règles dans PDD, seulement des douleurs.",
            "Absurdité est une forme d'art.",
            "Un code parfait n'existe pas, seulement des erreurs qui vous font sourire."
    };

    public String getRandomResponse() {
        Random random = new Random();
        int index = random.nextInt(responses.length);
        return responses[index];
    }
}
