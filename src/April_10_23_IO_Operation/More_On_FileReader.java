package April_10_23_IO_Operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//More on File Reader: Here we will perform the operation to read data & get the o/p 'char by char'
public class More_On_FileReader {
    public static void main(String[] args) throws IOException {
        File dir1 = new File("CreateDirectory");
        File file = new File(dir1, "CreateFile");

        FileReader fr = new FileReader(file);

        char ch[] = new char[(int) file.length()];
        fr.read(ch);

        for (char data : ch)
        {
            System.out.println(data);
        }
    }
}
