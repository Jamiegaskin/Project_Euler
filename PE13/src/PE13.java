import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.math.BigInteger;

public class PE13
{

   public static void main(String[] args)
   {
      BufferedReader inFile;
      BigInteger[] numbers = new BigInteger[100];

      // open file for reading
      try
      {  
         // ------- open and read the file
         inFile = new BufferedReader( 
               new FileReader("numbers.txt") );
         
         for (int k = 0; inFile.ready(); k++)
            numbers[k] = new BigInteger(inFile.readLine());

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
      catch( Exception e)
      {
         System.out.println("general exception");
      }
      
      BigInteger sum = numbers[0];
      for (int k = 1; k < 100; k++)
         sum = sum.add(numbers[k]);
      
      System.out.println(sum.toString().substring(0, 10));
   }

}
