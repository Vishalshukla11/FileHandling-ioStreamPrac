package FileWriting_FileReading;

import java.io.File;
import java.io.FileWriter;

class FileWriterExample {
    public static void main(String args[])
    {
        File x= new File("abcd.txt");
        try {
            x.createNewFile();
            
            FileWriter fw = new FileWriter(x) ;

            fw.write("vishal ");
            fw.write("Shukla ");
            fw.write("From ");
            fw.write("Jabalpur ");

            fw.flush();// if data stuck somewhere it will ensure data should not stuck

            fw.write("|And ");
            fw.write("Also ");
            fw.write("from ");
            fw.write("satna ");

            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
    }

}