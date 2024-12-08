package com.dev;

import java.util.stream.Collectors;

public class CaesarCipher {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        String encryptedText = "Wklv lv d whvw phvvdjh";

        for (int shift = 1; shift < 26; shift++) {
            String decryptedText = decryptCaesarCipher(encryptedText, shift);
            System.out.println("Shift " + shift + ": " + decryptedText);
        }
    }

    public static String decryptCaesarCipher(String text, int shift) {
        return text.chars()
                .mapToObj(c -> {
                    if (Character.isLetter(c)) {
                        char base = Character.isLowerCase(c) ? 'a' : 'A';
                        return (char) ((c - base - shift + 26) % 26 + base);
                    } else {
                        return (char) c;
                    }
                })
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
