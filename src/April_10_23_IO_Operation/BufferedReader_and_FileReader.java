package April_10_23_IO_Operation;

import java.io.*;

//How to use Buffered reader in a File reader
public class BufferedReader_and_FileReader {
    public static void main(String[] args) throws IOException {
        /*File dir1 = new File("CreateDirectory");
        File file = new File(dir1, "CreateFile");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while (line!=null)
        {
            System.out.println(line);
            line = br.readLine();
        }*/

        File dir1 = new File("CreateDirectory");
        File file = new File(dir1, "CreateFile");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while (line!=null)
        {
            System.out.println(line);
            line = br.readLine();
        }
    }
}
/*
Using a Buffered Reader will boost the performance. Can't use Buffered Reader individually
Using inbuilt classes no need to separate using "\n" for lines
In a Buffered Reader we can use inbuilt classes nextLine to read line by line
 */