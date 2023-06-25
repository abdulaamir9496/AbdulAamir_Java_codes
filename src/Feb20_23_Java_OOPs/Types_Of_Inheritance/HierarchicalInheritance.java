package Feb20_23_Java_OOPs.Types_Of_Inheritance;

class Animals
{
    void display()
    {
        System.out.println("A parent class can have any no.of child classes");
    }
}
class Tigers extends Animals
{

}
class Monkeys extends Animals
{

}
class Deer extends Animals
{

}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Tigers t = new Tigers();
        t.display();

        Monkeys m = new Monkeys();
        m.display();

        Deer d = new Deer();
        d.display();
    }
}
