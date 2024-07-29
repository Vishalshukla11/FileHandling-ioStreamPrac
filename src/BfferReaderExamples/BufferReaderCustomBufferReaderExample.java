package BfferReaderExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferReaderCustomBufferReaderExample{
    public static void main(String args[])
    {
        String fileName="Output3.txt";
        int bufferSize=8192;//custom buffer size
        
        try(BufferedReader br= new BufferedReader(new FileReader(fileName),bufferSize))
         {
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}