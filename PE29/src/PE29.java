import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.math.BigInteger;
public class PE29
{

   public static void main(String[] args)
   {
      long startTime, stopTime;       
      NumberFormat tidy = NumberFormat.getInstance(Locale.US); 
      tidy.setMaximumFractionDigits(4); 

      startTime = System.nanoTime(); 
       
      
      HashSet<BigInteger> terms = new HashSet<BigInteger>();
      BigInteger temp;
      
      for (int a = 2; a <= 100; a++)
         for (int b = 2; b <= 100; b++)
         {
            temp = new BigInteger(Integer.toString(a));
            temp = temp.pow(b);
            terms.add(temp);
         }
      
      System.out.println(terms.size());
      
      stopTime = System.nanoTime();
      System.out.println("Elapsed Time: " 
            + tidy.format( (stopTime - startTime) / 1e9) 
            + " seconds."); 
   }
}
