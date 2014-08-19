public class PE12
{
   public static final int NUM_DIVISORS = 500;
   public static void main(String[] args)
   {
      int triangle = 55;
      int n = 11;
      
      AlgorithmTimer.start();
      while (getNumberOfFactors(triangle) < NUM_DIVISORS)
      {
         triangle += n;
         n++;
      }
      AlgorithmTimer.stop();
      AlgorithmTimer.printTime();
      

      
      System.out.println(triangle);
      
   }
   
   public static int getNumberOfFactors(int number)
   {
      int numberOfFactors = 2; // for 1 and itself
      for (int k = 2; k <= number / 2; k++)
         if (number % k == 0)
            numberOfFactors++;
      return numberOfFactors;
   }
}

