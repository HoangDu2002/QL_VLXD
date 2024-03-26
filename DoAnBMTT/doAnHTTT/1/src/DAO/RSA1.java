/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.util.Base64;

/**
 *
 * @author HUNG
 */
public class RSA1 {

    public static String rsa1(String msg) throws NoSuchAlgorithmException,
            NoSuchPaddingException,
            InvalidKeyException,
            IllegalBlockSizeException,
            BadPaddingException {
        KeyPairGenerator keyPairGenerator
                = KeyPairGenerator.getInstance("RSA");
        SecureRandom secureRandom = new SecureRandom();

        keyPairGenerator.initialize(515, secureRandom);

        KeyPair pair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = pair.getPublic();

        String publicKeyString
                = Base64.getEncoder().encodeToString(publicKey.getEncoded());

        System.out.println("public key = " + publicKeyString);

        PrivateKey privateKey = pair.getPrivate();

        String privateKeyString
                = Base64.getEncoder().encodeToString(privateKey.getEncoded());

        System.out.println("private key = " + privateKeyString);
        Cipher encryptionCipher = Cipher.getInstance("RSA");
        encryptionCipher.init(Cipher.ENCRYPT_MODE, privateKey);

        byte[] encryptedMessage
                = encryptionCipher.doFinal(msg.getBytes());
        String encryption
                = Base64.getEncoder().encodeToString(encryptedMessage);
        return encryption;
    }
     
}
