package April_10_23_IO_Operation;

import java.io.File;
import java.io.IOException;

//More on File class
public class More_on_FileClass {
    public static void main(String[] args) throws IOException {
        /*File dir = new File("Local Directory");
        System.out.println(dir.exists());

        dir.mkdir();
        System.out.println("dir is referring to Local Directory: " + dir.exists());

        File file = new File(dir, "LocalDirectory");
        file.createNewFile();
        System.out.println("file is referring to LocalDirectory: " + file.isFile());*/


        int count = 0;
        File f = new File("Local Directory");
        String str[] = f.list();

        for (String name : str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println("No of files are : " + count);
    }
}
