package BfferReaderExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class BufferWriterAppendExample{
    public static void main(String args[]){
        String filename="Output2.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Appendinf this Line.");
            bw.newLine();
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }

}