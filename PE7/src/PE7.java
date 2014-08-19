
public class PE7
{

   public static void main(String[] args)
   {
      final int top = 10001;
      PrimeNumberList primesList = new PrimeNumberList("number", top);
      System.out.println(primesList.getPrimeAt(top - 1));

   }

}
