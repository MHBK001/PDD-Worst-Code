package com.pain.pdd.pdddemo.everything;

import org.springframework.stereotype.Service;

@Service
public class ExaggeratedConversionService {

    public String convertNumber(int number) {
        String hex = Integer.toHexString(number);
        String binary = Integer.toBinaryString(number);
        String ascii = String.format("%04d", Integer.parseInt(binary));
        String unicode = "\\u" + Integer.toHexString(number);

        return String.format("Hex: %s, Binary: %s, ASCII: %s, Unicode: %s -> Final Result: %d",
                hex, binary, ascii, unicode, number);
    }
}
