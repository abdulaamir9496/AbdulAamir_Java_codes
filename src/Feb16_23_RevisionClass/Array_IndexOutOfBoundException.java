package Feb16_23_RevisionClass;

public class Array_IndexOutOfBoundException {
    public static void main(String[] args) {

        int[] arr = new int[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        //If I try to go out of index values lets see what happens

        arr[3] = 40;
        //However in compile time it does not show anything. So, lets see what happens in run time?

        //we received an ERROR: Exception in thread "main" java.lang.
        // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    }
}
