
public class PE30
{
   public static final int MAX = 325512;
   public static void main(String[] args)
   {
      int sum = 0;
      for (int k = 100; k <= MAX; k++)
         if (isSumOfFifthPowers(k))
         {
            System.out.println(k);
            sum += k;
         }
         
      System.out.println(sum);
   }
   
   public static boolean isSumOfFifthPowers(int x)
   {
      int sumsOfFifths = 0;
      int xOrig = x;
      while (x > 0)
      {
         sumsOfFifths += (int)Math.pow(x % 10, 5);
         x /= 10;
      }
      return sumsOfFifths == xOrig;
   }

}
