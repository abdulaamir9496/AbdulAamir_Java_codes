package April_10_23_IO_Operation;
//Writing data onto file using a file writer

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_Data_Onto_File_Using_FileWriter {
    public static void main(String[] args) throws IOException {
        //Creating Directory:
        File dir1 = new File("CreateDirectory");
        System.out.println(dir1.exists());
        dir1.mkdir();
        System.out.println(dir1.exists());

        //Creating File:
        File file = new File(dir1, "CreateFile");
        file.createNewFile();
        System.out.println(file.exists());

        //Performing file write operation:
        FileWriter fw = new FileWriter(file, true);  //If we don't want to remove old data, we have to use 'true.'
        fw.write("Now I can write something in this new file");  //Stores String value
        fw.write("\n");  //File writer will accept only 'String' and 'char' values
        fw.write(65);  //This number will store in file as per ASCII value
        fw.write("\n");
        fw.write(97);  //This number will store in file as per ASCII value
        fw.write("\n");
        fw.write('M');  //Stores character value
        fw.write("\n");
        char ch[] = {'A','R','R','A','Y'};
        fw.write(ch);
        fw.write("\n");

        //If we don't close/ flush, the data will not be written in the file. Recommended is to close it.
        fw.close();
        //fw.flush();

        //Performing file reading operation:
        System.out.println("Open CreateFile to read/ see the result");

    }
}
/*
File writing operation: How to write java's data inside a file. By using inbuilt class file writer
reading operation: How to read java's data from inside a file, By using inbuilt class file reader
 */