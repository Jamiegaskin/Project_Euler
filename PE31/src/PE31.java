public class PE31
{
   public static void main(String[] args)
   {
      int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
      System.out.println(findCombinations(coins, 200));
   }
   
   public static int findCombinations(int[] coins, int target)
   {
      if (coins[0] != 1) // this algorithm requires a 1 coin
         return 0;
      
      int[] combinations = new int[target + 1];
      combinations[0] = 1;
      int coin;
      
      for (int coinIndex = 0; coinIndex < coins.length; coinIndex++)
      {
         coin = coins[coinIndex];
         for (int k = coin; k < combinations.length; k++)
         {
                                 // use it         lose it
            combinations[k] = combinations[k] + combinations[k - coin];
         }
      }
      return combinations[target];
   }
}
