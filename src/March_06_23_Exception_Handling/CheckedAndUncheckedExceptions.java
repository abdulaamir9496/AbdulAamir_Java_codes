package March_06_23_Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedAndUncheckedExceptions {
    public static void main(String[] args) throws IOException {
        int result = 7/0;      //Unchecked Exception: Error at Runtime
        // Compiler is not forcing to handle exception

        //What happens if we take input from the 'BufferedReader'?
        //Our aim doesn't be to learn BufferReader but to understand how it works.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();     //Checked Exception but Unhandled exception: java.io.IOException
        //Error at compile time: Compiler is forcing to handle exception
        //We have to handle the exception via 'try catch block' or else we can 'throw' the exception.
        //Good practice is to handle the 'exception.'

    }
}
