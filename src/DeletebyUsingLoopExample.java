import java.io.File;

class DeletebyUsingLoopExample{
    public static void main(String args[])
    {
    
       for(int i=0;i<10;i++)
       {
        File f= new File("A"+i);
        f.delete();
       }
    }

}