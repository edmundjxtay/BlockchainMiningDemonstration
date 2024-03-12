package com.Bells.Course3Project;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
public class HashHelper
{
    public static String generateHash(String str)
    {
        try {
            //Create instance of a SHA256 message digest
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            //Using getBytes() function to convert each character into a byte for hashing
            //Using digest() hash function to get one dimensional hash byte array of 32 bytes, 256 bits
            byte[] hash = digest.digest(str.getBytes(StandardCharsets.UTF_8));

            //Hexadecimal values to be used to represent the hash instead of Bytes, so we convert Bytes to Hexadecimal
            StringBuilder hexadecimalString = new StringBuilder();
            for (byte b : hash) {
                String hexadecimal = Integer.toHexString(0xff & b);
                if (hexadecimal.length() == 1) hexadecimalString.append('0');
                hexadecimalString.append(hexadecimal);
            }
            return hexadecimalString.toString();
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
