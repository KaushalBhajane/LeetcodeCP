import java.util.*;
class Solution 
{
	// This function check if the character c is alpha numberic
    public static boolean isAlphaNumeric(char c) 
    {
        if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9')) 
        {
            return false;
        }
        
        return true;
    }

    public static void toLowercase(StringBuilder str) 
    {
        // Traverse through the string s
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            
            // Check if ch is a uppercase letter
            if (ch <= 'Z' && ch >= 'A')
            {
                char c = Character.toLowerCase(ch);
                str.setCharAt(i, c);
            }
        }
    }

	public static boolean isPalindrome(String s) 
    {
        // Convert uppercase letter into lowercase letter
        StringBuilder str = new StringBuilder(s);
        toLowercase(str);
        
        // Find the reverse string of s
        StringBuilder reversedS = new StringBuilder(str);
        reversedS.reverse();

        int n = s.length();
        int i = 0;
        int j = 0;

        while (i < n && j < n)
        {
            if (!isAlphaNumeric(str.charAt(i)))
            {
                // ith pointer points to invalid character.
                i++;
            }
            else if (!isAlphaNumeric(reversedS.charAt(j)))
            {
                // jth pointer points to invalid character.
                j++;
            }
            else if (str.charAt(i) == reversedS.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
}



