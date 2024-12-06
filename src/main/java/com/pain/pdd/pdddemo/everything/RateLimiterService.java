package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;

@Service
public class RateLimiterService {

    private int requestCount = 0;

    public String handleRequest() {
        requestCount++;
        if (requestCount > 5) {
            return "Erreur 503: Trop de requêtes, veuillez patienter.";
        }
        return "Requête traitée avec succès.";
    }
}
