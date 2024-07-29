package BfferReaderExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;

class BufferReaderwithCustomBufferSize{
    public static void main(String args[])
    {
        String fileName="Output3.txt";
        int bufferSize=8192; //custom buffer size
       
        try(BufferedWriter bw= new BufferedWriter(new FileWriter(fileName),bufferSize))
         {
            bw.write("Writing with custom buffer size");
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }

}