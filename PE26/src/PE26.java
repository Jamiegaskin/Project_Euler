
public class PE26
{

   public static void main(String[] args)
   {
      int longest = 0;
      int cycleLength;
      int whichK = 0;
      for (int k = 1; k < 1000; k++)
      {
         if (!isTerminating(k))
         {
            cycleLength = determineCycleLength(k);
            if (cycleLength > longest)
            {
               longest = cycleLength;
               whichK = k;
            }
         }
      }
      System.out.println(whichK + "   " + longest);
   }

   public static boolean isTerminating(int d) 
   {
      if (reduce2and5(d) == 1)
         return true;
      return false;
   }
   
   public static int determineCycleLength(int d)
   {
      int counter = 1;
      int carry;
      int dividend = 9;
      d = reduce2and5(d);
      while (dividend % d != 0)
      {
         counter++;
         carry = dividend % d;
         dividend = 10 * carry + 9;
      }
      return counter;
   }
   
   public static int reduce2and5(int in)
   {
      while (in % 2 == 0)
         in /= 2;
      while (in % 5 == 0)
         in /= 5;
      return in;
   }
}
