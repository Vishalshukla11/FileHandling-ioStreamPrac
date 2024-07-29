package BfferReaderExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferReaderConsoleExample{
    public static void main(String args[])
    {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter yout Name");
            String name=br.readLine();
            System.out.println("Hello "  + name + "!");
            
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}