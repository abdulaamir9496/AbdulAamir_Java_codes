package Feb27_23_InterfaceAndLambdaExpression;
//InnerClass of 3 types: member class, static class, & Anonymous class
 class Aa     //Non-static class  (requires object for using 'class Aa')
{     //ERROR: Modifier 'static' not allowed here. outerClass can't be used as static
    /*int age;
    String name;
    Address add;
    class Address   //member Inner class: no need to maintain many class so created Address class under class Aa
    {
        String city;
        String state;
        int pincode;
    }*/
    public void show()      //method belongs to 'Aa' class
    {
        System.out.println("in Show");
    }
    static class B     //static inner class  (not requires object for using 'class B')
    {   //Innerclass can be static. Non-Static InnerClass 'B' class is inside 'Aa' class
        public void display()      //method belongs to 'B' class
        {
            System.out.println("in Display");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Aa obj = new Aa();
        Aa.B obj1 = new Aa.B();

        obj.show();
        obj1.display();
    }
}
