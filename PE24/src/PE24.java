import java.text.NumberFormat;
import java.util.Locale;


public class PE24
{
   public static int number = 0;
   public static boolean finished = false;
   public static final int PERMUTATION_NUMBER = 1000000;
   public static void main(String[] args)
   {
      long startTime, stopTime; 
      // for formatting output neatly
      NumberFormat tidy = NumberFormat.getInstance(Locale.US);
      tidy.setMaximumFractionDigits(4);

      startTime = System.nanoTime();  // ------------------ start 
      permuteString("", "0123456789");
      stopTime = System.nanoTime();    // ---------------------- stop
      System.out.println("permuteString Elapsed Time: "
            + tidy.format( (stopTime - startTime) / 1e9)
            + " seconds.");

   }

   public static void permuteString(String alreadyFinished, 
         String remainingLetters)
   {
      if (finished)
         return;
      if (remainingLetters.length() == 1)
      {
         number++;
         if (number == PERMUTATION_NUMBER)
         {
            System.out.println(alreadyFinished + remainingLetters);
            finished = true;
         }
         return;
      }
      for (int k = 0; k < remainingLetters.length(); k++)
      {
         permuteString(alreadyFinished + remainingLetters.charAt(k), 
               removeCharAtIndex(remainingLetters, k));
      }    
   }
   
   public static String removeCharAtIndex(String inString, int index)
   {
      return inString.substring(0, index) + 
            inString.substring(index + 1, inString.length());
   }
}
