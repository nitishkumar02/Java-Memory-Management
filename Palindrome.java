import java.util.Locale;

public class Palindrome
{
    public static void main(String[] args)
    {
        String str = "abcbad";
        boolean br = isPalindrome(str);
        System.out.println(br);
    }

    private static boolean isPalindrome(String str)
    {
        if(str == null || str.length()==0)
        {
            return true;
        }
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;

        while (start <= end)
        {
            if(str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
