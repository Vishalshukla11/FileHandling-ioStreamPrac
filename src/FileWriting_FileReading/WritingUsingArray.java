package FileWriting_FileReading;

import java.io.FileWriter;
import java.io.IOException;

class WritingUsingArray{
    public static void main(String args[]) throws IOException
    {
        char [] x= {'a','p','p','l','E'};

        FileWriter fw = new FileWriter("indrawarma.txt");
        fw.write(x);
        
        fw.close();
        
    }

}