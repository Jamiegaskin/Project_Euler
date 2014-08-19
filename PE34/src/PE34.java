
public class PE34
{

   public static void main(String[] args)
   {

      int sum = 0;
      for (int k = 3; k < 10000000; k++)
      {
         if (isFactorialSum(k))
         {
            sum += k;
            System.out.println(k);
         }
      }
      System.out.println(sum);
   }
   
   public static boolean isFactorialSum(int num)
   {
      int mod = 10;
      int numCopy = num;
      int sum = 0;
      while (num > 0)
      {
         sum += factorial((num % mod)/(mod / 10));
         num -= num % mod;
         mod *= 10;
      }
      return (sum == numCopy);
   }
   
   public static int factorial(int num)
   {
      int total = 1;
      while (num > 1)
      {
         total *= num;
         num -= 1;
      }
      return total;
   }

}
