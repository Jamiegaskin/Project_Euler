
public class PE6
{
   public static void main(String[] args)
   {
      final int TOP = 100;
      int sumOfSquares = 0, squareOfSum = 0;
      for (int k = 1; k <= TOP; k++)
      {
         sumOfSquares += k*k;
         squareOfSum += k;
      }
      squareOfSum *= squareOfSum;
      System.out.println(squareOfSum - sumOfSquares);
   }
}
