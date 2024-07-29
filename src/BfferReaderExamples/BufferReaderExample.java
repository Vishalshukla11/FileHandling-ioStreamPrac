package BfferReaderExamples;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferReaderExample{
    public static void main(String args[])
    {
        String fileName="OutPut.txt";
        try
         {
            BufferedReader br= new BufferedReader(new FileReader(fileName));
            String line;
            while((line=br.readLine())!=null)
           // while (br.readLine()!=null) {
                //System.out.println(br.readLine());
                System.out.println(line);
            }    
         catch (IOException e) 
        {
            e.printStackTrace();
        }
    }}
