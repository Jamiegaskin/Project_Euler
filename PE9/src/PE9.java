
public class PE9
{

   public static void main(String[] args)
   {
      for (int c = 335; c < 999; c++)
         for (int b = c - 1; b > 2; b--)
            for (int a = b - 1; a > 1; a--)
               if (a*a + b*b == c*c && a + b + c == 1000)
               {
                  System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);
                  System.out.println(a*b*c);
                  return;
               }
   }
}
