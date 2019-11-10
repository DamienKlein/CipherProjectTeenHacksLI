/**
 * Code that will take an encrypted cipher and decrypt it
 * 
 * @author Damien Klein, Jason Long, Joseph Oh, Daniel Oh
 * @version 11/9/19
 */

public class BaconianIndex
{
	private String newLetter;
	
	public BaconianIndex()
	{
		newLetter = " ";
	}
	
	public String getNewLetter(boolean u1, boolean u2, boolean u3, boolean u4, boolean u5)
	{
		if(u5 == true && u1 == false && u2 == false && u3 == false && u4 == false) // aaaab
		{
			newLetter = "b";
		}
		
		else if(u4 == true && u1 == false && u2 == false && u3 == false && u5 == false) // aaaba
		{
			newLetter = "c";
		}
		
		else if(u4 == true && u5 == true && u1 == false && u2 == false && u3 == false) // aaabb
		{
			newLetter = "d";
		}
		
		else if(u3 == true && u1 == false && u2 == false && u4 == false && u5 == false) // aabaa
		{
			newLetter = "e";
		}
		
		else if(u3 == true && u5 == true && u1 == false && u2 == false && u4 == false) // aabab
		{
			newLetter = "f";
		}
		
		else if(u3 == true && u4 == true && u1 == false && u2 == false && u5 == false) // aabba
		{
			newLetter = "g";
		}
		
		else if(u3 == true && u4 == true && u5 == true && u1 == false && u2 == false) // aabbb
		{
			newLetter = "h";
		}
		
		else if(u2 == true && u1 == false && u3 == false && u4 == false && u5 == false) // abaaa
		{
			newLetter = " i/j ";
		}
		
		else if(u2 == true && u5 == true && u1 == false && u3 == false && u3 == false) // abaab
		{
			newLetter = "k";
		}
		
		else if(u2 == true && u4 == true && u1 == false && u3 == false && u5 == false) // ababa
		{
			newLetter = "l";
		}
		
		else if(u2 == true && u4 == true && u5 == true && u1 == false && u3 == false) // ababb
		{
			newLetter = "m";
		}
		
		else if(u2 == true && u3 == true && u1 == false && u4 == false && u5 == false) // abbaa
		{
			newLetter = "n";
		}
		
		else if(u2 == true && u3 == true && u5 == true && u1 == false && u4 == false) // abbab
		{
			newLetter = "o";
		}
		
		else if(u2 == true && u3 == true && u4 == true && u1 == false && u5 == false) // abbba
		{ 
			newLetter = "p";
		}
		
		else if(u2 == true && u3 == true && u4 == true && u5 == true && u1 == false) // abbbb
		{
			newLetter = "q";
		}
		
		else if(u1 == true && u2 == false && u3 == false && u4 == false && u5 == false) // baaaa
		{
			newLetter = "r";
		}
		
		else if(u1 == true && u5 == true && u2 == false && u3 == false && u4 == false) // baaab
		{
			newLetter = "s";
		}
		
		else if(u1 == true && u4 == true && u2 == false && u3 == false && u5 == false) // baaba
		{
			newLetter = "t";
		}
		
		else if(u1 == true && u4 == true && u5 == true && u2 == false && u3 == false) // baabb
		{
			newLetter = " u/v ";
		}
		
		else if(u1 == true && u3 == true && u2 == false && u4 == false && u5 == false) // babaa
		{
			newLetter = "w";
		}
		
		else if(u1 == true && u3 == true && u5 == true && u2 == false && u4 == false) // babab
		{
			newLetter = "x";
		}
		
		else if(u1 == true && u3 == true && u4 == true && u2 == false && u5 == false) // babba
		{
			newLetter = "y";
		}
		
		else if(u1 == true && u3 == true && u4 == true && u5 == true && u2 == false) // babbb
		{
			newLetter = "z";
		}
		
		else // aaaaa
		{
                    
			newLetter = "a";
		}
		
		return newLetter;
	}
        public String getNewFiveLetter(String letterText)
        {
            String fiveLetters = "";
            if(letterText.equalsIgnoreCase("A"))
            {
                fiveLetters = "aaaaa";
            }
            else if(letterText.equalsIgnoreCase("B"))
            {
                fiveLetters = "aaaaB";
            }
            else if(letterText.equalsIgnoreCase("C"))
            {
                fiveLetters = "aaaBa";
            }
            else if(letterText.equalsIgnoreCase("D"))
            {
                fiveLetters = "aaaBB";
            }
            else if(letterText.equalsIgnoreCase("E"))
            {
                fiveLetters = "aaBaa";
            }
            else if(letterText.equalsIgnoreCase("F"))
            {
                fiveLetters = "aaBaB";
            }
            else if(letterText.equalsIgnoreCase("G"))
            {
                fiveLetters = "aaBBa";
            }
            else if(letterText.equalsIgnoreCase("H"))
            {
                fiveLetters = "aaBBB";
            }
            else if(letterText.equalsIgnoreCase("I")||letterText.equalsIgnoreCase("J"))
            {
                fiveLetters = "aBaaa";
            }
            else if(letterText.equalsIgnoreCase("K"))
            {
                fiveLetters = "aBaaB";
            }
            else if(letterText.equalsIgnoreCase("L"))
            {
                fiveLetters = "aBaBa";
            }
            else if(letterText.equalsIgnoreCase("M"))
            {
                fiveLetters = "aBaBB";
            }
            else if(letterText.equalsIgnoreCase("N"))
            {
                fiveLetters = "aBBaa";
            }
            else if(letterText.equalsIgnoreCase("O"))
            {
                fiveLetters = "aBBaB";
            }
            else if(letterText.equalsIgnoreCase("P"))
            {
                fiveLetters = "aBBBa";
            }
            else if(letterText.equalsIgnoreCase("Q"))
            {
                fiveLetters = "aBBBB";
            }
            else if(letterText.equalsIgnoreCase("R"))
            {
                fiveLetters = "Baaaa";
            }
            else if(letterText.equalsIgnoreCase("S"))
            {
                fiveLetters = "BaaaB";
            }
            else if(letterText.equalsIgnoreCase("T"))
            {
                fiveLetters = "BaaBa";
            }
            else if(letterText.equalsIgnoreCase("U")||letterText.equalsIgnoreCase("V"))
            {
                fiveLetters = "BaaBB";
            }
            else if(letterText.equalsIgnoreCase("W"))
            {
                fiveLetters = "BaBaa";
            }
            else if(letterText.equalsIgnoreCase("X"))
            {
                fiveLetters = "BaBaB";
            }
            else if(letterText.equalsIgnoreCase("Y"))
            {
                fiveLetters = "BaBBa";
            }
            else if(letterText.equalsIgnoreCase("Z"))
            {
                fiveLetters = "BaBBB";
            }
            return fiveLetters;
        }
}