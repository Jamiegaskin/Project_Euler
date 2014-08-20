public class PE21
{
   public static final int MAX = 10000;
   
   public static void main(String[] args)
   {
      numAndDivisors[] array = new numAndDivisors[MAX];
      int sum = 0;
      numAndDivisors originalNumber, potentialAmicablePair;
      int potentialAmicablePairIndex;
      
      // build each num and the sum of its divisors
      for (int k = 0; k < MAX; k++)
         array[k] = new numAndDivisors(k+1);
      
      // check and see if any are amicable numbers and if so, add to sum
      for (int k = 0; k < MAX; k++)
      {
         originalNumber = array[k];
         
         if (originalNumber.num == originalNumber.sumOfProperDivisors)
            continue; // takes out case where number would "pair" with itself
         
         potentialAmicablePairIndex = originalNumber.sumOfProperDivisors - 1;
         if (potentialAmicablePairIndex >= MAX)
            continue;
         
         potentialAmicablePair = array[potentialAmicablePairIndex];
         
         if (originalNumber.num == potentialAmicablePair.sumOfProperDivisors)
         {
            System.out.println("num: " + originalNumber.num + "        pair :"
                  + potentialAmicablePair.num);
            sum += originalNumber.num;
         }
      }
      
      System.out.println(sum);
   }
}

class numAndDivisors // only positive ints
{
   public int num, sumOfProperDivisors;
   
   public numAndDivisors(int inNum)
   {
      if (inNum < 1)
      {
         num = 0;
         sumOfProperDivisors = 0;
      }
      
      num = inNum;
      sumOfProperDivisors = findSumOfProperDivisors();
   }
   
   public int findSumOfProperDivisors() // ints less than n.
   {
      int sum = 1; // 1 always a divisor
      for (int divisor = 2; divisor <= Math.sqrt(num); divisor++)
         if (num % divisor == 0)
         {
            sum += divisor;
            sum += num / divisor; // compliment
         }
      return sum;
   }
}