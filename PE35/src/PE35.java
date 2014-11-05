import Tools.Primes;
import java.util.*;

public class PE35
{
   public static final int TOP = 1000000;
   public static void main(String[] args)
   {
      Primes primes = new Primes(TOP);
      HashSet<Integer> nums = new HashSet<Integer>();
      int numDigits;
      boolean allPrime;
      
      for (int k = 1; k < TOP; k++)
      {
         if (nums.contains(k))
            continue;
         if (!primes.isPrime(k))
            continue;
         
         allPrime = true;
         numDigits = (int)Math.floor(Math.log10(k) ) + 1;
         for (int rotater = rotateDigits(k, numDigits); rotater != k; 
               rotater = rotateDigits(rotater, numDigits))
         {
            if (!primes.isPrime(rotater))
            {
               allPrime = false;
               break;
            }
         }
         
         if(allPrime)
         {
            nums.add(k);
            for (int rotater = rotateDigits(k, numDigits); rotater != k; 
                  rotater = rotateDigits(rotater, numDigits))
            {
               nums.add(rotater);
            }
         }
      }
      System.out.println(nums.size());
   }
   
   public static int rotateDigits(int x, int numDigits)
   {
      if (numDigits == 1)
         return x;
      int testNumDigits = (int)Math.floor(Math.log10(x)) + 1;
      if (numDigits > testNumDigits)
         return x * 10;
      int first = x / (int)Math.pow(10, numDigits - 1);
      x -= first * Math.pow(10, numDigits - 1);
      x *= 10;
      x += first;
      return x;
   }
}

