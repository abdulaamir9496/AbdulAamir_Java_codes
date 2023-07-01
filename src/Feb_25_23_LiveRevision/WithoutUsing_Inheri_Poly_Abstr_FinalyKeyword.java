package Feb_25_23_LiveRevision;

import java.util.Scanner;

class Rectangle
{
    float length;
    float breath;
    float area;
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
    public void disp()
    {
        System.out.println("The area of rectangle: " + area);
    }

}
class Square
{
    float length;
    float area;

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
    public void disp()
    {
        System.out.println("The area of square is: " + area);
    }
}
class Circle {
    float radius;
    float area;

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
    public void disp()
    {
        System.out.println("The area of circle is: " + area);
    }
}
public class WithoutUsing_Inheri_Poly_Abstr_FinalyKeyword {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();     //Object class reference is same as child class type
        rec.input();      //Tightly coupled child class
        rec.compute();      //Tightly coupled child class
        rec.disp();      //Tightly coupled child class

        Square sq = new Square();      //Object class reference is same as child class type
        sq.input();      //Tightly coupled child class
        sq.compute();      //Tightly coupled child class
        sq.disp();      //Tightly coupled child class

        Circle cir = new Circle();      //Object class reference is same as child class type
        cir.input();      //Tightly coupled child class
        cir.compute();      //Tightly coupled child class
        cir.disp();      //Tightly coupled child class
    }
}
