package March_06_23_Exception_Handling;

public class Runtime_Error {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int result = a / b;
        System.out.println(result);
        System.out.println("Completed");
        //Here we don't have any SYNTACTICAL ERROR, and we don't have any LOGICAL ERROR. But here we have RUNTIME ERROR.
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //.Runtime_Error.main(Runtime_Error.java:8)

        //And also it is not printing word: COMPLETED. Because the application stopped running.
        //If we don't handle the exception as a programmer, the complete application will or might be closed.
        //Question: How to handle such Runtime Errors?
    }
}
