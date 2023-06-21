package Feb09_23_Encapsulation;

class Student1 {
    private int age;  //No issues when using in the same class
    private String name;  //No issues when using in the same class

    public void setData1(int age)   //use "name & age" for other class with the help of this method "setData"
    {
      /*instance variable*/  this.age = age;   //If both are with same name would result in "name-clash". 'local variable' & compiler is confused and
        // JVM (compiler) will give 1st preference to 'local variable'. We called it "SHADOWING PROBLEM"
        //we want local variable' to be set for 'instance variable'
    }

    public void setData2() {
        name = "USA";   //No issues when using in the same class
    }

    //what if I want different-different values for same data types
    //Here I created another 'method'

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class PrivateAndShadowing_Problem {
    public static void main(String[] args) {

        Student1 obj = new Student1();   //object created
        Student1 obj1 = new Student1();   //object1 created

        obj.setData1(20);
        obj.setData2();

        obj.show();

        obj1.setData1(22);
        obj1.setData2();

        obj1.show();
    }
}
