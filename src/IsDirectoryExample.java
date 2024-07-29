import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class IsDirectoryExample {
    public static void main(String args[]) {

        File f = new File("abc.csv");

        // file creation
        try {
            System.out.println("FileCreation:-" + f.createNewFile());
        } catch (Exception e) {

            e.getMessage();
        }

        // file writing
        try {
            FileWriter fw = new FileWriter(f);

            fw.write("File Reader result:- " + "my name is vishal shukla ");
            fw.flush();
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        // MEthods
        System.out.println("File Exists methods:- " + f.exists());

        // file reading
        try {
            FileReader fr = new FileReader(f);
            int characters;
            while ((characters = fr.read()) != -1) {

                System.out.print((char) characters);
                fr.close();
            }
            // fr.close();
        } catch (Exception e) {
            System.out.println("An Error occurred.");
            e.printStackTrace();
        }
    }

}