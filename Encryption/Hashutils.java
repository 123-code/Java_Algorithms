// uses libraries, algos not implemented here.

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;

public class Hashutils {
    private static final String SHA2_ALGORITHM = "SHA-256";

    public static byte[] generatesalt(){
        byte[] salt = new byte[16];
        SecureRandom securerandom = new SecureRandom();
        securerandom.nextBytes(salt);
        return salt;
    }

    public static byte[] generatesha256hash(String text,byte[]salt) throws  Exception{
        ByteArrayOutputStream _ByteArrayOutputStream = new ByteArrayOutputStream();
        _ByteArrayOutputStream.write(salt);
        _ByteArrayOutputStream.write(text.getBytes());
        byte[] valueToHash = _ByteArrayOutputStream.toByteArray();

        MessageDigest messagedigest = MessageDigest.getInstance(SHA2_ALGORITHM);
        return messagedigest.digest(valueToHash);


    }

}
