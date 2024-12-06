package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;

@Service
public class InfiniteProgressionService {

    public String getProgress() {
        int progress = 0;
        while (progress <= 100) {
            progress++;
            if (progress == 100) {
                progress = 0;  // Recommencer à 0 pour créer une progression infinie
            }
        }
        return "Tâche terminée à " + progress + "%... mais cela ne finira jamais.";
    }
}
