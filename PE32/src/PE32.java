import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
public class PE32
{
   public static final int[] digitsArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
   public static int totalNumberOfTests = 0; // for checking efficiency against
   // a method doing permutations
   public static void main(String[] args)
   {
      long startTime, stopTime; 
      
      NumberFormat tidy = NumberFormat.getInstance(Locale.US); 
      tidy.setMaximumFractionDigits(4); 

      startTime = System.nanoTime(); 
      
      // (a * b = c)
      int a, b, c;
      boolean tooBig;
      HashSet<Integer> products = new HashSet<Integer>();

      // 1 digit a, 4 digit b
      for (int aIndex = 0; aIndex < 7; aIndex++) // if a = 9, c > 9876
      {                                       // and if a = 8, only c in range
         // is 9872
         tooBig = false;
         a = digitsArray[aIndex];

         for (int bIndex1 = 0; bIndex1 < 9; bIndex1++)
         {
            if (tooBig)
               break;
            if (bIndex1 == aIndex)
               continue;
            for (int bIndex2 = 0; bIndex2 < 9; bIndex2++)
            {
               if (tooBig)
                  break;
               if (bIndex2 == aIndex || bIndex2 == bIndex1)
                  continue;
               for (int bIndex3 = 0; bIndex3 < 9; bIndex3++)
               {
                  if (tooBig)
                     break;
                  if (bIndex3 == aIndex || bIndex3 == bIndex1 || 
                        bIndex3 == bIndex2)
                     continue;

                  for (int bIndex4 = 0; bIndex4 < 9; bIndex4++)
                  {
                     if (bIndex4 == aIndex || bIndex4 == bIndex1 || 
                           bIndex4 == bIndex2 || bIndex4 == bIndex3)
                        continue;

                     b = digitsArray[bIndex1] * 1000 
                           + digitsArray[bIndex2] * 100 
                           + digitsArray[bIndex3] * 10 
                           + digitsArray[bIndex4];
                     c = a * b;
                     if (c > 9876) // largest number possible
                     {
                        tooBig = true;
                        break;
                     }

                     if (isPandigitalProduct(a, b, c))
                     {
                        products.add(c);
                        System.out.println(a + "  " + b + "  " + c);
                     }
                     totalNumberOfTests++;
                  }
               }
            }
         }
      }

      // 2 digit a, 3 digit b
      for (int aIndex1 = 0; aIndex1 < 7; aIndex1++) // a > 7 doesn't work
      {
         for (int aIndex2 = 0; aIndex2 < 9; aIndex2++)
         {
            tooBig = false;
            if (aIndex2 == aIndex1)
               continue;
            a = digitsArray[aIndex1] * 10 + digitsArray[aIndex2];

            for (int bIndex1 = 0; bIndex1 < 9; bIndex1++)
            {
               if (tooBig)
                  break;
               if (bIndex1 == aIndex1 || bIndex1 == aIndex2)
                  continue;
               for (int bIndex2 = 0; bIndex2 < 9; bIndex2++)
               {
                  if (tooBig)
                     break;
                  if (bIndex2 == aIndex1 || bIndex2 == aIndex2 || 
                        bIndex2 == bIndex1)
                     continue;
                  for (int bIndex3 = 0; bIndex3 < 9; bIndex3++)
                  {
                     if (bIndex3 == aIndex1 || bIndex3 == aIndex2 || 
                           bIndex3 == bIndex1 || bIndex3 == bIndex2)
                        continue;

                     b = digitsArray[bIndex1] * 100 
                           + digitsArray[bIndex2] * 10 
                           + digitsArray[bIndex3];
                     c = a * b;
                     if (c > 9876) // largest number possible
                     {
                        tooBig = true;
                        break;
                     }

                     if (isPandigitalProduct(a, b, c))
                     {
                        products.add(c);
                        System.out.println(a + "  " + b + "  " + c);
                     }

                     totalNumberOfTests++;
                  }
               }
            }
         }
      }
      
      Iterator<Integer> iter = products.iterator();
      int totalSum = 0;
      while(iter.hasNext())
         totalSum += iter.next();
      System.out.println("total sum: " + totalSum);
      System.out.println("total number of tests: " + totalNumberOfTests);
      
      stopTime = System.nanoTime(); 

      System.out.println("Elapsed Time: " 
            + tidy.format( (stopTime - startTime) / 1e9) 
            + " seconds."); 
   }

   public static boolean isPandigitalProduct(int num1, int num2, int num3)
   {
      boolean[] check = new boolean[10];
      check[0] = true;
      int digit;

      for (int divisor = 1000; divisor >= 1; divisor /= 10)
      {
         digit = num1 / divisor;
         check[digit] = true;
         num1 %= divisor;

         digit = num2 / divisor;
         check[digit] = true;
         num2 %= divisor;

         digit = num3 / divisor;
         check[digit] = true;
         num3 %= divisor;
      }

      for (int k = 0; k < 10; k++)
         if (!check[k])
            return false;
      return true;
   }

}
