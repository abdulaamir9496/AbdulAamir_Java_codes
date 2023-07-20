package April_10_23_IO_Operation;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Reading data from file to java using file reader
public class ReadingData_From_FileToJavaUsing_FileReader {
    public static void main(String[] args) throws IOException {
        //Defining File Directory:
        File dir1 = new File("CreateDirectory");
        File file = new File(dir1,"CreateFile");

        FileReader fr = new FileReader(file);     //Will read data 'char by char'
        int i = fr.read();

        System.out.println((char) i);

        while (i!= -1)
        {
            System.out.print(i + "------->");
            System.out.println((char) i);
            i = fr.read();
        }
    }
}
/*
How to read a java program from file data by using file reader class
For reading we have use FileReader.
FileReader will invoke 'file' to read the 'data,' character by character at a time.
 */