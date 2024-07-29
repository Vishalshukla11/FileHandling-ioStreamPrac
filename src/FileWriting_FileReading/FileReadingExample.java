package FileWriting_FileReading;

import java.io.FileReader;

class FileReadingExample{
    public static void main(String args[])
    {
        try {
            FileReader fr= new FileReader("abcd.txt");

            System.out.println((char)fr.read());
            System.out.println((char)fr.read());
            System.out.println((char)fr.read());
            System.out.println((char)fr.read());
            System.out.println((char)fr.read());
            System.out.println((char)fr.read());
            System.out.println((char)fr.read());
            System.out.println(fr.read());
            fr.close();
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }

}