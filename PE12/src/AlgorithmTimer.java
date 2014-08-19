import java.text.NumberFormat;
import java.util.Locale;

public class AlgorithmTimer
{
   private static long startTime, stopTime;

   // how we time our algorithms -------------------------
   public static void start()
   {
      startTime = System.nanoTime();
   }

   // how we determine the time elapsed -------------------
   public static void stop()
   {
      stopTime = System.nanoTime();
   }

   // returns string of time.
   public static String getTime()
   {
      // for formatting output neatly
      NumberFormat tidy = NumberFormat.getInstance(Locale.US);
      tidy.setMaximumFractionDigits(4);
      return "\nAlgorithm Elapsed Time: "
         + tidy.format( (stopTime - startTime) / 1e9)
         + " seconds.";
   }

   // report algorithm time
   public static void printTime()
   {
      System.out.println(getTime());
   }
}