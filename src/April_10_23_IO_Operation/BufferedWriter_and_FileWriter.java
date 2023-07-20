package April_10_23_IO_Operation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Buffered writer and File writer: Here we will perform the operation to read the data & get the o/p 'altogether'
public class BufferedWriter_and_FileWriter {
    public static void main(String[] args) throws IOException {
        File dir1 = new File("CreateDirectory");
        File file = new File(dir1, "CreateFile");

        FileWriter fw = new FileWriter(file, true);   //if we don't want overriding method, we should use 'true'
        BufferedWriter bw = new BufferedWriter(fw);     //'BufferedWrite' is used to support and make more efficient 'FileWriter'

        bw.write("BufferWriter");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[] = {'j', 'a', 'v', 'a'};
        bw.write(ch);

        bw.flush();    //By using this, we make sure the 100% the data is flushed into CreateFile
        bw.close();     //Resources get closed to read all the data in 'CreateFile'

    }
}

/*
Using a Buffered writer will boost the performance
Using inbuilt classes no need to separate using "\n" for lines
In a Bufferd writer we can use inbuilt classes nextLine
 */
