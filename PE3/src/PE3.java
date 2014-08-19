
public class PE3
{
   public static void main(String[] args)
   {
      final long number = 600851475143l;
      final int top = (int)Math.sqrt(number);
      
      int LPF = 0;
      
      PrimeNumberList myPrimes = new PrimeNumberList("below", top);
      for (int k = 0; k < myPrimes.getNumberOfPrimes(); k++)
         if (number % myPrimes.getPrimeAt(k) == 0)
            LPF = myPrimes.getPrimeAt(k);
      
      System.out.println(LPF);
   }
}
