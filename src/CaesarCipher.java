/**
 * Code that will take an encrypted cipher and decrypt it
 * 
 * @author Damien Klein, Jason Long, Joseph Oh, Daniel Oh
 * @version 11/9/19
 */

import javax.swing.*; // importing the library that allows JOptionPane to work
import java.text.*;

public class  CaesarCipher
{//open program
    
    private String cipherText;
    private String decryptedText;
    private String encryptedText;
    
    public CaesarCipher(String cipherText)
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
	   int shift = Integer.parseInt(JOptionPane.showInputDialog("What is the shift?")); // User chooses shift
	   
	   int cipherLength = cipherText.length();
       int newLetterLocation;
       int index;
       char newLetter;
       
       char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
       ' ', '1', '2', '3', '4', '5', '6', '7', '9', '0'}; //Makes an array of the alphabet, but includes a space and numbers
          
       for(int i = 0;  i < cipherLength; i++)
       {
           char letter = cipherText.charAt(i); //Character that is being read and will be decrypted
           int letterLocation = new String(alphabet).indexOf(letter); //Location of the letter / space / number in the alphabet array
           
           if(letterLocation <= (shift - 1)) // If the character is between a and m
           {
               newLetterLocation = 25 - ((shift - 1) - letterLocation); // Finds which letter the new letter is
               newLetter = alphabet[newLetterLocation]; // Sets the new character equal to the decrypted character
               decryptedText += newLetter; // Adds the decrypted character to the decrypted text
           }
              
           else if(letterLocation > (shift - 1)) // If the character is between n and z
           {
               newLetterLocation = letterLocation - shift; // Finds which letter the new letter is
               newLetter = alphabet[newLetterLocation]; // Sets the new character equal to the decrypted character
               decryptedText += newLetter; // Adds the decrypted character to the decrypted text
           }
              
           else if(letterLocation > 25) // If the character is not a letter
           {
               newLetter = alphabet[letterLocation]; // Since the character isn't a letter, it can't be converted, therefore the character remains the same
               decryptedText += newLetter; // Adds the "decrypted" character to the decrypted text
           }
       }
	   
       return decryptedText;
    }
    
    public String encrypt()
    {
    	int shift = Integer.parseInt(JOptionPane.showInputDialog("What is the shift?")); // User chooses shift
    	
    	int cipherLength = cipherText.length();
        int newLetterLocation;
        int index;
        char newLetter;
        
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        ' ', '1', '2', '3', '4', '5', '6', '7', '9', '0'}; //Makes an array of the alphabet, but includes a space and numbers
           
        for(int i = 0;  i < cipherLength; i++)
        {
            char letter = cipherText.charAt(i); //Character that is being read and will be decrypted
            int letterLocation = new String(alphabet).indexOf(letter); //Location of the letter / space / number in the alphabet array
            
            if(letterLocation < shift)
            {
            	newLetterLocation = letterLocation + shift;
            	newLetter = alphabet[newLetterLocation];
            	encryptedText += newLetter;
            }
            
            if(letterLocation >= shift)
            {
            	newLetterLocation = letterLocation - shift;
            	newLetter = alphabet[newLetterLocation];
            	encryptedText += newLetter;
            }
            
            else if(letterLocation > 25)
            {
            	newLetter = alphabet[letterLocation];
            	encryptedText += newLetter;
            }
        }
        
        return encryptedText;
    }
}//close program