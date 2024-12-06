package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;

@Service
public class InfiniteFibonacciService {

    public String calculateFibonacci() {
        long a = 0, b = 1, sum;
        StringBuilder result = new StringBuilder("Fibonacci Sequence: ");

        while (true) {
            sum = a + b;
            result.append(sum).append(" ");
            a = b;
            b = sum;
            if (result.length() > 500) {
                break;  // Ne jamais finir réellement
            }
        }
        return result.toString();  // Retourner une très longue séquence Fibonacci infinie
    }
}
