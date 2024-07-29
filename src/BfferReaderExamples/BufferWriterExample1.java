package BfferReaderExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class BufferWriterExample1{
    public static void main(String args[])
    {
        String fileName="OutPut.txt";
        try {

            BufferedWriter bw= new BufferedWriter(new FileWriter(fileName));
            bw.write("hello ,world");
            bw.newLine();
            bw.write("this is an example of bufferWritter.");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}