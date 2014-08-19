import java.math.BigInteger;
public class PE16
{

   public static void main(String[] args)
   {
      BigInteger number = BigInteger.valueOf(2);
      number = number.pow(1000);
      
      String numberString = number.toString();
      long sum = 0;
            
      for (int k = 0; k < numberString.length(); k++)
      {
         sum += Character.getNumericValue(numberString.charAt(k));
      }
      
      System.out.println(sum);
   }

}
