import java.io.File;
import java.io.IOException;

class Example1{
    public static void main(String args[]) 
    {
        
        File f= new File("Abcd");
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f);
        try {
            System.out.println(f.createNewFile());
        } catch (Exception e) {
            System.out.println("create new file");
            
        }
        //delete 
        //f.delete();
       
    }

}