
public class PE17
{

   public static void main(String[] args)
   {
      int totalSum = 0;
      
      for (int k = 1; k <= 1000; k++)
      {
         System.out.println("doing " + k + "      value :" + getLettersFromDigits(k));
         totalSum += getLettersFromDigits(k);
      }
      
      System.out.println(totalSum);
   }
   
   public static int getLettersFromDigits(int number)
   {
      if (number < 0 || number > 9999)
      {
         System.out.println("Out of bounds for getLettersFromDigits");
         return -1;
      }
      
      int letters = 0;
      
      if (number % 100 == 0 || number / 100 == 0)
      {
         letters = -3; // accounts for "and" inserted later
      }
      
      if (number > 999)
      {
         letters += numOfLettersInDigit(number/1000); // number of thousands
         letters += 8; // "thousand"
         number = number % 1000;
      }
      if (number > 99)
      {
         letters += numOfLettersInDigit(number/100); // number of hundreds
         letters += 7; // "hundred"
         number = number % 100;
      }
      
      letters += 3; // "and"
      
      if (number > 19)
      {
         letters += numOfLettersInDigitTens(number/10); // number of hundreds
         number = number % 10;
      }
      
      letters += numOfLettersInDigit(number);
      
      return letters;
   }
   
   public static int numOfLettersInDigit(int number)
   {
      if (number < 0 || number > 19)
      {
         System.out.println("Out of bounds for numOfLettersInDigit");
         return -1;
      }
      
      int returnValue = -1;
      
      switch (number)
      {
      case 0: returnValue = 0; break;
      case 1: returnValue = 3; break;
      case 2: returnValue = 3; break;
      case 3: returnValue = 5; break;
      case 4: returnValue = 4; break;
      case 5: returnValue = 4; break;
      case 6: returnValue = 3; break;
      case 7: returnValue = 5; break;
      case 8: returnValue = 5; break;
      case 9: returnValue = 4; break;
      case 10: returnValue = 3; break;
      case 11: returnValue = 6; break;
      case 12: returnValue = 6; break;
      case 13: returnValue = 8; break;
      case 14: returnValue = 8; break;
      case 15: returnValue = 7; break;
      case 16: returnValue = 7; break;
      case 17: returnValue = 9; break;
      case 18: returnValue = 8; break;
      case 19: returnValue = 8; break;
      }
      
      return returnValue;
   }
   
   public static int numOfLettersInDigitTens(int number)
   {
      if (number < 2 || number > 9)
      {
         System.out.println("Out of bounds for numOfLettersInDigitTens");
         return -1;
      }
      
      int returnValue = -1;
      
      switch (number)
      {
      case 2: returnValue = 6; break;
      case 3: returnValue = 6; break;
      case 4: returnValue = 5; break;
      case 5: returnValue = 5; break;
      case 6: returnValue = 5; break;
      case 7: returnValue = 7; break;
      case 8: returnValue = 6; break;
      case 9: returnValue = 6; break;
      }
      
      return returnValue;
   }
}
