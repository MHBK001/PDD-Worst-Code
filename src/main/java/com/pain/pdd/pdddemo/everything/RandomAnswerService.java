package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class RandomAnswerService {

    private final String[] answers = {
            "L'éléphant dans la pièce est une illusion.",
            "Les chaussettes disparaissent toujours après le lavage.",
            "Il pleut des hamburgers sur la planète Zog.",
            "Le code parfait n'existe pas, seulement des erreurs existentielles.",
            "Le pain est une philosophie, pas un aliment."
    };

    public String getRandomAnswer() {
        Random random = new Random();
        int index = random.nextInt(answers.length);
        return answers[index];
    }
}
