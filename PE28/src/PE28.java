
public class PE28
{
   public static final int SIZE = 1001;
   public static void main(String[] args)
   {
      int sum = 1;
      int numToAdd = 1;
      for (int gap = 2; gap < SIZE; gap += 2)
         for (int k = 0; k < 4; k++)
         {
            numToAdd += gap;
            sum += numToAdd;
         }
      System.out.println(sum);
   }
}
