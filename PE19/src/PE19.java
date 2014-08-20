import java.util.*;
public class PE19
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      GregorianCalendar cal = new GregorianCalendar(1900, 0, 1);
      int sum = 0;
      
      for (int year = 1901; year <= 2000; year++)
         for (int month = 0; month < 12; month++)
         {
            cal.set(year, month, 1);
            if (cal.get(Calendar.DAY_OF_WEEK) == 1)
               sum++;
         }
      System.out.println(sum);
   }

}
