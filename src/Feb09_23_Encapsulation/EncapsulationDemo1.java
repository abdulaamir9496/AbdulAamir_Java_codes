package Feb09_23_Encapsulation;

class Student {
    private int age;  //variable  (will be visible in same class)
    private String name;   //variable  (will be visible in same class)

    public void setData()  //method
    {
        age = 18;
        name = "Aamir";
    }

    public void show()   //method
    {
        System.out.println(name + " " + age);
    }
}

public class EncapsulationDemo1 {
    public static void main(String[] args) {

        Student obj = new Student();   //Outside main method, class objected created with empty default constructor
        //obj.name = "name";  //These variables are accessed directly from outside world
        //obj.age = 18;   //These variables are accessed directly from outside world
        obj.setData();
        obj.show();  //No one should access the data directly (How to hide then?)

        //But here data should be hidden, so we use "Private" for the variables

        //System.out.println(obj.age);  //Error: can't call as still it is in private

    }
}
