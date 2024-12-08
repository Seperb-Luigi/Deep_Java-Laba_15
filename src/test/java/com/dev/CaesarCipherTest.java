package com.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CaesarCipherTest {

    @Test
    public void testDecryptCaesarCipher() {
        String encryptedText = "wklv lv d whvw phvvdjh";
        int shift = 3;
        String expectedDecryptedText = "this is a test message";

        String actualDecryptedText = CaesarCipher.decryptCaesarCipher(encryptedText, shift);

        assertEquals(expectedDecryptedText, actualDecryptedText);
    }
}
