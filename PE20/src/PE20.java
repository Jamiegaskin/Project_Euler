import java.math.BigInteger;

public class PE20
{
   public static void main(String[] args)
   {
      BigInteger num = new BigInteger("2");
      BigInteger mult;
      for (int k = 3; k <= 100; k++)
      {
         mult = new BigInteger("" + k);
         num = num.multiply(mult);
      }
      
      String numString = num.toString();
      int sum = 0;
      
      for (int k = 0; k < numString.length(); k++)
         sum += Character.getNumericValue(numString.charAt(k));
      
      System.out.println(sum);
   }  
}
