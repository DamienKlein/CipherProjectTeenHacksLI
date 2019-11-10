/**
 * Code that will take an encrypted cipher and decrypt it
 * 
 * @author Damien Klein, Jason Long, Joseph Oh, Daniel Oh
 * @version 11/9/19
 */

import java.util.HashMap;

public class PolybiusSquareCipher
{
    private String cipherText;
    private String decryptedText;
    private String encryptedText;

    public PolybiusSquareCipher(String cipherText)
    {
        this.cipherText = cipherText; // Text that will be decrypted
        decryptedText = "";
        encryptedText = "";
    }

    public String decrypt()
    {
        HashMap<String, String> key = new HashMap<>(); // Initializes HashMap that hold the polybius square matrix
        int cipherLength = cipherText.length(); // Length of the cipher text
        
        key.put("11", "A"); // A is located at row 1, column 1
        key.put("12", "B"); // ^
        key.put("13", "C"); // ^
        key.put("14", "D"); // ^
        key.put("15", "E"); // ^
        key.put("21", "F"); // ^
        key.put("22", "G"); // ^
        key.put("23", "H"); // ^
        key.put("24", "[I/J]"); // ^
        key.put("25", "K"); // ^
        key.put("31", "L"); // ^
        key.put("32", "M"); // ^
        key.put("33", "N"); // ^
        key.put("34", "O"); // ^
        key.put("35", "P"); // ^
        key.put("41", "Q"); // ^
        key.put("42", "R"); // ^
        key.put("43", "S"); // ^
        key.put("44", "T"); // ^
        key.put("45", "U"); // ^
        key.put("51", "V"); // ^
        key.put("52", "W"); // ^
        key.put("53", "X"); // ^
        key.put("54", "Y"); // ^
        key.put("55", "Z"); // ^

        String decryptedText = ""; // Declares and initializes output that will be added to after text is decrypted
        
        for (int i = 0; i < cipherLength; i+=2) // Gets each of the characters at every coordinate
        {
            String point = cipherText.substring(i, i + 2);  // ^
            String c = key.get(point); // Gets character stored in points
            decryptedText += c; // Adds decrypted character to the output
        }
        
        return decryptedText; // Returns decrypted text
    }
    
    public String encrypt()
    {
    	HashMap<String, String> key = new HashMap<>(); // Initializes HashMap that hold the polybius square matrix
        int cipherLength = cipherText.length(); // Length of the cipher text
        
        key.put("11", "A"); // A is located at row 1, column 1
        key.put("12", "B"); // ^
        key.put("13", "C"); // ^
        key.put("14", "D"); // ^
        key.put("15", "E"); // ^
        key.put("21", "F"); // ^
        key.put("22", "G"); // ^
        key.put("23", "H"); // ^
        key.put("24", "[I/J]"); // ^
        key.put("25", "K"); // ^
        key.put("31", "L"); // ^
        key.put("32", "M"); // ^
        key.put("33", "N"); // ^
        key.put("34", "O"); // ^
        key.put("35", "P"); // ^
        key.put("41", "Q"); // ^
        key.put("42", "R"); // ^
        key.put("43", "S"); // ^
        key.put("44", "T"); // ^
        key.put("45", "U"); // ^
        key.put("51", "V"); // ^
        key.put("52", "W"); // ^
        key.put("53", "X"); // ^
        key.put("54", "Y"); // ^
        key.put("55", "Z"); // ^

        String encryptedText = ""; // Declares and initializes output that will be added to after text is decrypted
        
        for (int i = 0; i < cipherLength; i+=2) // Gets each of the characters at every coordinate
        {
            String point = cipherText.substring(i, i + 2);  // ^
            String c = key.get(point); // Gets character stored in points
            encryptedText += c; // Adds decrypted character to the output
        }
        
        return encryptedText; // Returns decrypted text
    }
}