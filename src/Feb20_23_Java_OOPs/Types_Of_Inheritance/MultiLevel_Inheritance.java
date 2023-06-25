package Feb20_23_Java_OOPs.Types_Of_Inheritance;
class Demo1
{
    void disp()
    {
        System.out.println("Display written in demo1 class");
    }
}
class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}
//we can also increase the level by creating more classes as we want as per our requirement
public class MultiLevel_Inheritance {
    public static void main(String[] args) {

        Demo3 d = new Demo3();
        d.disp();

    }
}
