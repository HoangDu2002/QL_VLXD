/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.File;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;

/**
 *
 * @author Asus
 */
public class RSA {

    public static PublicKey generatePublicKey() throws Exception {
        // Create a KeyPairGenerator object.
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

        // Initialize the KeyPairGenerator object.
        keyPairGenerator.initialize(2048);

        // Generate the key pair.
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the public key.
        PublicKey publicKey = keyPair.getPublic();

        return publicKey;
    }

    public static String encrypt(String message, PublicKey publicKey) throws Exception {
        // Convert the message to a byte array.
        byte[] messageBytes = message.getBytes();

        // Create a Cipher object.
        Cipher cipher = Cipher.getInstance("RSA");

        // Initialize the Cipher object for encryption.
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        // Encrypt the message.
        byte[] encryptedBytes = cipher.doFinal(messageBytes);

        // Convert the encrypted bytes to a string.
        String encryptedMessage = Base64.getEncoder().encodeToString(encryptedBytes);

        return encryptedMessage;
    }

    public static PublicKey getPublicKey() throws Exception {
        byte[] keyBytes = Files.readAllBytes(new File(GenerateKeys.PUBLIC_KEY_FILE).toPath());
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    public static PrivateKey getPrivateKey() throws Exception {
        byte[] keyBytes = Files.readAllBytes(new File(GenerateKeys.PRIVATE_KEY_FILE).toPath());
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

    public static String rsa_encrypt(String mgs) throws Exception {
        PublicKey publicKey = getPublicKey();
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] byteEncrypted = cipher.doFinal(mgs.getBytes());
        String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);

        return encrypted;
    }

    public static String rsa_encrypt1(String mgs) throws Exception {

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Mã hóa dữ liệu bằng khóa công khai
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(mgs.getBytes());
        String encrypted = Base64.getEncoder().encodeToString(encryptedBytes);
        return encrypted;
    }
}
