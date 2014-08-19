import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class PE23
{
   public static final int TOP = 28123;
   public static void main(String[] args)
   {
      ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
      Iterator<Integer> iter1, iter2;
      HashSet<Integer> sumsOfAbundantNumbers = new HashSet<Integer>();
      int totalSum = 0;
      int iter1Int, iter2Int;
      
      for (int k = 1; k < TOP; k++)
      {
         if (isAbundantNumber(k))
            abundantNumbers.add(k);
      }
      iter1 = abundantNumbers.iterator();

      while (iter1.hasNext())
      {
         iter1Int = iter1.next();
         iter2 = abundantNumbers.iterator();
         while (iter2.hasNext())
         {
            iter2Int = iter2.next();
            if ((iter1Int + iter2Int) < TOP)
               sumsOfAbundantNumbers.add((iter1Int + iter2Int));
         }
      }
      
      for (int k = 1; k < TOP; k++)
      {
         if (!sumsOfAbundantNumbers.contains(k))
            totalSum += k;
      }
      
      System.out.println(totalSum);
   }
   
   public static boolean isAbundantNumber(int number)
   {
      if (number < 2)
         return false;
      
      int sum = 1; // one is always proper divisor
      double sqrt = Math.sqrt(number);
      for (int k = 2; k < sqrt; k++)
         if (number % k == 0)
         {
            sum += k;
            sum += number / k;
         }
      if (sqrt % 1 < .00000001)
         sum += (int)sqrt;
      
      if (sum > number)
         return true;
      return false;
   }
}
