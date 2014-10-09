import java.util.*;

public class PE35
{
   public static final int TOP = 1000000;
   public static void main(String[] args)
   {
       Tools.Primes test = new Tools.Primes(100);
       test.print();


       /*
      PrimeNumberList primes = new PrimeNumberList("below", TOP);
      HashSet<Integer> nums = new HashSet<Integer>();
      int numDigits;
      boolean allPrime;
      
      for (int k = 1; k < TOP; k++)
      {
         if (nums.contains(k))
            continue;
         if (!primes.isInPrimesList(k))
            continue;
         
         allPrime = true;
         numDigits = (int)Math.floor(Math.log10(k) ) + 1;
         for (int rotater = rotateDigits(k, numDigits); rotater != k; 
               rotater = rotateDigits(rotater, numDigits))
         {
            if (!primes.isInPrimesList(rotater))
            {
               allPrime = false;
               break;
            }
         }
         
         if(allPrime)
         {
            System.out.println("success with " + k);
            nums.add(k);
            for (int rotater = rotateDigits(k, numDigits); rotater != k; 
                  rotater = rotateDigits(rotater, numDigits))
            {
               nums.add(rotater);
            }
         }
         
         
      }
      System.out.println(nums.size());
      */
   }
   
   public static int rotateDigits(int x, int numDigits)
   {
      if (numDigits == 1)
         return x;
      int testNumDigits = (int)Math.floor(Math.log10(x)) + 1;
      if (numDigits > testNumDigits)
         return x * 10;
      String xString = Integer.toString(x);
      xString = xString.substring(1) + xString.charAt(0);
      return Integer.parseInt(xString);
   }
}

