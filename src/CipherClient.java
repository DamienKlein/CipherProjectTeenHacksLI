/**
 * Code that will take an encrypted cipher and decrypt it
 * 
 * @author Damien Klein, Jason Long, Joseph Oh, Daniel Oh
 * @version 11/9/19
 */

import javax.swing.*; 

public class CipherClient
{   
    public static AtbashCipher AtbashCipher1;
    public static ROT13Cipher ROT13Cipher1;
    public static CaesarCipher CaesarCipher1;
    public static BaconianCipher BaconianCipher1;
    public static SimpleSubstitutionCipher SimpleSubstitutionCipher1;
    public static PolybiusSquareCipher PolybiusSquareCipher1;
    public static AffineCipher AffineCipher1;
    
    public static void main(String[] args)
    {
        String[] type = {"Atbash", "ROT13", "Caesar", "Baconian", "Simple Substitution", "Polybius Square", "Affine"}; // Lists types of ciphers
        String typeInput = (String) JOptionPane.showInputDialog(null, "Choose Cipher Type", "Choose Cipher Type", JOptionPane.QUESTION_MESSAGE, null, type, type[0]);
        String cipherText = JOptionPane.showInputDialog("What is the cipher text?"); // User chooses cipher
        
        if(typeInput.equals("Atbash"))
        {
            AtbashCipher1 = new AtbashCipher(cipherText);
            
            String[] decryptEncrypt = {"Decrypt", "Encrypt"};
            String decryptEncryptInput = (String) JOptionPane.showInputDialog(null, "Decrypt or Encrypt?", "Decrypt or Encrypt?", JOptionPane.QUESTION_MESSAGE, null, decryptEncrypt, decryptEncrypt[0]);
            
            if(decryptEncryptInput.equals("Decrypt"))
            {
            	 JOptionPane.showMessageDialog(null, AtbashCipher1.decrypt()); // Prints decrypted cipher
            }
            
            if(decryptEncryptInput.equals("Encrypt"))
            {
            	 JOptionPane.showMessageDialog(null, AtbashCipher1.encrypt()); // Prints encrypted cipher
            }
        }
        
        else if(typeInput.equals("ROT13"))
        {
            ROT13Cipher1 = new ROT13Cipher(cipherText);
            
            String[] decryptEncrypt = {"Decrypt", "Encrypt"};
            String decryptEncryptInput = (String) JOptionPane.showInputDialog(null, "Decrypt or Encrypt?", "Decrypt or Encrypt?", JOptionPane.QUESTION_MESSAGE, null, decryptEncrypt, decryptEncrypt[0]);
            
            if(decryptEncryptInput.equals("Decrypt"))
            {
            	 JOptionPane.showMessageDialog(null, ROT13Cipher1.decrypt()); // Prints decrypted cipher
            }
            
            if(decryptEncryptInput.equals("Encrypt"))
            {
            	 JOptionPane.showMessageDialog(null, ROT13Cipher1.encrypt()); // Prints encrypted cipher
            }
        }
        
        else if(typeInput.equals("Caesar"))
        {
           CaesarCipher1 = new CaesarCipher(cipherText);
           
           String[] decryptEncrypt = {"Decrypt", "Encrypt"};
           String decryptEncryptInput = (String) JOptionPane.showInputDialog(null, "Decrypt or Encrypt?", "Decrypt or Encrypt?", JOptionPane.QUESTION_MESSAGE, null, decryptEncrypt, decryptEncrypt[0]);
           
           if(decryptEncryptInput.equals("Decrypt"))
           {
        	    JOptionPane.showMessageDialog(null, CaesarCipher1.decrypt()); // Prints decrypted cipher
           }
           
           if(decryptEncryptInput.equals("Encrypt"))
           {
        	   JOptionPane.showMessageDialog(null, CaesarCipher1.encrypt()); // Prints encrypted cipher
           }
        }
        
        else if(typeInput.equals("Baconian"))
        {
        	BaconianCipher1 = new BaconianCipher(cipherText);
        	
        	String[] decryptEncrypt = {"Decrypt", "Encrypt"};
            String decryptEncryptInput = (String) JOptionPane.showInputDialog(null, "Decrypt or Encrypt?", "Decrypt or Encrypt?", JOptionPane.QUESTION_MESSAGE, null, decryptEncrypt, decryptEncrypt[0]);
            
            if(decryptEncryptInput.equals("Decrypt"))
            {
            	JOptionPane.showMessageDialog(null, BaconianCipher1.decrypt()); // Prints decrypted cipher
            }
            
            if(decryptEncryptInput.equals("Encrypt"))
            {
            	JOptionPane.showMessageDialog(null, BaconianCipher1.encrypt()); // Prints encrypted cipher
            }
        }
        
        else if(typeInput.equals("Simple Substitution"))
        {
        	SimpleSubstitutionCipher1 = new SimpleSubstitutionCipher(cipherText);
        	        	
        	String[] decryptEncrypt = {"Decrypt", "Encrypt"};
            String decryptEncryptInput = (String) JOptionPane.showInputDialog(null, "Decrypt or Encrypt?", "Decrypt or Encrypt?", JOptionPane.QUESTION_MESSAGE, null, decryptEncrypt, decryptEncrypt[0]);
            
            if(decryptEncryptInput.equals("Decrypt"))
            {
            	JOptionPane.showMessageDialog(null, SimpleSubstitutionCipher1.decrypt()); // Prints decrypted cipher
            }
            
            if(decryptEncryptInput.equals("Encrypt"))
            {
            	JOptionPane.showMessageDialog(null, SimpleSubstitutionCipher1.encrypt()); // Prints encrypted cipher
            }
        }
        
        else if(typeInput.equals("Polybius Square"))
        {
        	PolybiusSquareCipher1 = new PolybiusSquareCipher(cipherText);
        	
        	String[] decryptEncrypt = {"Decrypt", "Encrypt"};
            String decryptEncryptInput = (String) JOptionPane.showInputDialog(null, "Decrypt or Encrypt?", "Decrypt or Encrypt?", JOptionPane.QUESTION_MESSAGE, null, decryptEncrypt, decryptEncrypt[0]);
            
            if(decryptEncryptInput.equals("Decrypt"))
            {
            	JOptionPane.showMessageDialog(null, PolybiusSquareCipher1.decrypt()); // Prints decrypted cipher
            }
            
            if(decryptEncryptInput.equals("Encrypt"))
            {
            	JOptionPane.showMessageDialog(null, PolybiusSquareCipher1.encrypt()); // Prints encrypted cipher
            }
        }
        
        else if(typeInput.equals("Affine"))
        {
        	AffineCipher1 = new AffineCipher(cipherText);
        	
        	String[] decryptEncrypt = {"Decrypt", "Encrypt"};
            String decryptEncryptInput = (String) JOptionPane.showInputDialog(null, "Decrypt or Encrypt?", "Decrypt or Encrypt?", JOptionPane.QUESTION_MESSAGE, null, decryptEncrypt, decryptEncrypt[0]);
            
            if(decryptEncryptInput.equals("Decrypt"))
            {
            	JOptionPane.showMessageDialog(null, AffineCipher1.decrypt()); // Prints decrypted cipher
            }
            
            if(decryptEncryptInput.equals("Encrypt"))
            {
            	JOptionPane.showMessageDialog(null, AffineCipher1.encrypt()); // Prints encrypted cipher
            }
        }
    }
}

//practicalcryptography.com/ciphers/