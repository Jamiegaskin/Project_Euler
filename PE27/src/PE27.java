
public class PE27
{
   public static final int MAX = 87400;
   public static void main(String[] args)
   {
      PrimeNumberList primesList = new PrimeNumberList("below", 87400);
      PrimeNumberList primesListBelow1000 = new PrimeNumberList("below", 1000);
      int a, b, n;
      int bestA = 0, bestB = 0;
      int largest = 0;
      
      for (int k = 0; k < primesListBelow1000.getNumberOfPrimes(); k++)
      {
         b = primesListBelow1000.getPrimeAt(k);
         for (a = -999; a < 1000; a++)
         {
            n = 0;
            while (primesList.isInPrimesList(n * n + a * n + b))
               n++;
            if (n > largest)
            {
               bestA = a;
               bestB = b;
               largest = n;
            }
         }
      }
      
      System.out.println("a: " + bestA + "   b: " + bestB + "    a*b: " 
            + bestA*bestB);
      System.out.println(largest);
   }

}
