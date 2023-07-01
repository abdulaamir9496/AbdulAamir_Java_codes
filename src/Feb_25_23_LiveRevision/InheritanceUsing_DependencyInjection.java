package Feb_25_23_LiveRevision;

class Student     //Target Class
{
    private Heart h;      //Now object comes in 'h' which is class address
    public Student(Heart h)      //Accepting of Dependent class(Heart h)'s reference in Student Constructor
    {
        this.h = h;
    }
    //One more example:
    public void setH(Heart h)
    {
        this.h = h;
    }
    public void call()      //method
    {
        h.heartBeat();     //Using that reference 'h' and calling the c.class method(heartBeat()).
        // This is known as "Dependency Injection".
    }
}
class Heart      //Dependent Class (Child Class)
{
    public void heartBeat()      //Method of Dependent class
    {
        System.out.println("Heart is important");
    }
}
public class InheritanceUsing_DependencyInjection {
    public static void main(String[] args) {

        Heart h = new Heart();     //Object of a child class(Dependency class)

        Student stu = new Student(h);  //c.class address passing in p.class constructor
        //Constructor Injection: In simple terms injecting the dependency object(c.obj)
        // to the target class(p.class) using constructor.
        stu.setH(h);     //Injected c.class obj is known as setter Injection.
        //One object injection another object is known as Dependent Injection.
    }
}
