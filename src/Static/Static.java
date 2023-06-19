package Static;

public class Static {
    static int age;  //variable

    static //static method/ static block
    {
        age = 27; //initialize
        //Normal Method
        System.out.println("static block FIRST");
        System.out.println(age);
    }
    static void display()
    {
        System.out.println("static display method will execute after the main method when we call it");
    }
    public static void main(String[] args) {  //Main method
        System.out.println("Main Method SECOND");
        display();
    }
}
