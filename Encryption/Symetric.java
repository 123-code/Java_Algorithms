package Encryption;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Symetric {
    private static final String AES = "AES";

    public static SecretKey CreateKey() throws Exception{
        SecureRandom securerandom = new SecureRandom();
        KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
        keyGenerator.init(256,securerandom);
        return keyGenerator.generateKey();
    }

}
