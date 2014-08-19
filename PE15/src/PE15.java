
public class PE15
{
   public static final int SIZE = 21;
   public static void main(String[] args)
   {
      long[][] theArray = new long[21][21];
      for (int x = 0; x < SIZE; x++)
      {
         theArray[x][SIZE-1] = 1;
         theArray[SIZE-1][x] = 1;
      }
      for (int x = SIZE-2; x >= 0; x--)
         for (int y = SIZE-2; y >= 0; y--)
            theArray[x][y] = theArray[x+1][y] + theArray[x][y+1];
      
      System.out.println(theArray[0][0]);
   }
}
