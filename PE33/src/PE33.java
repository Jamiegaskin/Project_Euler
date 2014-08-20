
public class PE33
{

   public static void main(String[] args)
   {
      int totalNumerator = 1;
      int totalDenominator = 1;
      for (int numerator = 11; numerator < 100; numerator++)
      {
         if (numerator % 10 == 0)
            continue;
         
         for (int denominator = numerator + 1; denominator < 100; denominator++)
         {
            if (denominator % 10 == 0)
               continue;
            
            if (isDigitCancelingFraction(numerator, denominator))
            {
               totalNumerator *= numerator;
               totalDenominator *= denominator;
            }
         }
      }
   }
   
   public static boolean isDigitCancelingFraction(Fraction fraction);
   {
      

   }
   
   public static Fraction cancelDigits(Fraction fraction)
   {
      int n1, n2, d1, d2; // denominator digits 1 and 2 and numerator 1 and 2
      
      n1 = fraction.numerator / 10;
      n2 = fraction.numerator % 10;
      d1 = fraction.denominator / 10;
      d2 = fraction.denominator % 10;
      
      if (n1 == d1)
   }
   

}
