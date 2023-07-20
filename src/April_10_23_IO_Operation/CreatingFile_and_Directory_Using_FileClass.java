package April_10_23_IO_Operation;

import java.io.File;
import java.io.IOException;

//Creating File and Directory Using File Class
public class CreatingFile_and_Directory_Using_FileClass {
    public static void main(String[] args) throws IOException {
        //Inbuilt File class will check if any file exists or not. If it exists, it will start referring to that File
        // If no file exists, It will not create another 'File' but just return 'false.'
        /*File file1= new File("LocalFile");
        System.out.println(file1.exists());     //false

        //For creating physical 'File'
        file1.createNewFile();      //throws IOException
        System.out.println(file1.exists());     //true*/


        /*Inbuilt File class will check if any 'Directory' exists or not. If it exists,
        it will start referring to that 'Directory' If no Directory exists, It will not create another 'Directory'
        but just return 'false.' For creating physical 'Directory'*/
        File Dir1 = new File("LocalDirectory");
        System.out.println(Dir1.exists());

        //For creating physical 'Directory'
        Dir1.mkdir();
        System.out.println(Dir1.exists());

    }
}
