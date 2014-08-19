public class PE14
{

   public static void main(String[] args)
   {
      int startingNumber, sequenceLength, longestSequence = 0, 
            bestStartingNumber = 0;
      long current;
      
      AlgorithmTimer.start();
      for (startingNumber = 2; startingNumber < 1000000; startingNumber++)
      {
         sequenceLength = 1;
         current = startingNumber;
         while (current != 1)
         {
            if (current % 2 == 0) // even
               current /= 2;
            else // odd
               current = 3 * current + 1;
            sequenceLength++;
         }
         if (sequenceLength > longestSequence)
         {
            longestSequence = sequenceLength;
            bestStartingNumber = startingNumber;
         }
      }
      
      AlgorithmTimer.stop();
      
      System.out.println("The starting number with the longest chain is " + 
            bestStartingNumber + " with a chain length of " + longestSequence);
      
      AlgorithmTimer.printTime();

   }   
}
