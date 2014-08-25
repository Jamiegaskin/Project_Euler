import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Jamie on 8/21/14.
 */
public class PE18 {
    public static void main(String[] args)
    {
        BufferedReader inFile;
        String[][] numbersStr = new String[15][];
        int [][] numbersInt = new int[15][];

        // open file for reading
        try
        {
            // ------- open and read the file
            inFile = new BufferedReader(
                    new FileReader("numbers.txt") );

            for (int k = 0; inFile.ready(); k++) {
                numbersStr[k] = inFile.readLine().split(" ");
            }

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

        for (int k = 0; k < numbersStr.length; k++) {
            numbersInt[k] = new int[numbersStr[k].length];
            for (int l = 0; l < numbersStr[k].length; l++) {
                numbersInt[k][l] = Integer.parseInt(numbersStr[k][l]);
            }
        }
        System.out.println(processTriangle(numbersInt));
    }

    public static int processTriangle(int[][] theTriangle) {
        int adjL, adjR;
        for (int row = theTriangle.length - 2; row > -1; row--) {
            for (int k = 0; k < theTriangle[row].length; k++) {
                // look on both adjacent lower numbers and choose larger one
                adjL = theTriangle[row + 1][k];
                adjR = theTriangle[row + 1][k + 1];
                if (adjL > adjR) {
                    theTriangle[row][k] += adjL;
                }
                else {
                    theTriangle[row][k] += adjR;
                }
            }
        }
        return theTriangle[0][0];
    }
}
