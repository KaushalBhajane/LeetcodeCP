import java.util.*;
class Solution 
{
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
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if (ch <= 'Z' && ch >= 'A')
            {
                char c = Character.toLowerCase(ch);
                str.setCharAt(i, c);
            }
        }
    }

	public static boolean isPalindrome(String s) 
    {
        StringBuilder str = new StringBuilder(s);
        toLowercase(str);
        
        StringBuilder reversedS = new StringBuilder(str);
        reversedS.reverse();

        int n = s.length();
        int i = 0;
        int j = 0;

        while (i < n && j < n)
        {
            Boolean resultOfStr = isAlphaNumeric(str.charAt(i));
            Boolean resultOfReverse = isAlphaNumeric(reversedS.charAt(j));
            if (resultOfStr == false)
            {
                i++;
            }
            else if (resultOfReverse == false)
            {
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



