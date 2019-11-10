 /**
 * Code that will take an encrypted cipher and decrypt it
 * 
 * @author Damien Klein, Jason Long, Joseph Oh, Daniel Oh
 * @version 11/9/19
 */

import javax.swing.*;//importing the library that allows JOptionPane to work
import java.text.*;
import java.lang.*;

public class  BaconianCipher
{//open program
    
    private String cipherText;
    private String decryptedText;
    private String encryptedText;
    
    public BaconianCipher(String cipherText)
    {
       this.cipherText = cipherText; // Text that will be decrypted
       decryptedText = "";
       encryptedText = "";
    }
    
    public String getCipherText()
    {
        return cipherText;
    }
    
    public String decrypt()
    {
    	String newLetter = ""; // New letter after decryption - Has to be string rather than char because i and k, and u and v are equal, so decrypted letter are "i/j" and "u/v"
 	    String divided = ""; // Cipher text is divided into segments of 5, which allows for each segment to be decypted according to decryption formula
 	    
 	    boolean uppercase1 = false; // Boolean the becomes true if the 1st letter in the segment of 5 is uppercase
 	    boolean uppercase2 = false; // ^
 	    boolean uppercase3 = false; // ^
 	    boolean uppercase4 = false; // ^
 	    boolean uppercase5 = false; // ^
 	    
 	    String cipherWithoutSpaces = cipherText.replaceAll("\\s+", ""); // Removes spaces from cipher text, allowing for easier decryption
 	    cipherWithoutSpaces = cipherWithoutSpaces.replaceAll("\\p{Punct}", ""); // Removes punctuation from cipher text, which is necessary for decryption
 	    int numDivisions = cipherWithoutSpaces.length() / 5; // Separates the cipher text into segments of 5
 	    
        for(int i = 0; i < numDivisions; i++) // Does the following for each segment
 	    {
        	for(int ii = 0; ii < 5; ii++) // Does the following segment by segment
        	{
        		divided += cipherWithoutSpaces.charAt(ii + (5 * i)); // Sets the cipher text that will be decrypted into a segment of 5
        	}
        	
        	if(Character.isUpperCase(divided.charAt(0))) // Checks if the letter in the first position is capitalized
        	{
        		uppercase1 = true; // Boolean becomes true when this letter is capitalized
        	}
        	
        	if(Character.isUpperCase(divided.charAt(1))) // ^
        	{
        		uppercase2 = true; // ^
        	}
        	
        	if(Character.isUpperCase(divided.charAt(2))) // ^
        	{
        		uppercase3 = true; // ^
        	}
        	
        	if(Character.isUpperCase(divided.charAt(3))) // ^
        	{
        		uppercase4 = true; // ^
        	}
        	
        	if(Character.isUpperCase(divided.charAt(4))) // ^
        	{
        		uppercase5 = true; // ^	 
        	}
        	
        	BaconianIndex temp = new BaconianIndex(); // Creates a temporary object that can access the BaconianIndex class, which holds the information that will output the correct new letter
        	newLetter = temp.getNewLetter(uppercase1, uppercase2, uppercase3, uppercase4, uppercase5); // Send the information needed for determining the new letter to the BaconianIndex class
        	
        	divided = ""; // Resets the segment to be tested so that a new one can be used
        	
        	uppercase1 = false; // Resets the booleans that determine the new letter
        	uppercase2 = false; // ^
        	uppercase3 = false; // ^
        	uppercase4 = false; // ^
        	uppercase5 = false; // ^
        	
        	decryptedText += newLetter; // Adds the decrypted letter to the decrypted text
 	    }
        
        return decryptedText; // Returns the decrypted text
    }
    
    public String encrypt()
    {
    	BaconianIndex temp = new BaconianIndex();
        String newLetter = ""; // New letter after decryption - Has to be string rather than char because i and k, and u and v are equal, so decrypted letter are "i/j" and "u/v"
        int cipherLength = cipherText.length(); // Length of the cipher text
        String placeHolder = "";
        
        for(int i = 0; i < cipherLength; i++)
        {
            placeHolder += cipherText.charAt(i);
            encryptedText += temp.getNewFiveLetter(placeHolder);
            placeHolder = "";
            
        }
 	
        return encryptedText; // Returns the decrypted text
    }
}
