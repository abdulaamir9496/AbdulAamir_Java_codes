package March_06_23_Exception_Handling;

public class Logical_Error {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int result = num1 + num2;
        System.out.println("Addition is: " + result);
        //In logical error, we will write our code, and we get the output as well.
        // But what's the guarantee that our code's output is correct?
        //When we send to a client even what he knows whether the output is correct.
        //Ex: my medical reports are going to someone and some other persons reports are coming to me is a blunder in that medical app.
        //This is known as a logical error. It can be in int, String, float, double, char or in boolean type of data error's etc.,
        //That's why we do method testing or unit testing in development. Before deploying our code.
    }
}
