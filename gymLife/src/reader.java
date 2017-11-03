
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tttt
 */
public class reader {
    public static void main(String [] args) throws FileNotFoundException, IOException{
    // The name of the file to open.
        String fileName = "temp.txt";

        // This will reference one line at a time
        String line = null;

            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
    }
}
