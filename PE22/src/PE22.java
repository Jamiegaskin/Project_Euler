import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PE22
{

   public static void main(String[] args)
   {
      BufferedReader inFile;
      String text = "";

      // open file for reading
      try
      {  
         // ------- open and read the file
         inFile = new BufferedReader( 
               new FileReader("/Users/Jamie/GitHub/Project_Euler/PE22/src/names.txt") );

         text = inFile.readLine();

         inFile.close();
      }
      catch( FileNotFoundException e)
      {
         System.out.println("FileNotFoundException");
      } 
      catch( IOException e)
      {
         System.out.println("IOException");
      }
      text = text.substring(1, text.length() - 1);
      String[] textArray = text.split("\",\"");
      FHsort.quickSort(textArray);
      
      int sum = 0;
      for (int k = 0; k < textArray.length; k++)
      {
         if (k < 950 && k > 900)
            System.out.println(k + " doing name: " + textArray[k] + " for score of " + (getLettersScore(textArray[k]) * (k+1)));
         sum += getLettersScore(textArray[k]) * (k+1);
      }
      
      System.out.println(sum);
   }
   
   public static int getLettersScore(String letters)
   {
      int sum = 0;
      for (int k = 0; k < letters.length(); k++)
         sum += letters.charAt(k) - 64;
      return sum;
   }

}
