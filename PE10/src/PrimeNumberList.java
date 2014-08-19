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
         primes = new ArrayList<Integer>((int)(top/(Math.log(top) - 1)));
         primes.add(2);
         primes.add(3);
         while (test <= top - 1)
            nextPrime(top);
      }
      else if (kind == "number")
      {
         primes = new ArrayList<Integer>(top);
         primes.add(2);
         primes.add(3);
         while (primes.size() <= top)
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
   public int nextPrime(int under)
   {
      do
      {
         test += 2;
      }
      while (!isPrime(test) && test <=  under - 1);
      if (isPrime(test))
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
   public int getTest() {return test;}
}
