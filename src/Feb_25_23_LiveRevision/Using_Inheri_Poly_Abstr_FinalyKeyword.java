package Feb_25_23_LiveRevision;
import java.util.Scanner;
abstract class Shape
{
    float area;
    abstract public void input();
    abstract public void compute();
    public void display()
    {
        System.out.println("The area is : " + area);
    }
}
class Rectangle1 extends Shape
{
    float length;
    float breath;
    public void input()
    {
        System.out.println("Calculation of rectangle app: ");
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the length of rectangle");
        length = scn.nextFloat();
        System.out.println("please enter the breath of rectangle");
        breath = scn.nextFloat();
    }
    public void compute()
    {
        area = length * breath;
    }
}
class Square1 extends Shape
{
    float length;
    public void input()
    {
        System.out.println("Calculation of square app: ");
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the length of square");
        length = scn.nextFloat();
    }
    public void compute()
    {
        area = length * length;
    }
}
class Circle1 extends Shape
{
    float radius;
    public void input() {
        System.out.println("Calculation of circle app: ");
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the radius of circle");
        radius = scn.nextFloat();
    }
    public void compute()
    {
        area = 3.1f *  radius * radius;
    }
}
    class Geometry {      //To achieve polymorphism with parent type reference
        public void poly(Shape ref) {      //Parent type reference
            ref.input();      //loose coupled child class objects
            ref.compute();      //loose coupled child class objects
            ref.display();      //loose coupled child class objects
        }
    }
    public class Using_Inheri_Poly_Abstr_FinalyKeyword {
        public static void main(String[] args) {

            Rectangle1 rec = new Rectangle1();
            Square1 sq = new Square1();
            Circle1 c = new Circle1();

            Geometry g = new Geometry();
            g.poly(rec);
            g.poly(sq);
            g.poly(c);
        }
    }
