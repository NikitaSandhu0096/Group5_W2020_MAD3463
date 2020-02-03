package com.lambton.util;

import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import org.apache.commons.codec.binary.Base64;

public class TrippleDes {                   //http://blog.icodejava.com/tag/java-tutorial-triple-des-encryption/

    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    private KeySpec ks;
    private SecretKeyFactory skf;
    private Cipher cipher;
    byte[] arrayBytes;
    private String myEncryptionKey;
    private String myEncryptionScheme;
    SecretKey key;
    private static TrippleDes trippleDes = null;

    private TrippleDes()  {
        myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
    }

    public static TrippleDes getInstance()
    {
        if (trippleDes == null)
            trippleDes = new TrippleDes();
        return trippleDes;
    }

    public void setEncryptionKey(String myEncryptionKey) throws Exception {
        arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
        ks = new DESedeKeySpec(arrayBytes);
        skf = SecretKeyFactory.getInstance(myEncryptionScheme);
        cipher = Cipher.getInstance(myEncryptionScheme);
        key = skf.generateSecret(ks);

    }

    public String encrypt(String unencryptedString,String secretKey) throws Exception { //http://www.java-redefined.com/2013/08/symmetric-and-asymmetric-key-encryption.html
        String encryptedString = null;
        setEncryptionKey(secretKey);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
        byte[] encryptedText = cipher.doFinal(plainText);
        encryptedString = new String(Base64.encodeBase64(encryptedText));
        return encryptedString;
    }


    public String decrypt(String encryptedString,String secretKey) throws Exception {
        String decryptedText = null;
        setEncryptionKey(secretKey);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] encryptedText = Base64.decodeBase64(encryptedString);
        byte[] plainText = cipher.doFinal(encryptedText);
        decryptedText = new String(plainText);
        return decryptedText;
    }
}
