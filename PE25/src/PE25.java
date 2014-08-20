import java.math.BigInteger;
import java.math.BigDecimal;
public class PE25
{
   public static void main(String[] args)
   {
      BigInteger a, b;
      int term = 2;
      a = new BigInteger("1");
      b = new BigInteger("1");
      
      while (b.toString().length() < 1000)
      {
         a = a.add(b);
         b = b.add(a);
         term += 2;
      }
      
      if (a.toString().length() == 1000)
         System.out.println(term - 1);
      else
         System.out.println(term);
      BigDecimal base = new BigDecimal("1.6");
      BigDecimal test = base.pow(4782);
      BigInteger testInt = test.toBigInteger();
      System.out.println(testInt.toString().length());
      }
}
