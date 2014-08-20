/**
 * Created by Jamie on 8/19/14.
 */
public class PE36
{
    public static void main(String[] args)
    {
        int totalSum = 0;
        for (int k = 1; k < 1000000; k++)
        {
            if (isPalindrome(Integer.toString(k)) && isPalindrome(Integer.toBinaryString(k)))
            {
                totalSum += k;
            }
        }
        System.out.println(totalSum);
    }

    public static boolean isPalindrome(String theString)
    {
        int startIndex = 0;
        int endIndex = theString.length() - 1;
        while (startIndex < endIndex)
        {
            if (theString.charAt(startIndex) != theString.charAt(endIndex))
            {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}