
public class PE1
{
   public static void main(String[] args)
   {
      final int RANGE = 1000;
      int sum = 0;
      for (int k = 1; k < RANGE; k++)
      {
         if (k % 3 == 0 || k % 5 == 0)
            sum += k;
      }
      System.out.println(sum);
   }
}
