package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UselessCacheService {

    private final Map<String, String> cache = new HashMap<>();

    public String cacheData(String key, String value) {
        cache.put(key, value);
        return "Donnée mise en cache pour la clé : " + key;
    }

    public String getCachedData(String key) {
        return cache.getOrDefault(key, "Donnée non trouvée dans le cache.");
    }
}
