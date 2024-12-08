package com.dev;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CaesarCipherTest {
    @Test
    public void testDecryptCaesarCipher() {
        String encryptedText = "Technical Specification";
        int shift = 9;
        String expectedDecryptedText = "Kvtyeztrc Jgvtzwztrkzfe";
        String actualDecryptedText = CaesarCipher.decryptCaesarCipher(encryptedText, shift);
        assertEquals(expectedDecryptedText, actualDecryptedText);
    }
}
