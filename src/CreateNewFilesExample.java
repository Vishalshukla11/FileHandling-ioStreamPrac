import java.io.File;

class CreateNewFilesExample{
public static void main(String args[])
{
    
    for(int i=0;i<10;i++)
    {
        File f= new File("A"+i);
        try {
            f.createNewFile();
            
        } catch (Exception e) {
          System.out.println(e);
        }
       
    }
}
}