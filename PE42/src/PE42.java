import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Jamie on 11/5/14.
 */
public class PE42 {
    public static void main(String[] args) {
        BufferedReader inFile;
        String text = "";

        // open file for reading
        try
        {
            // ------- open and read the file
            inFile = new BufferedReader(
                    new FileReader("/Users/Jamie/GitHub/Project_Euler/PE42/src/names.txt") );

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

        int count = 0;
        int wordSum;
        TriangleNumbers tris = new TriangleNumbers(100);
        for (int k = 0; k < textArray.length; k++) {
            wordSum = 0;
            for (int j = 0; j < textArray[k].length(); j++) {
                wordSum += textArray[k].charAt(j) - 'A' + 1;
            }
            if (tris.isTriangleNumber(wordSum)) {
                System.out.println(textArray[k] + " is a triangle word with value " + wordSum);
                count++;
            }
        }
        System.out.println(count);
    }
}
