
public class PE4
{
   public static void main(String[] args)
   {
      int largest = 0;
      for (int num1 = 100; num1 < 1000; num1++)
         for (int num2 = 100; num2 < 1000; num2++)
            if (isPal(num1*num2))
               if (num1*num2 > largest)
                  largest = num1*num2;
      System.out.println(largest);
   }
   
   // check if palindrome for ints
   public static boolean isPal(int test)
   {
      String testStr = Integer.toString(test);
      for (int k = 0; k < testStr.length() / 2; k++)
         if (testStr.charAt(k) != testStr.charAt(testStr.length() - 1 - k))
            return false;
      return true;
   }
}
