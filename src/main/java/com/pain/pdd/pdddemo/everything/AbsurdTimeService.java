package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;
import java.time.LocalTime;

@Service
public class AbsurdTimeService {

    public String getAbsurdTime() {
        LocalTime now = LocalTime.now();
        int absurdSum = now.getHour() + now.getMinute() + now.getSecond();
        return "L'heure actuelle est " + now + ", mais la somme absurde de l'heure, des minutes et des secondes est : " + absurdSum;
    }
}
