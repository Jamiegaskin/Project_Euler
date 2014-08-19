
public class PE5
{

   public static void main(String[] args)
   {
      int num = 19;
      while (!isDivisible(num, 20))
         num += 19;
      System.out.println(num);
   }
   public static boolean isDivisible(int test, int range)
   {
      for (int k = 2; k < range; k++)
         if (test % k != 0)
            return false;
      return true;
   }
}
