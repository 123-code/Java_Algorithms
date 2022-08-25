package Encryption;

import javax.crypto.SecretKey;
import jakarta.xml.bind.DatatypeConverter;
import org.junit.Test;

public class SymetricTest {
    @Test
    public void testCreateKey() throws Exception {
SecretKey key = Symetric.CreateKey();

System.out.println(DatatypeConverter.printHexBinary.getEncoded());
    }
}
