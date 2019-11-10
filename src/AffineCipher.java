import javax.swing.JOptionPane;
import java.util.Arrays;
import java.math.*;
import java.util.Scanner;

/**
 * Code that will take an encrypted cipher and decrypt it
 * 
 * @author Damien Klein, Jason Long, Joseph Oh, Daniel Oh
 * @version 11/9/19
 */

public class AffineCipher
{
    private String cipherText;
    private String decryptedText;
    private String encryptedText;
	
	public AffineCipher(String cipherText)
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
            String alphaInt, betaInt;
            do
            {
                alphaInt =JOptionPane.showInputDialog("What is the first number (Must be odd and under 26 and not 13)?");
                
                if(Integer.parseInt(alphaInt)%2==0||Integer.parseInt(alphaInt)==13)
                {
                    JOptionPane.showMessageDialog(null,"You didn't follow directions! Pick again!");
                }
            }
            while(Integer.parseInt(alphaInt)%2==0||Integer.parseInt(alphaInt)==13);
            
            do
            {
                betaInt = JOptionPane.showInputDialog("What is the second number (any positive number 26 and under)?");
                if(Integer.parseInt(betaInt)>26)
                {
                    JOptionPane.showMessageDialog(null, "You didn't follow directions! Pick again! ");
                }
            }
            while(Integer.parseInt(betaInt)>26);
            
            BigInteger alphaBigInt = new BigInteger(alphaInt);
            BigInteger betaBigInt = new BigInteger(betaInt);
            BigInteger twentySix = new BigInteger("26");
            BigInteger key = alphaBigInt.modInverse(twentySix);
            
            String keyString = "" + key;
            
            char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                ' ', '1', '2', '3', '4', '5', '6', '7', '9', '0'}; //Makes an array of the alphabet, but includes a space and numbers
            int cipherLength = cipherText.length();
            int formula = 0;
            String cipherTextNoCaps = cipherText.toLowerCase( );
            int inAlphabetRange = 0;
            
            for(int i = 0; i < cipherLength; i++)
            {                
                char letter = cipherTextNoCaps.charAt(i); // Character that is being read and will be decrypted
                int letterLocation = new String(alphabet).indexOf(letter); // Location of the letter / space / number in the alphabet array

                if(letterLocation < 26)
                {                    
                    formula = Integer.parseInt(keyString) * (letterLocation - Integer.parseInt(betaInt));
                    
                    if(formula >= 0)
                    {
                        inAlphabetRange = formula % 26;
                    }
                    
                    else
                    {
                        do
            		{
                            inAlphabetRange = formula;
                            formula += 26;
            		}
            		while(inAlphabetRange < 0);
                    }
                    
                    int newLetterLocation = inAlphabetRange;
                    char newLetter = alphabet[newLetterLocation];
                    decryptedText += newLetter;
                }
                
                else if(letterLocation >= 26)
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
		int alphaInt = Integer.parseInt(JOptionPane.showInputDialog("What is the first number (Must be odd and under 26 and not 13)?"));
		int betaInt = Integer.parseInt(JOptionPane.showInputDialog("What is the second number (any positive number 26 and under)?"));
		
		char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                ' ', '1', '2', '3', '4', '5', '6', '7', '9', '0'}; //Makes an array of the alphabet, but includes a space and numbers
		int cipherLength = cipherText.length();
		String cipherTextNoCaps = cipherText.toLowerCase();
		
		for(int i = 0; i < cipherLength; i++)
		{
			char letter = cipherTextNoCaps.charAt(i); // Character that is being read and will be decrypted
            int letterLocation = new String(alphabet).indexOf(letter); // Location of the letter / space / number in the alphabet array
            
            if(letterLocation < 26)
            {
            	int newLetterLocation = ((alphaInt * letterLocation) + betaInt) % 26;
            	char newLetter = alphabet[newLetterLocation]; // Sets the new letter equal to the decrypted letter
            	encryptedText += newLetter; // Adds the decrypted letter to the decrypted text
            }
            
            else if(letterLocation >= 26)
            {
            	int newLetterLocation = letterLocation; // Since the character isn't a letter, it can't be mirrored, therefore the character remains the same
                char newLetter = alphabet[newLetterLocation]; // Sets the new character equal to the decrypted character
                encryptedText += newLetter; // Adds the "decrypted" character to the decrypted text           
            }
		}
		
		return encryptedText;
	}
}