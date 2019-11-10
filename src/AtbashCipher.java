/**
 * Code that will take an encrypted cipher and decrypt it
 * 
 * @author Damien Klein, Jason Long, Joseph Oh, Daniel Oh
 * @version 11/9/19
 */

import javax.swing.*;//importing the library that allows JOptionPane to work
import java.text.*;

public class AtbashCipher
{//open program
    
    private String cipherText;
    private String decryptedText;
    private String encryptedText;
    
    public AtbashCipher(String cipherText)
    {
       this.cipherText = cipherText;
       decryptedText = "";
       encryptedText = "";
    }
   
    public String getCipherText()
    {
        return cipherText;
    }
    
    public String decrypt()
    {
        int cipherLength = cipherText.length();
           
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                   ' ', '1', '2', '3', '4', '5', '6', '7', '9', '0'}; //Makes an array of the alphabet, but includes a space and numbers
           
        for(int i = 0;  i < cipherLength; i++)
        {
            char letter = cipherText.charAt(i); // Character that is being read and will be decrypted
            int letterLocation = new String(alphabet).indexOf(letter); // Location of the letter / space / number in the alphabet array
            
            if(letterLocation < 26) //If the character in the cipher being read is a letter
            {
                int newLetterLocation = 25 - letterLocation; // Subtracts the location of the letter from 25, to determine the decrypted letter
                char newLetter = alphabet[newLetterLocation]; // Sets the new letter equal to the decrypted letter
                decryptedText += newLetter; // Adds the decrypted letter to the decrypted text
            }               
            else if(letterLocation >= 26) //If the character in the cipher being decrypted is a space or number
            {
                int newLetterLocation = letterLocation; // Since the character isn't a letter, it can't be mirrored, therefore the character remains the same
                char newLetter = alphabet[newLetterLocation]; // Sets the new character equal to the decrypted character
                decryptedText += newLetter; // Adds the "decrypted" character to the decrypted text  
            }
            
        }
        
        return decryptedText;
    }
    
    public String encrypt()
    {
    	int cipherLength = cipherText.length();
        
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                   ' ', '1', '2', '3', '4', '5', '6', '7', '9', '0'}; //Makes an array of the alphabet, but includes a space and numbers
           
        for(int i = 0;  i < cipherLength; i++)
        {
            char letter = cipherText.charAt(i); // Character that is being read and will be decrypted
            int letterLocation = new String(alphabet).indexOf(letter); // Location of the letter / space / number in the alphabet array
            
            if(letterLocation < 26) //If the character in the cipher being read is a letter
            {
                int newLetterLocation = 25 - letterLocation; // Subtracts the location of the letter from 25, to determine the decrypted letter
                char newLetter = alphabet[newLetterLocation]; // Sets the new letter equal to the decrypted letter
                encryptedText += newLetter; // Adds the decrypted letter to the decrypted text
            }               
            else if(letterLocation >= 26) //If the character in the cipher being decrypted is a space or number
            {
                int newLetterLocation = letterLocation; // Since the character isn't a letter, it can't be mirrored, therefore the character remains the same
                char newLetter = alphabet[newLetterLocation]; // Sets the new character equal to the decrypted character
                encryptedText += newLetter; // Adds the "decrypted" character to the decrypted text
                
            }
            
        }
        
        return encryptedText;
    }
}//close program
