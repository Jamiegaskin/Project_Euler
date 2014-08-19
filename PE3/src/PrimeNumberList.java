import java.util.ArrayList;

public class PrimeNumberList
{
   private ArrayList<Integer> primes;
   private int test = 3;
   
   // default constructor
   PrimeNumberList()
   {
      primes = new ArrayList<Integer>();
      primes.add(2);
      primes.add(3);
   }
   // kind can be "below" to create all primes below top or can be
   // "number" to create top number of primes.
   PrimeNumberList(String kind, int top)
   {
      if (kind == "below")
      {
         // use pi(x) to approximate how many primes
         primes = new ArrayList<Integer>((int)(top/Math.log(top)));
         primes.add(2);
         primes.add(2);
         while (test < top)
            nextPrime();
      }
      else if (kind == "number")
      {
         primes = new ArrayList<Integer>(top);
         while (primes.size() < top)
            nextPrime();
      }
   }
   // appends nextPrime to list and returns it in case client wants it
   public int nextPrime()
   {
      do
      {
         test += 2;
      }
      while (!isPrime(test));
      primes.add(test);
      return test;   
   }
   // checks if a number is prime
   public boolean isPrime(int x)
   {
      for (int k = 0; k < primes.size(); k++)
         if (x % primes.get(k) == 0)
            return false;
      return true;
   }
   public int getNumberOfPrimes() {return primes.size();}
   public int getPrimeAt(int k) {return primes.get(k);}
   
}
