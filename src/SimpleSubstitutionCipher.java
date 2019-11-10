/*

 */

import javax.swing.*;//importing the library that allows JOptionPane to work
import java.text.*;

public class  SimpleSubstitutionCipher
{//open program

   
    private String cipherText;
    private String decryptedText;
    private char[] keyAlpha; 
    private String encryptedText;
    public SimpleSubstitutionCipher(String cipherText)
    {
       this.cipherText = cipherText;
       decryptedText = "";
       
    }
    
    public String getCipherText()
    {
        return cipherText;
    }
   
    public String decrypt()
    {
        int cipherLength = cipherText.length();//length
        int letterLocation;//loacation of letter
        
        String result = "";//creates placeholder
           
        
        keyAlpha = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                   ' ', '1', '2', '3', '4', '5', '6', '7', '9', '0'};//makes a place holder array for the key array to switch the letters
        
        String placeHolder = JOptionPane.showInputDialog("Enter in the key:\n(example: abcdefghijklmnopqrstuvwxyz)");//gets key
        for(int i = 0; i < 26; i++)
        {
            keyAlpha[i] = placeHolder.charAt(i);
        }
        
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                   ' ', '1', '2', '3', '4', '5', '6', '7', '9', '0'}; // Makes an array of the alphabet, but includes a space and numbers
           
        for(int i = 0; i < cipherLength; i++)
        {
            char letter = cipherText.charAt(i); // Character that is being read and will be decrypted
            letterLocation = new String(keyAlpha).indexOf(letter); // Location of the letter / space / number in the alphabet array
            result += alphabet[letterLocation];//adds character at location to the result 
        }
        decryptedText = result;
        return decryptedText;
    }
    
    public String encrypt()
    {
        int cipherLength = cipherText.length();
        int letterLocation;
        
        String result = "";
           
        
        keyAlpha = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                   ' ', '1', '2', '3', '4', '5', '6', '7', '9', '0'};//makes a place holder array for the key array to switch the letters
        
        String placeHolder = JOptionPane.showInputDialog("Enter in the key:");
        for(int i = 0; i < 26; i++)
        {
            keyAlpha[i] = placeHolder.charAt(i);
        }
        
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                   ' ', '1', '2', '3', '4', '5', '6', '7', '9', '0'}; // Makes an array of the alphabet, but includes a space and numbers
           
        for(int i = 0; i < cipherLength; i++)
        {
            char letter = cipherText.charAt(i); // Character that is being read and will be decrypted
            letterLocation = new String(alphabet).indexOf(letter); // Location of the letter / space / number in the alphabet array
            result += keyAlpha[letterLocation];
        }
        encryptedText = result;
        return encryptedText;
    }
    
}//close program

