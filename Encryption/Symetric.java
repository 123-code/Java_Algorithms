package Encryption;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class Symetric {
    private static final String AES = "AES";
    private static final String AES_CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";


    public static SecretKey CreateKey() throws Exception{
        SecureRandom securerandom = new SecureRandom();
        KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
        keyGenerator.init(256,securerandom);
        return keyGenerator.generateKey();
    }


    // init vector for the cryptographic algorithm. 
    public static byte[] createinitvector(){
        byte[] initvector = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(initvector);
        return initvector;

    }

    public static byte[] performAESEncryption(String PLAIN_TEXT,SecretKey Secret_key,byte initvector) throws Exception{
        Cipher cipher = Cipher.getInstance(AES_CIPHER_ALGORITHM);
        IvParameterSpec ivParameterSpec = new vParameterSpec(initvector);
        cipher.init(Cipher.ENCRYPT_MODE,Secret_Key, ivParameterSpec);
        return cipher.doFinal(plainText.getBytes());


    }

    public static String decrypt(byte[] ciphertext,SecretKey secretkey,byte[]initvector) throws Exception{
        Cipher cipher = Cipher.getInstance(AES_CIPHER_ALGORITHM);
        IvParameterSpec ivParameterSpec = new vParameterSpec(initvector);
        cipher.init(Cipher.DECRYPT_MODE,Secret_Key, ivParameterSpec);
       byte[] result = cipher.doFinal(ciphertext);
       return new String(result);
       
    }
}
