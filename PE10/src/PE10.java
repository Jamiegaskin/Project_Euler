
public class PE10
{

   public static void main(String[] args)
   {
      final int top = 2000000;
      long sum = 0;
      PrimeNumberList primesList = new PrimeNumberList("below", top);
      for (int k = 0; k < primesList.getNumberOfPrimes(); k++)
      {
         sum += primesList.getPrimeAt(k);
      }
      System.out.println(sum);
      
      System.out.println("last: " + primesList.getPrimeAt(primesList.getNumberOfPrimes()-1));
      System.out.println("second to last: " + primesList.getPrimeAt(primesList.getNumberOfPrimes()-2));
      // 142913828922
   }
}
