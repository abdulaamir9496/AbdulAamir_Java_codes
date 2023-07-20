package April_10_23_IO_Operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Write operation with 'PrintWriter'
public class WriteOperationWith_PrintWriter {
    public static void main(String[] args) throws IOException {
        File dir1 = new File("CreateDirectory");
        File file = new File(dir1, "CreateFile");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.print("PrintWriter");
        pw.println('P');
        pw.println(500);
        pw.println(100.00);
        pw.println(false);

        //We can close both 'FileWriter & PrintWriter,' It is also enough to close only 'PrintWriter'
        pw.close();
    }
}
/*
As we cannot use int, float, double or boolean in 'FileWriter' or by 'BufferedWriter'
In order use above data types, we have to use 'PrintWriter' alongside with 'FileWriter'
 */