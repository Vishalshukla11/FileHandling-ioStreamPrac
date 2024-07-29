import java.io.File;

class FileDeleterExample{
    public static void main(String args[])
    {
        //specify the directory

       // String fileDirectory= "C:\\Users\\acer\\Desktop\\FileHandlingTest";

       // File directory= new File("C:\\Users\\acer\\Desktop\\FileHandlingTest");
       File directory = new File("data.csv");
        
        //create a file object for the directory 
       // File directory = new File(fileDirectory);

        //call the deleteFiles Method to delete all files and directories 
           DeleteFiles(directory);
    }

    public static void DeleteFiles(File file)
    {
        //check is the files or directory exists 
        if(!file.exists())
        {
            System.out.println("The specified files or directory does not exists: " + file.getAbsolutePath());
            return;
        }

        //if the file is a directory ,list its contents 

        if(file.isDirectory())
        {
            File[] files=file.listFiles();

            if(file!=null)
            {
                for(File f:files)
                {
                    //recursively delete files and directories 
                    DeleteFiles(f);
                }
            }
        }

        //delete the file or empty directory 
        if(file.delete())
        {
            System.out.println("Deleted: " + file.getAbsolutePath());

        }
        else{
            System.out.println("Failes to delete : " + file.getAbsolutePath());
        }
    }

}