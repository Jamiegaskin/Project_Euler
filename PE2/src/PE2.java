
public class PE2
{
   public static void main(String[] args)
   {
      final int MAX = 4000000;
      int fib1 = 1, fib2 = 2, temp, sum = 0;
      while (fib1 < MAX && fib2 < MAX)
      {
         if (fib2 % 2 == 0)
            sum += fib2;
         temp = fib2;
         fib2 += fib1;
         fib1 = temp;
      }
      System.out.println(sum);
   }
}
